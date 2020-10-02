package stacks.overloading;

public class FxnOverLloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(sum(2,3));// overloading does not depend upon return type 
  System.out.println(sum(2,3,4));
  System.out.println(sum(2.1,3));
  System.out.println(sum(3.2,"hello"));
  System.out.println(sum(2,3,4,5,6,7));
  System.out.println(sum("hello",2,3,4,5,6,7));
	}
	public static int sum (int a,int b)
	{
		return a+b;
	}
	
	public static int sum (int a,int b,int c)
	{
		return a+b+c;
	}
	public static double sum (double a,double b)
	{
		return a+b;
	}
	public static double sum (double a,String b)
	{
		return a;
	}
	
	public static int sum (int... a) { // variable arguments is given the last priority
		                               // their is only one  variable arguments
		                               // always variable argument is kept at last position in function
		int sum =0 ;
		for(int val : a)
		 sum += val;
		return sum;
		
	}
	public static int sum (String b, int... a) { 
        int sum =0 ;
            for(int val : a)
             sum += val;
              return sum;

}
	

}


