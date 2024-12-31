package coreJavaConcepts;

public class B extends A {
	
	int num = 2;
	
	// You cannot use class A's method with "static" key-word
	// Following method is not "static" in class A
	// public static void classA_Method1() {}; // Not allowed
	
	// You can use class A's method without "static" key-word
	public void classA_Method1() {
		System.out.println("This is Class A's Method1 overrided in class B");
	}; // allowed
	
	// Following method is "static" in class A
	// You must have to use the "static" key-word when you are 
	// 	re-using that in class B
	//public void classA_Method3 () {
	//	System.out.println("Cypress");
	//} // not allowed
	public static void classA_Method3 () {
		System.out.println("Selenium is awesome");
	} // but now this method belongs to class B
	
	public static void main(String[] args) {
		
		A b = new B();		
		System.out.println(b.num);
		// this num is coming from class 'A'	
		b.classA_Method1();
		b.classA_Method2();
		b.classA_Method3();// shows warning
		A.classA_Method3();// Allowed
		System.out.println();
//==============================================================================//		
		System.out.println();
		
		B b1 = new B();
		System.out.println(b1.num);
		// this num is coming from class 'B'
		b1.classA_Method1();
		b1.classA_Method2();
		b1.classA_Method3();// shows warning
//==============================================================================//				
		// b1.num --> class B, b.num --> class A 
		System.out.println(b1.num + b.num);
//==============================================================================//				
		classA_Method3();
		B.classA_Method3(); // Allowed
	}

}
