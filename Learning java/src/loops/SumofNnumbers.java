package loops;

import java.util.Scanner;

public class SumofNnumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=1,a=0;
		for(i=1;i<=n;i++)
		{
	        a=a+i;
			
		}
		System.out.println(a);
		

	}

}
