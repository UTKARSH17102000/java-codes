package dynamicprogramming2; 

public class LcsLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1 ="abcd";
 String s2 ="agcfd";
 System.out.println(LCSrecursion(s1,s2));
 System.out.println(LCSrecursionVIDX(s1,s2,0,0));

 int [][] strg = new int [s1.length()][s2.length()];
  System.out.println(LCSTD(s1,s2,0,0,strg));
  System.out.println(LCSBU(s1,s2));
		
	}
	
	public static int LCSrecursion(String s1,String s2) {
		if(s1.length() ==0 || s2.length()==0)
			return 0;
		
		char ch1 = s1.charAt(0);
		
		char ch2 = s2.charAt(0);
		
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		
		int ans=0;
		
		if(ch1 == ch2) {
			ans= LCSrecursion(ros1,ros2)+1;		
			}else {
				int o1 = LCSrecursion(s1,ros2);
				int o2 = LCSrecursion(ros1,s2);
				ans=Math.max(o1, o2);
			}
		return ans;
	}
	
	public static int LCSrecursionVIDX(String s1,String s2,int vidx1,int vidx2) {
		if(s1.length() ==vidx1 || s2.length()==vidx2)
			return 0;
		
		char ch1 = s1.charAt(vidx1);
		
		char ch2 = s2.charAt(vidx2);
		
	
		
		int ans=0;
		
		if(ch1 == ch2) {
			ans= LCSrecursionVIDX(s1,s2,vidx1+1,vidx2+1)+1;		
			}else {
				int o1 = LCSrecursionVIDX(s1,s2,vidx1,vidx2+1);
				int o2 = LCSrecursionVIDX(s1,s2,vidx1+1,vidx2);
				ans=Math.max(o1, o2);
			}
		return ans;
	}

	
	
	
	public static int LCSTD(String s1,String s2,int vidx1,int vidx2,int [][]strg) {
		if(s1.length() ==vidx1 || s2.length()==vidx2)
			return 0;
		if(strg[vidx1][vidx2] !=0)
			return strg[vidx1][vidx2];
		
		char ch1 = s1.charAt(vidx1);
		
		char ch2 = s2.charAt(vidx2);
		
	
		
		int ans=0;
		
		if(ch1 == ch2) {
			ans= LCSTD(s1,s2,vidx1+1,vidx2+1,strg)+1;		
			}else {
				int o1 = LCSTD(s1,s2,vidx1,vidx2+1,strg);
				int o2 = LCSTD(s1,s2,vidx1+1,vidx2,strg);
				ans=Math.max(o1, o2);
			}
		strg[vidx1][vidx2]=ans;
		return strg[vidx1][vidx2];
	}
	 // TC :O(m*n)
	public static int LCSBU(String s1,String s2) {
		int [][] strg= new int [s1.length()+1][s2.length()+1];
		// seed
	//	strg[s1.length()][s2.length()] = 0;
		for(int i=s1.length()-1;i>=0;i--) {
			for(int j=s2.length()-1;j>=0;j--) {
				if(s1.charAt(i)== s2.charAt(j))
					strg[i][j]=strg[i+1][j+1]+1;
				else {
					int o1= strg[i][j+1];
					int o2= strg[i+1][j];
					
					strg[i][j]=Math.max(o1, o2);
				}
			}
		}
	return strg[0][0];
	}
	
}
  