package pattern;
import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		int nst=3;
		int nsp=1;
		
		while(row<=n) {
			
			for(int cst=1;cst<=nst;cst++)
				System.out.print("*");
			
			for( int csp=1;csp<=nsp;csp++)
				System.out.print(" ");
			
			for(int cst=1;cst<=nst;cst++)
				System.out.print("*");
			
			System.out.println();
			if(row<=n/2) {
				nst--;
			     nsp=nsp+2;;
			}
			else {
				nst++;
			nsp=nsp-2;
			}
			row++;
			
		}
			
		
    

	}

}
