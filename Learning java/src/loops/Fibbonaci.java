package loops;

import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		   int n = scn.nextInt();
		   int i,x =0,y=1,z=0;
		   for(i=1;i<n;i++)
		   {
			   z=x+y;
			   x=y;
			   y=z;
			   System.out.println(x);
		   }
		   
				   
			

	}

}
