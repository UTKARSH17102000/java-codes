package backtracking1;

public class QueenCombinationBoxRespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuenCombinationBox(new boolean [4],0,0,2,"");
		
		CoinChangeCoinRespect(new int [] {1,2,3} ,0 , 4,"" );
		
		
		QuenCombinationRespect2D(new boolean [2][2],0,0,0,2,"");
		
		System.out.println("******************");
		QuenKill(new boolean [3][4],0,0,0,3,"");
//		boolean [][] board = new boolean[4][4];
		System.out.println("******************");
		NQueen(new boolean [4][4],0,0,0,4,"");
		
		Nknights(new boolean [3][3],0,0,0,3,"");
		
		
		NQueen2(new boolean [4][4],0,0,4,"");
		
		
		KQueen(new boolean [4][4],0,0,3,"");
		
		
		 int [][] maze = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
		 BlockedMaze(maze , 0 ,0 ,"",new boolean [maze.length][maze[0].length]);
	}
	
	public static void QuenCombinationBox(boolean [] board,int col , int qsf , int tq , String ans) {
		// positive base case
		if(qsf == tq) {
			System.out.println(ans);
		   return ;
		}
		// negetive base case
		if(col>= board.length)
			return;
		// placed
		board[col] = true;
		
		 QuenCombinationBox(board,col+1,qsf+1,tq,ans+" b"+ col);
		 
		 board[col] = false;
		 
		 QuenCombinationBox(board,col+1,qsf,tq,ans);
		 
		 
	 
		 
		
	}
	
	public static void CoinChangeCoinRespect(int [] denom , int vidx , int amount , String ans ) {
		
		if(amount == 0) {
			System.out.println(ans);
			return ;
		}
		if(amount <0 || vidx == denom.length)
			return ;
		
		
		CoinChangeCoinRespect(denom ,vidx , amount-denom[vidx] , ans+denom[vidx] );
		
		CoinChangeCoinRespect(denom ,vidx+1 , amount , ans );
	}
	
	
	public static void QuenCombinationRespect2D(boolean [][] board,int row,int col , int qsf , int tq , String ans) {
		// positive base case
		if(qsf == tq) {
			System.out.println(ans);
		   return ;
		}
		// manually change
		if(col == board[0].length) {
			row++;
			col=0;
		}
		// negative base case
		if(row == board.length)
			return ;
			
		// placed
		board[row][col] = true;
		
		QuenCombinationRespect2D(board,row,col+1,qsf+1,tq,ans+" {"+ row +"-"+col+"}");
		 
		 board[row][col] = false;
		 
		 QuenCombinationRespect2D(board,row,col+1,qsf,tq,ans);
		 
		
	}
	
	
	

	public static void QuenKill(boolean [][] board,int row,int col , int qsf , int tq , String ans) {
		// positive base case
		if(qsf == tq) {
			System.out.println(ans);
		   return ;
		}
		// manually change
		if(col == board[0].length) {
			row++;
			col=0;
		}
		// negative base case
		if(row == board.length)
			return ;
			if(isitsafe(board,row,col)) {
		// placed
		board[row][col] = true;
		
		QuenKill(board,row,col+1,qsf+1,tq,ans+" {"+ row +"-"+col+"}");
		 
		 board[row][col] = false;
			}
		 
		 QuenKill(board,row,col+1,qsf,tq,ans);
		 
		
	}

	
	public static boolean isitsafe(boolean [][] board,int row,int col) {
		int r = row-1;
		int c = col;
		
		while(r>=0) {
			if(board[r][c])
			{
				return false;
			}
			r--;
		}
		//horizontally left
		 r = row;
		 c = col-1;
		
		while(c>=0) {
			if(board[r][c])
				return false;
			
			c--;
		}
		// diagonally left
		r=row-1;
		c=col-1;
		while(r>=0 && c>=0) {
			if(board[r][c])
				return false;
	          
			r--;
			c--;
		
		}
		
		// diagonally left
				r=row-1;
				c=col+1;
				while(r>=0 && c<board[0].length) {
					if(board[r][c])
						return false;
			          
					r--;
					c++;
				
				}
		return true;
	}
	
	
	public static void NQueen(boolean [][] board,int row,int col , int qsf , int tq , String ans) {
		// positive base case
		if(qsf == tq) {
			System.out.println(ans);
		   return ;
		}
		// manually change
		if(col == board[0].length) {
			row++;
			col=0;
		}
		// negative base case
		if(row == board.length)
			return ;
			if(isitsafe(board,row,col)) {
		// placed
		board[row][col] = true;
		
		NQueen(board,row+1,0,qsf+1,tq,ans+" {"+ row +"-"+col+"}");
		 
		 board[row][col] = false;
			}
		 
			NQueen(board,row,col+1,qsf,tq,ans);
		 
		
	}
	
	
	public static void Nknights(boolean [][] board,int row ,int col ,int kpsf,int tk , String ans) {
		
		if(kpsf == tk )
		{
			System.out.println(ans);
			return;
		}
		
		
		if(col>=board[0].length)
		{
			row++;
			col=0;
		}
		
		if(row == board.length)
			return;
		//place
		if(isitsafeknights(board,row,col)) {
		board[row][col]=true;
		Nknights(board,row,col+1,kpsf +1,tk,ans+"{"+ row +"-"+ col +"}");
		board[row][col]=false;
		}		
		// not placed
		Nknights(board,row,col+1,kpsf,tk,ans);
	
	}
	
	
	public static boolean isitsafeknights(boolean [][] board ,int  row ,int  col) {
		int [] rowarr= {-1,-2,-2,-1};
		int [] colarr= {2,1,-1,-2};
		
		for(int i=0;i< 4;i++) {
			int r = row +rowarr[i];
			int c = col +colarr[i];
			
			if(r>=0 && r<board.length && c>=0 && c<board[0].length) {
				if(board[r][c]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void NQueen2(boolean [][] board ,int row ,int qpsf,int tq ,String ans) {
	if(qpsf == tq )	{
		System.out.println(ans);
		return ;
	}
	if(row == board.length)
		return;
	
	
	for(int col =0;col<board[0].length;col++) {
		
		if(isitsafe(board,row,col)) {
		board[row][col]=true;
		NQueen2(board,row+1,qpsf+1,tq,ans+" {"+ row +"-"+col+"}");
		board[row][col]=false;
		}
	}
	
	}
	
	
	
	public static void KQueen(boolean [][] board ,int row ,int qpsf,int tq ,String ans) {
	if(qpsf == tq )	{
		System.out.println(ans);
		return ;
	}
	if(row == board.length)
		return;
	
	
	for(int col =0;col<board[0].length;col++) {
		
		if(isitsafe(board,row,col)) {
		board[row][col]=true;
		KQueen(board,row+1,qpsf+1,tq,ans+" {"+ row +"-"+col+"}");
		board[row][col]=false;
		}
	}
	
	KQueen(board,row+1,qpsf,tq,ans);
	
	}
	
	
	
	public static void BlockedMaze(int [][] maze , int row , int col , String ans,boolean [][] visited) {
		if(row == maze.length-1 && col == maze[0].length-1)
		{
			System.out.println(ans);
			return;
		}
		if(row == -1 || row ==  maze.length || col == -1 || col == maze[0].length || maze[row][ col]== 1 || visited[row][col]) {
			return;			
		}
		
		visited[row][col]=true;
		// top 
		BlockedMaze(maze ,  row-1 ,  col ,  ans+"T",visited);
		// down
		BlockedMaze(maze ,  row+1 ,  col ,  ans+"D",visited);
		//left
		BlockedMaze(maze ,  row ,  col-1 ,  ans+"L",visited);
		// right
		BlockedMaze(maze ,  row ,  col+1 ,  ans+"R",visited);
		
		visited[row][col]=false;
	} 
	
	
}