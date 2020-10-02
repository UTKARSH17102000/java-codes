package pattern;
import java.util.Scanner;
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row=1;
		int nst=1;
		int nsp=n-1;
		
		while(row<=n) {
			int val=1;	
			
	for(int csp =1;csp<=nsp;csp++)
					System.out.print(" ");
	
	for(int cst=1;cst<=nst;cst++) {
	
		System.out.print(val);
		 if(cst<=nst/2)
			 val++;
		 else
			 val--;
	}
	System.out.println();
    nst++;
	nst++;
	nsp=nsp-1;
	row++;
	}
	}

}
