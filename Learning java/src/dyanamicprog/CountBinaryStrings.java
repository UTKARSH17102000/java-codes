package dyanamicprog;

public class CountBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countBinary(2));

	}

	public static int countBinary(int n) {
		int [] zeroes=new int [n];
		int [] ones=new int [n];
		
		 zeroes[0]=1;
		 ones[0]=1;
		 for(int i=1;i<n;i++) {
			 zeroes[i]=zeroes[i-1]+ones[i-1];
			 ones[i]=zeroes[i-1];
		 }
		 
		 return ones[n-1]+zeroes[n-1];
		
	}
}
