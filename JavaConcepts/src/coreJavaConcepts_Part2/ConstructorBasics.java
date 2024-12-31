package coreJavaConcepts_Part2;

public class ConstructorBasics {
	
	ConstructorBasics(){
		System.out.println("I am a simple constructor");
	}
	
	public ConstructorBasics(String s) {
		System.out.println("I am a public constructor");
	}
	
	public ConstructorBasics(int i, boolean b) {
		System.out.println(i + " and " + b);
	}
	
	void method1(){
		System.out.println("This is method1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorBasics c1 = new ConstructorBasics();
		ConstructorBasics c2 = new ConstructorBasics("C2");
		ConstructorBasics c3 = new ConstructorBasics(1, true);
	}

}
