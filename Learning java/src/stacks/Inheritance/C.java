package stacks.Inheritance;

public class C extends P {        // here C is becomes the Dynamic class of P
	int d = 20;
	int d2 = 200;
	@Override // this method is used as a precaution  
	public void fun() {// the fun function of C class override the fun function of P class
		System.out.println("In C Fun");
	}
	public void fun2() {
		System.out.println("In C Fun2");
	}
	

}
