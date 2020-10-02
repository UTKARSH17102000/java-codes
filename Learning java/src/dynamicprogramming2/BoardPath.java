package dynamicprogramming2;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int [] strg = new int [n];
        System.out.println(BPrecursion(n,0 ));
        System.out.println(BPTD(n,0,strg ));
        System.out.println(BPBU(n));
        System.out.println(BPBUSE(n));
	}
	public static int BPrecursion(int end , int cur) {
		if(end == cur)
			return 1;
		if(cur>end)
			return 0;
		
		int count =0;
		for(int dice =1;dice<=6;dice++) {
			count =count+BPrecursion(end,cur+dice);
		}
		return count;
	}

	public static int BPTD(int end , int cur,int [] strg) {
		if(end == cur)
			return 1;
		if(cur>end)
			return 0;
		if(strg[cur]!=0)
			return strg[cur];
		
		int count =0;
		for(int dice =1;dice<=6;dice++) {
			count =count+BPTD(end,cur+dice,strg);
		}
		strg[cur]=count;
		return count;
	}
	
	public static int BPBU(int end) {
		int [] strg = new int [end+6];
		//seed
		strg[end]=1;
		for(int i=end-1;i>=0;i--) {
			int count=0;
			for(int dice =1;dice <=6 && dice+i<strg.length;dice++) {
	                count =count+strg[dice+i];			
			}
			strg[i]=count;
			
		}
		return strg[0];
	
	}

	public static int BPBUSE(int end) {
		int [] strg = new int [6];
		strg[0]=1;
		
		for(int slide =1;slide<=end;slide++) {
			int sum = strg[0]+strg[1]+strg[2]+strg[3]+strg[4]+strg[5];
			strg[5]=strg[4];
			strg[4]=strg[3];
			strg[3]=strg[2];
			strg[2]=strg[1];
			strg[1]=strg[0];
			strg[0]=sum;
		}
		
		return strg[0];
	}
	
	
}


 