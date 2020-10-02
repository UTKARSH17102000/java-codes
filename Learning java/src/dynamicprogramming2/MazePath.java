package dynamicprogramming2;

import java.util.Arrays;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=2;
     int [][] strg = new int [n+1][n+1];
     System.out.println(MPrecursion(0,0,n,n));
     System.out.println(MPTD(0,0,n,n,strg));
     System.out.println(MPBU(0,0,n,n));
     System.out.println(MPBUSE(n,n));
	}
   
	  public static int MPrecursion(int cr , int cc , int er , int ec) {
		  if (cr == er && cc== ec) {
			  return 1;
		  }
		  
		  if (cr > er || cc> ec) {
			  return 0;
		  }
		  int ch = MPrecursion( cr ,  cc+1 ,  er , ec);
		  int cv = MPrecursion( cr+1 ,  cc ,  er , ec);
		  
	      return ch + cv ;
	  }
	  // TC :O(er*ec) SC : O(n)
	  public static int MPTD(int cr , int cc , int er , int ec,int [][] strg) {
		  if (cr == er && cc== ec) {
			  return 1;
		  }
		  
		  if (cr > er || cc> ec) {
			  return 0;
		  }
		  if(strg[cr][cc]!=0)
			  return strg[cr][cc];
		  int ch = MPTD( cr ,  cc+1 ,  er , ec,strg);
		  int cv = MPTD( cr+1 ,  cc ,  er , ec,strg);
		  strg[cr][cc]=ch+cv;
		  
	      return strg[cr][cc] ;
	  }
	  
	  public static int MPBU(int cr , int cc , int er , int ec) {
		  int [][] strg = new int [er+2][ec+2];
		  
		  for(int row = er;row>=0;row--) {
			for(int col =ec;col>=0;col--) {
				if(row == er && col == ec) {
					strg[row][col]=1;
				}else {
					strg[row][col] = strg[row][col+1] + strg[row+1][col];
				}
			}
		  }
		  return strg[0][0];
	  }
	  
	  public static int MPBUSE( int er , int ec) {
		  int [] strg = new int [ec+1];
		  Arrays.fill(strg, 1);
		  for(int slide = er-1;slide>=0;slide--) {
			  for(int col = ec;col>=0;col--)
			  {
				  if(col == ec)
					  strg[col]=1;
				  else
					  strg[col]= strg[col] +strg[col+1];
			  }
		  }
		  
		  return strg[0];
	  }
}
