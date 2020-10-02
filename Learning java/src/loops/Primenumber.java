package loops;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a=2;
		boolean flag=true;
		while(a<=n-1){
			if(n%a==0)
				flag=false;
			a++;
						
		}
		if(flag==false)
			System.out.println(" not a primre no.");
		else
			System.out.println("prime no. ");

	}

}
