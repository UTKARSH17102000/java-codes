package interfaceandgenerics;

public class Car implements Comparable<Car> {

   
	int speed;
	int price;
	String color;
	
	public Car (int speed ,int price , String color) {
		this.speed=speed;
		this.price=price;
		this.color=color;
	}
	
	public String toString() { // java default toString func used to display array 
		return "S:"+ this.speed + " P:" + this.price + " C:" +this.color;
	}

	
	  @Override 
	  public int compareTo(Car other) { // this: priority return +ve , this : priority -ve // TODO Auto-generated method stub
	  
	  return this.color.compareTo(other.color); // limitations of CompareTo func are- // one logic at a time // if car class does not implements Comparable }
	 }
	  
}