package loops;


import java.util.*;
public class Checkcode {
    public static void main(String args[]) {

   Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
    
	int row = 1;
	int nst=1;
	int val=1;
	
	while(row<=n){
    int a=row;
   int b=a-1;
    for(int cst=1;cst<=nst;cst++){
    if(nst<3)
	  System.out.print(val);
	  else{
		  val++;
		  if(cst==1 || cst==row)
		  System.out.print(b);
		  else
		  System.out.print("0");
	  }
   }
   System.out.println();
     nst++;
	 row++;
      
	}
    }
}