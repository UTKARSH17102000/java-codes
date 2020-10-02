package dyanamicprog;

public class LongestIncreasingSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr = {10,9,2,5,3,7,101,18};
      System.out.println(lis(arr));
	
	}
	public static int lis(int [] arr) {
		if(arr.length==0)
			return 0;
		int [] lis = new int [arr.length];
		
	//	for(int k=0;k<lis.length;k++) {
		//	lis[k]=1;
	//	}    I can do the same process in the next loop itself
		for(int i=1;i<lis.length;i++) {
			  lis[i]=1;
			  for(int j=0;j<i;j++) {
				  if(arr[i]>arr[j])
					  lis[i]=1+lis[j];
				  
			  }
		}
		int max = lis[0];
		for(int i=0;i<lis.length;i++) {
			if(lis[i]>max)
				max=lis[i];
		}
		
		return max;
	}

}
