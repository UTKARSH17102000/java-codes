package pattern;
import java.util.Scanner;
public class Pattern2 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n =scn.nextInt();
			int row=1,nst=1;
			while(row<=n) {
			int cst=1;
				while(cst<=nst) {
					System.out.print("*");
					cst++;
				}
				System.out.println();
				row++;
				nst++;
			}
	}

}
