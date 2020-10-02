package recursion;

public class Recursionbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=5;
        pd(i);
        System.out.println("---------//----------");
        pdreverse(i);
        System.out.println("---------//----------");
        pdAll(i);
        System.out.println("---------//----------");
        pdBreak(i);
        System.out.println("---------//----------");
        int a=2;   
        int b=5;
         int c=power(a,b);
        System.out.println(c);
        System.out.println("---------//----------");
          c= Factorial(b);   
        System.out.println(c);
        System.out.println("---------//----------");
        int [] arr = {4,5,6,7,8,2,9,10};
        boolean f = issorted(arr,0);
        int l=8;
        System.out.println(f);
        System.out.println("---------//----------");
        int z = firstoccur(arr,l,0);
        System.out.println(z);
        System.out.println("---------//----------");
        printpattern(5,1,1);
        System.out.println("---------//----------");
        bubblesort(arr,0,arr.length-1);
        for(int j=0;j<arr.length;j++) {
        	System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("---------//----------");
        int [] drr = {2,4,3,5,4,2,8,6};
        int [] k = allindices(drr,0,4,0);
       
        for (int j=0;j<k.length;j++) {
        	System.out.print(k[j]+" ");
        }
        System.out.println();
        System.out.println("---------//----------");
        int q = lastIndex(drr,4,0);
        System.out.println(q);
        System.out.println("---------//----------");
        toh(3,"src","dest","helper");
	}

	public static void pd(int i) {
		if(i==0)
			return ;
		 System.out.println(i);
		 pd(i-1);
	}
	public static void pdreverse(int i) {
		if(i==0)
			return ;
		 pdreverse(i-1);
		 System.out.println(i);
	}
	public static void pdAll(int i) {
		if(i==0)
			return ;
		System.out.println(i);
		pdAll(i-1); 
		 System.out.println(i);
	}
	public static void pdBreak(int i) {
		if(i==0)
			return ;
		if(i%2==1) {
		System.out.println(i);}
		pdBreak(i-1);
		if(i%2==0) {
		 System.out.println(i);}
	}
	public static int power(int a,int b) {
		if(b==0)
			return 1;
		int d= power(a,b-1);
		int p = a*d;
		
		return p;
		
	}
	public static int  Factorial(int n) {
		if(n==1) {
			return 1;
		}
		int a= Factorial(n-1);
		int b = n*a;
		
		return b;
		
	}
	
	public static boolean issorted(int [] arr , int si) {
		if(si== arr.length-1) {
			return true ;
		}
		
		if(arr[si]>arr[si+1]) {
			return false;
		}else {
		boolean restans = issorted(arr,si+1);
		return restans;
		}
	
	}
	public static int firstoccur(int [] arr , int n,int si) {
		
		if(si == arr.length) {
			return -1;
		}
		
		if(arr[si] == n)
			return si;
		else {
			int d = firstoccur(arr,n,si+1);
			return d;
		}
			
	}
	public static void printpattern(int n,int row,int col) {
		if(row>n)
			return;
		if(col>row) {
			System.out.println();
		   printpattern(n,row+1,1);
		   return;
		}
		System.out.print("* ");
		printpattern(n,row,col+1);
		
	}
	public static void bubblesort(int [] arr,int si,int li) {
		if(li==0)
			return ;
		if(si == li) {
			bubblesort(arr,0,li-1);
			return;
		}
		if(arr[si]> arr[si+1]) {
			int temp = arr[si];
			arr[si] = arr[si+1];
			arr[si+1] = temp; 
		}
		bubblesort(arr,si+1,li);
	}
	
	public static int [] allindices(int [] arr , int si,int data , int count) {

		if(si == arr.length) {
			int [] base = new int [count];
			return base;
		}
		int [] indices = null;
		
		if(arr[si] == data) {
		indices= allindices(arr,si+1,data,count+1);
		}else {
		 indices= allindices(arr,si+1,data,count);
		}
		
		if(arr[si] == data ) {
			indices[count] = si;
		}
		return indices;
	}
	
	public static int lastIndex(int [] arr , int data,int si) {
		if(si == arr.length)
			return -1;
		int index = lastIndex(arr,data,si+1);
		if(index==-1) {
				if(arr[si] == data)
			return si;
		else
			return -1;
		}else
		return index;
			 
	}
	public static void toh(int n , String src , String dest,String helper) {
		if(n==0) {
			return;
		}
		toh(n-1,src,helper,dest);
		System.out.println("move "+n+" disc from "+src+" to "+dest);
		toh(n-1,helper,dest,src);
	}
	
}
