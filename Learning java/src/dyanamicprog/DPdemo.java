package dyanamicprog;

public class DPdemo {
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
		// TODO Auto-generated method stub
		int n=50;
		int [] strg = new int[n+1];
		startAlgo();
   System.out.println(fib(n));
   System.out.println("Fib Normal took time "+endAlgo()+" ms");
   startAlgo();
   System.out.println(fibRs(n,strg));
   System.out.println("Fib Recursive storage took time "+endAlgo()+" ms");
   startAlgo();
   System.out.println(fibIs(n));
   System.out.println("Fib Iterative storage took time "+endAlgo()+" ms");
	}
	public static int fib(int n) { // nth fibonacci number
		if(n==1) {
			return n;
		}
		if(n==0) {
			return n;
		}
		int frm1=fib(n-1);
		int frm2=fib(n-2);
		int fn = frm1+frm2;
		return fn;
	}
	
	public static int fibRs(int n,int [] strg) { // nth fibonacci number
		if(n==1) {
			return n;
		}
		if(n==0) {
			return n;
		}
		if(strg[n]!=0)
			return strg[n];
		int frm1=fibRs(n-1,strg);
		int frm2=fibRs(n-2,strg);
		int fn = frm1+frm2;
		strg[n]=fn;
		return fn;
	}
	public static int fibIs(int n) {
		int [] strg = new int [n+1];
		//seed
		strg[0]=0;
		strg[1]=1;
		for(int i=2;i<=n;i++) {
			strg[i]=strg[i-1]+strg[i-2];
		}
		return strg[n];
	}

}
