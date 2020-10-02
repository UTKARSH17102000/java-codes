package dyanamicprog;
 
public class Countboardpath {
	public static long start;
	public static long end;
	
	public static void startAlgo() {
		start=System.currentTimeMillis();
				
	}
	public static long endAlgo() {
		end = System.currentTimeMillis();
		return  end-start;
	}

	public static void main(String[] args) {
		
		int n=30;
		int [] strg = new int [n];
		// TODO Auto-generated method stub
		    startAlgo();
		   System.out.println(cbp(n,0));
		   System.out.println("CBP Normal took time "+endAlgo()+" ms");
		   startAlgo();
		   System.out.println(cbpRs(n,0,strg));
		   System.out.println("CBPRS  took time "+endAlgo()+" ms");
		   startAlgo();
		   System.out.println(cbpIs(n,0));
		   System.out.println("CBPIS  took time "+endAlgo()+" ms");
	}
	public static int cbp(int end , int cur) {
		if(end == cur)
			return 1;
		if(cur>end)
			return 0;
		
		int count =0;
		for(int dice =1;dice<=6;dice++) {
			count =count+cbp(end,cur+dice);
		}
		return count;
	}
	
	public static int cbpRs(int end , int cur,int [] strg) {
		if(end == cur)
			return 1;
		if(cur>end)
			return 0;
		if(strg[cur]!=0)
			return strg[cur];
		int count =0;
		for(int dice =1;dice<=6;dice++) {
			count =count+cbpRs(end,cur+dice,strg);
		}
		strg[cur]=count;
		return count;
	}
	
	public static int cbpIs(int end ,int cur) {
		int [] strg = new int [end+1];
		//seed
		strg[end]=1;
		for(int i=end-1;i>=0;i--) {
			int count=0;
			for(int dice =1;dice <=6 && dice+i<strg.length;dice++) {
	                count =count+strg[dice+i];			
			}
			strg[i]=count;
			
		}
		return strg[cur];
	
	}

}
 