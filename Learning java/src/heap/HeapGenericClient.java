package heap;

import interfaceandgenerics.Car;

public class HeapGenericClient {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car [] cars = new Car[5];
		cars[0]= new Car(1000,100,"Red");
		cars[1]= new Car(1000,500,"Green");
		cars[2]= new Car(1200,400,"Black");
		cars[3]= new Car(100,300,"Yellow");
		cars[4]= new Car(400,200,"Blue");
		HeapConstructionGeneric<Car> heapg = new HeapConstructionGeneric<>(); 
		heapg.add(cars[0]);
		heapg.add(cars[1]);
		heapg.add(cars[2]);
		heapg.add(cars[3]);
		heapg.add(cars[4]);
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
	}

}
