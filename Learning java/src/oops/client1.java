package oops;

public class client1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Student1 s = new Student1();
		try {
	//	s.setAge(-10);
		s.fun(-20);
		} catch(Exception e) { // here e is a reference of a Exception  class 
			System.out.println("in catch");
			System.out.println(e.getMessage());
			
		}
		s.setAge(20);
		
		System.out.println(s.getAge());
		

	}

}
