package dynamicprogramming2; 

public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [] arr = {2,3,5,1,4};
  System.out.println(WPrecursion(arr,0,arr.length-1,1));
  System.out.println(WPTD(arr,0,arr.length-1,new int [arr.length][arr.length]));
  
  System.out.println(WPBU(arr));
	}
	// TC : 2^n exponential
	public static int WPrecursion(int [] arr , int si,int ei,int yr) {
	
		if(si == ei)
			return arr[si]*yr;
		
		int start =	WPrecursion(arr,si+1,ei,yr+1) +arr[si]*yr;
	int end =	WPrecursion(arr,si,ei-1,yr+1) +arr[ei]*yr;
	
	int ans = Math.max(start, end);
	
	return ans;
	}
	
	public static int WPTD(int [] arr , int si,int ei,int[][]  strg) {
		int yr=arr.length -(ei-si+1)+1;
		if(si == ei)
			return arr[si]*yr;
		if(strg[si][ei]!=0)
			return strg[si][ei];
		
	int start =	WPTD(arr,si+1,ei,strg) +arr[si]*yr;
	int end   = WPTD(arr,si,ei-1,strg) +arr[ei]*yr;
	
	int ans = Math.max(start, end);
	strg[si][ei]=ans;
	return ans;
	}
	
	public static int WPBU(int [] arr) {
		
		int n = arr.length;
	   int [][] strg = new int [n][n];
	   
	   for(int slide =0;slide<=n;slide++) {
		   for(int si=0;si<=n-slide-1;si++) {
			   int ei = si +slide;
			   
			   
			   int yr=arr.length -(ei-si+1)+1;
				if(si == ei) {
					strg[si][ei] = arr[si]*yr;
				}else {
				
			int start =	strg[si+1][ei] +arr[si]*yr;
			int end   = strg[si][ei-1] +arr[ei]*yr;
			
			int ans = Math.max(start, end);
			strg[si][ei]=ans;
			   
				}
		   }
	   }
	return strg[0][n-1];
	}

}
