package pattern;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
    
		int row=1;
		int nst=1;
		int nr=(2*n)-1;
		while(row<=nr) {
			int cst=1;
			for( cst=1;cst<=nst;cst++)
				System.out.print("*");
			
			System.out.println();
				if(row<=nr/2)
					nst++;
				else
					nst--;
				row++;
		}

	}

}
