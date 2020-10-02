package pattern;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row =1, nst=n;
		while(row<=n){
			for(int cst=1;cst<=nst;cst++) {
			System.out.print("*");			
			}
		
			System.out.println();
			row++;
			nst--;
			
		}
	}

}
