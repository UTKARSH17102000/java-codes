package genericclass;

import java.util.ArrayList;

import interfaceandgenerics.Car;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String> pair = new Pair<>();
      pair.one = "abc";
      pair.two = "abc";
      Pair<Integer> pair1 = new Pair<>();
      
      pair1.one = 1;
      pair1.two = 2;
      
      Pair2<Integer,String> pair2 = new Pair2<>();
      
      pair2.one = 10;
      pair2.two = "abc";
      
      ArrayList<Integer> al= new ArrayList<>();
      
      
      LinkedListGeneric <Car> list = new LinkedListGeneric<>();
      
    		Car [] cars = new Car[5];
    		cars[0]= new Car(1000,100,"Red");
    		cars[1]= new Car(1000,500,"Green");
    		cars[2]= new Car(1200,400,"Black");
    		cars[3]= new Car(100,300,"Yellow");
    		cars[4]= new Car(400,200,"Blue");
    		
    		list.addLast(cars[0]);
    		list.addLast(cars[1]);
    		list.addLast(cars[2]);
    		list.addLast(cars[3]);
    		list.addLast(cars[4]);
    		list.display();
	}

}
