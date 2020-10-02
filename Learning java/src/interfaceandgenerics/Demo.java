package interfaceandgenerics;

import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr1 =  {10,20,30,40,50};
		display(arr1);
		String [] arr2 = {"hello" , "start","World"};
		display(arr2);
		// to avoid these overloading we use genrics which 
       
		Car [] cars = new Car[5];
		cars[0]= new Car(1000,100,"Red");
		cars[1]= new Car(1000,500,"Green");
		cars[2]= new Car(1200,400,"Black");
		cars[3]= new Car(100,300,"Yellow");
		cars[4]= new Car(400,200,"Blue");
	//	display(cars);
		Object obj = new Object(); // java default class
	   
	//	bubbleSort(cars);
		
		bubbleSort(cars, new CarSpeedComparator());
		display(cars);
		
		bubbleSort(cars, new CarPriceComparator());
		display(cars);
	
		
		bubbleSort(cars, new CarColorComparator());
		display(cars);
	
	
	}
	
	/*
	 * public static void display(Integer [] arr) { for(Integer val : arr) {
	 * System.out.print(val + " "); } System.out.println();
	 * 
	 * } public static void display(String [] arr) { for(String val : arr) {
	 * System.out.print(val + " "); } System.out.println();
	 * 
	 * }
	 */	public static <T> void display(T[] arr) { // <T> shows generic func
		for(T val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	 public static <T extends Comparable> void bubbleSort(T[] arr) {
		 for(int count = 0;count<arr.length-1;count++) {
			 for(int j=0;j<arr.length-1-count;j++) {
				 if(arr[j].compareTo(arr[j+1])>0) {
					 T temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
			 }
		 }
	 }
	 
	 public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
		 for(int count = 0;count<arr.length-1;count++) {
			 for(int j=0;j<arr.length-1-count;j++) {
				 if(comparator.compare(arr[j],arr[j+1])>0) {
					 T temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
			 }
		 }
	 }
	 

}
