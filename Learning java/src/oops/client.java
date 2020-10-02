package oops;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// s is known as reference and create a new instance
		Student s = new Student();
		//s.name="Amit";
	//	s.age=20;
		
		System.out.println(s.name);
		System.out.println(s.age);
		
		// Here s1 is a new reference
		Student s1 =s;
		s1.name="Utkarsh";
		System.out.println(s.name);
		// s3 create a new reference and new instance
		Student s3 = new Student();
		
		Test(s1,s3);
		

	}
	public static void Test(Student s1,Student s3) {
	// Swap happen but only inside this function 
	// these changes happen in stack not in heap so changes stay till this function stays
		Student temp = s1;
		s1=s3;
		s3=temp;
	}
	
	


}
