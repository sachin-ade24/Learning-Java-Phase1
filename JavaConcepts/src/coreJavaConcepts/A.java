package coreJavaConcepts;

public class A {
	
	int num =1;
	
	public void classA_Method1 () {
		System.out.println("This is Class A's Method1");		
		System.out.println();
		System.out.println("Number is: " + num);
	};
	
	public int classA_Method2 () {
		return num;
	}
	
	public static void classA_Method3 () {
		System.out.println("Cypress is awesome");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.classA_Method1();
	}
}
