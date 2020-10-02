package recursionprint;

public class RecursionPrintQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   boolean [][] board  =new boolean[4][4];
    System.out.println(countNQueens(board,0));
    System.out.println("-----------------------");
    PrintNQueens(board,0,"");
    System.out.println("-----------------------");
    System.out.println(countMazePath(0,0,2,2));
    System.out.println("-----------------------");
    PrintMazePath(0,0,2,2,",");
    System.out.println("-----------------------");
    System.out.println(countBoardPath(0,10));
    System.out.println("-----------------------");
    PrintBoardPath(0,10,"");
    System.out.println("-----------------------");
    PrintPerm("cab","");
    System.out.println("-----------------------");
    PrintsubSequence("abc","");
	}
  public static int countNQueens(boolean [][] board,int row) {
	  if(row ==board.length) {
		  return 1;
	  }
	  int count =0;
	  for(int col = 0;col<board[row].length;col++) {
		  if(isItSafe(board,row,col)) {
			  board[row][col] = true;
			  count=count+countNQueens(board,row+1);
			  board[row][col] = false;
		  }
	  }
	  return count;
  }
  
  public static void PrintNQueens(boolean [][] board,int row,String result) {
	  if(row ==board.length) {
		  System.out.println(result);
		  return ;
	  }
	  int count =0;
	  for(int col = 0;col<board[row].length;col++) {
		  if(isItSafe(board,row,col)) {
			  board[row][col] = true;
			  PrintNQueens(board,row+1,result+"{"+(row+1+"-"+(col+1)+"}"+";"));
			  board[row][col] = false;
		  }
	  }
	  
  }
  
  public static boolean isItSafe(boolean [][] board,int row,int col) {
	  int i,j;
	  for( i=row;i>=0;i--) {
		  if(board[i][col]) {
			  return false;
		  }
	  }
	  for( i=row,j=col;i>=0 && j>=0;i--,j--) {
		  if(board[i][j]) {
			  return false;
			  
		  }
	  }
	  for( i=row,j=col;i>=0 && j<board.length;i--,j++) {
		  if(board[i][j]) {
			  return false;
			  
		  }
	  }
	  return true;
	  }
  
  public static int countMazePath(int cr , int cc , int er , int ec) {
	  if (cr == er && cc== ec) {
		  return 1;
	  }
	  
	  if (cr > er || cc> ec) {
		  return 0;
	  }
	  int ch = countMazePath( cr ,  cc+1 ,  er , ec);
	  int cv = countMazePath( cr+1 ,  cc ,  er , ec);
	  int cd = countMazePath( cr+1 ,  cc+1 ,  er , ec);
      return ch + cv + cd;
  }
  
  public static void  PrintMazePath(int cr , int cc , int er , int ec , String ans) {
	  if (cr == er && cc== ec) {
		  System.out.print(ans);
		  
	  }
	  
	  if (cr > er || cc> ec) {
		  return ;
	  }
	  PrintMazePath( cr ,  cc+1 ,  er , ec,ans +"H");
	   PrintMazePath( cr+1 ,  cc ,  er , ec,ans+"V");
	  PrintMazePath( cr+1 ,  cc+1 ,er , ec,ans +"D");
      
  }
  public static int countBoardPath(int curr,int end) {
	  if(curr == end) {
		  return 1;
	  }
	  if(curr>end) {
		  return 0;
	  }
	  
	  int count =0;
	  for(int i=1;i<=6;i++) {
		  count = count +countBoardPath(curr+i,end);
	  }
	  return count;
  }
  public static void PrintBoardPath(int curr,int end,String ans) {
	  if(curr == end) {
		  System.out.println(ans);
		  
	  }
	  if(curr>end) {
		  return ;
	  }
	  
	  
	  for(int i=1;i<=6;i++) {
		  PrintBoardPath(curr+i,end,ans+i);
	  }
	 
  }
public static void PrintPerm(String ques,String ans) {
	if(ques.length() == 0) {
		System.out.println(ans);
		return;
	}
	for(int i=0;i<ques.length();i++) {
		char ch = ques.charAt(i);
		String roq = ques.substring(0,i) +ques.substring(i+1);
		PrintPerm(roq,ans+ch);
	}
}

   public static void PrintsubSequence(String str , String result) {
	   if(str.length() == 0) {
		   System.out.println(result);
		   return ;
	   }
	   char cc = str.charAt(0);
	   String ros = str.substring(1);
	   PrintsubSequence(ros,result);
	   PrintsubSequence(ros,result+cc);
	   
   }
  
}
