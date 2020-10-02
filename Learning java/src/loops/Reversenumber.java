package loops;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a=0,i,x;
		for(i=0;n!=0;)
		{
			x=n%10;
			a=a*10+ x;
			n=n/10;
		}
		System.out.println(a);
		

	}

}
