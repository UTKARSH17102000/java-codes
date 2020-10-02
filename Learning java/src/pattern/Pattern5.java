package pattern;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
    int row=1;
    int nst=5;
    int nsp=0;
    while(row<=n) {
    	for(int csp=1;csp<=nsp;csp++)
			System.out.print(" ");
		for(int cst=1;cst<=nst;cst++)
			System.out.print("*");
		
	System.out.println();
		nsp++;
		nst--;
		row++; 
    
    }
	}

}
