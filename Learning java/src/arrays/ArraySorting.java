package arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {14,33,27,10,35,19,42,44};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("************************************");
		
		int [] arr2 = {14,33,27,10,35,19,42,44};
        SelectionSort(arr2);
        for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
        
        System.out.println("************************************");
        int [] arr3 =  {14,33,27,10,35,19,42,44};
        insertionSort(arr3);
        for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}

	}
	
	public static void bubbleSort(int [] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
							 
				}
			}
		}
	}
	
	public static void SelectionSort(int [] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
		int min=i;
		for(int j=min+1;j<arr.length;j++) {
			if(arr[j]<arr[min])
				min=j;
		}
	  
		    if(min!=i) {
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	
	}
	
		
	}
	
	public static void insertionSort(int [] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int a=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>a) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=a;
		}
	}

}
