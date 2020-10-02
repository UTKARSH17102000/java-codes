package stacks.Inheritance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- Case 1 -- P referenc and p Instance");
		P obj = new P();// by this space is allocated to d and d1 in class P
	//	C obj = new C();  // by this space is allocated to d and d2 in class C and also space get allocated to P class also 
		System.out.println(obj.d);
		System.out.println(obj.d1);
		obj.fun();
		obj.fun1();
		
		
		System.out.println("--- Case 2 -- P referenc and C Instance");
		P obj2 = new C();
		System.out.println(obj2.d); // in this case we give priority to reference hence it gives value 10   
		System.out.println(obj2.d1);
		System.out.println(((C)obj2).d2);
		obj2.fun();  // in this case(functions) we give priority to instance hence it gives value In C Fun
		obj2.fun1();
		((C)obj2).fun2();
		
		System.out.println("--- Case 3 -- C referenc and C Instance");
		C obj3 = new C();
		System.out.println(((P)obj3).d);// in this case we give priority to reference hence it gives value 10 but to print P we can do Type Cast 
		System.out.println(obj3.d1);
		System.out.println(obj3.d2);
		obj3.fun(); // in case of functions we can not do type cast to change its value 
		obj3.fun1();
		obj3.fun2();
		System.out.println("--- Case 3 -- C referenc and P Instance int this case is not possible It always give Errors ");
		  // C obj3 = new P();
	}

}
