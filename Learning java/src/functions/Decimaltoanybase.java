package functions;
import java.util.Scanner;
public class Decimaltoanybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("enter the base from  which you have to convert ");
		int e=s.nextInt();
		System.out.println("enter the base to which you have to convert ");
		int a=s.nextInt();
 //		int c=Anybasetodecimal(n,a); 
//		int d=Decimaltoanybase(n,a);
		int f=Anybasetoanybase(n,e,a);
		System.out.println(f);
	}
	public static int Anybasetodecimal(int n,int sb)
	{
		int sum=0,ans =0,multi=1,rem;
		while(n!=0)
		{
			rem=n%10;
			ans=ans+rem*multi;
			multi=multi*sb;
		     n=n/10;      
		}
		
		return ans;
		
	}
	public static int Decimaltoanybase(int n,int sb)
	{
		int sum=0,ans=0,multi=1,rem;
		while(n!=0)
		{
			rem=n%sb;
			ans=ans+rem*multi;
			multi=multi*10;
		     n=n/sb;      
		}
		
		return ans;	
	}
	
	public static int Anybasetoanybase(int n,int sb,int db)
	{
		int sum=0,ans=0,multi=1,rem;
		while(n!=0)
		{
			rem=n%db;
			ans=ans+rem*multi;
			multi=multi*sb;
		     n=n/db;      
		}
		
		return ans;	
	}

}
