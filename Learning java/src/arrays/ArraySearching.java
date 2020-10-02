package arrays;

import java.util.*;

public class ArraySearching {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Array");
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println("Enter The Number");
		int a = scn.nextInt();
		int c = LinearSearch(arr, a);
		System.out.println("Solution from Linear Search" + c);
		int d = BinarySearch(arr, a);
		System.out.println("Solution from Binary Search" + d);

	}

	private static int LinearSearch(int[] arr, int a) {
		
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == a)
				return i;

		}
		return -1;
	}

	private static int BinarySearch(int[] arr, int a) {
		
		int lo = 0;
		int hi = arr.length - 1;
		int mid;
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (a > arr[mid])
				lo = mid + 1;
			else if (a < arr[mid])
				hi = mid - 1;
			else
				return mid;

		}
		return 0;

	}
}

