package arrays;

import java.util.Scanner;

public class Waveprint {

	public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);	
		// TODO Auto-generated method stub
	int a= scn.nextInt();
	int b=scn.nextInt();
		int [][] arr = new int [a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		waveprintrow(arr);

	}
	
	public static void waveprintrow(int [][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}if(i%2!=0) {
				for(int j=arr[i].length-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
				
		}
		System.out.print("END");
		
	}

}
