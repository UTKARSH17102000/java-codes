package dynamicprogramming2;

import java.util.Arrays;

public class MazePathDiagnal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int [][] strg = new int [n+1][n+1];
		System.out.println(MPDrecursion(0,0,n,n));
		System.out.println(MPDTD(0,0,n,n,strg));
		System.out.println(MPDBU(n,n));
		System.out.println(MPDBUSE(n,n));

	}
   
	
	 public static int MPDrecursion(int cr , int cc , int er , int ec) {
		  if (cr == er && cc== ec) {
			  return 1;
		  }
		  
		  if (cr > er || cc> ec) {
			  return 0;
		  }
		  int ch = MPDrecursion( cr ,  cc+1 ,  er , ec);
		  int cv = MPDrecursion( cr+1 ,  cc ,  er , ec);
		  int cd = MPDrecursion( cr+1 ,  cc+1 ,  er , ec);
	      return ch + cv + cd;
	  }
	 
	 public static int MPDTD(int cr , int cc , int er , int ec, int [][] strg) {
		  if (cr == er && cc== ec) {
			  return 1;
		  }
		  
		  if (cr > er || cc> ec) {
			  return 0;
		  }
		  
		  int ch = MPDTD( cr ,  cc+1 ,  er , ec,strg);
		  int cv = MPDTD( cr+1 ,  cc ,  er , ec,strg);
		  int cd = MPDTD( cr+1 ,  cc+1 ,  er , ec,strg);
		  strg[cr][cc]=ch +cv +cd;
	      return strg[cr][cc];
	  }

	 public static int MPDBU( int er , int ec) {
		  int [][] strg = new int [er+2][ec+2];
		  
		  for(int row = er;row>=0;row--) {
			for(int col =ec;col>=0;col--) {
				if(row == er && col == ec) {
					strg[row][col]=1;
				}else {
					strg[row][col] = strg[row][col+1] + strg[row+1][col]+strg[row+1][col+1];
				}
			}
		  }
		  return strg[0][0];
	  }
	 
	  public static int MPDBUSE( int er , int ec) {
		  int [] strg = new int [ec+1];
		  Arrays.fill(strg, 1);
		  int diag=0;
		  for(int slide = er-1;slide>=0;slide--) {
			  for(int col = ec;col>=0;col--)
			  {
				  if(col == ec) {
					  strg[col]=1;
					  diag=1;
				  }else {
					  
					  int val= strg[col] +strg[col+1]+diag;
					  diag=strg[col];
					  strg[col]=val;
				  }
			  }
		  }
		  
		  return strg[0];
	  }
	 

}

