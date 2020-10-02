package oops;

public class Student1 {
	 private String name ;
     private int age;
     
     
     public void fun (int age ) throws Exception {
    	 System.out.println("hi");
    	 setAge(age);
    	 System.out.println("bi");
    	 
     }
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		// Exception Handling
		if(age<0) {
			throw new Exception("Invalid Entry"); // this will create a new instance of Exception class
		}else {
			this.age=age;
		}
	}

}
