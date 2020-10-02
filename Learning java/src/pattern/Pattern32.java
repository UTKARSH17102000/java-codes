package pattern;
import java.util.Scanner;
public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row=1;
		int nst=1;
	int val=1;
		int nr=2*n-1;
		while(row<=nr) {
			if(row<=nr/2)
			{
				 val=row;
			}
			else
				 val=nr-row+1;
			for(int cst=1;cst<=nst;cst++) {
				if(cst%2==0)
					System.out.print("*");
				else
					System.out.print(val);
			}
			System.out.println();
			if(row<=nr/2)
				nst=nst+2;
			else
				nst=nst-2;
			row++;
		}
	}

}
