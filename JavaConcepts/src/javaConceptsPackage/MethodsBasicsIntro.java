package javaConceptsPackage;

public class MethodsBasicsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		System.out.println("My integer is: " + num + "\n");
		
		// Create an object for method of this class
		MethodsBasicsIntro m1 = new MethodsBasicsIntro();
		
		// System.out.println(m1.method1()); // not possible
		m1.method1();
		System.out.println(m1.getData("Sachin") + " Ade\n");
		System.out.println(m1.getInteger() + "\n");
		
		// For static methods of the same class, we don't create an object
		System.out.println();
		method3("India");
		System.out.println(method4("My ", "India") + "\n");
		System.out.println(method6() + "\n");
		System.out.println(method5() + "\n");
		String s1 = method5() + "\n";
		System.out.println(s1);
		int a = method5() + 1;
		System.out.println(a);
		
		// Create an object for method from other class
		OnlyMethods_ForMethodsBasicsIntro obj = new OnlyMethods_ForMethodsBasicsIntro();
		obj.myMethod1();
		// System.out.println(obj.myMethod1()); // not possible 
		System.out.println(obj.myMethod2("Sachin", 1, 1) + "\n");
		System.out.println(obj.myMethod3("Majalgaon", 4) + "\n");
		System.out.println(OnlyMethods_ForMethodsBasicsIntro.myMethod4() + "\n");		
	};

//===================================================================================================	
	
	// Void method
	public void method1() {
		System.out.println("This is a VOID method. It does not return anything.\n");
	}
	
	public void method1(int i) {
		System.out.println("This is a VOID method. It does not return anything.\n");
	}

//===================================================================================================	
	
	// methods which returns type of specific data
	public boolean method2() {
		return true;
	}
	
	public boolean method2(boolean b) {
		return true;
	}
	
	public int getInteger() {
		System.out.println("Hello world.\n");
		return 1;
	}
	
	public int getInteger(String s) {
		System.out.println("Hello world.\n" + s);
		return 1;
	}
	
	public String getData(String data) {
		System.out.println(data);
		return data;
	}
	
	// Static methods
	public static void method3(String data) {
		System.out.println("My nation my pride. I am " + data + ".");
	}
	
	public static String method4(String d1, String d2) {
		return d1+d2;
	}
	
	public static int method5() {
		System.out.println("Selenium");
		return 0;
	}
	
	public static boolean method6() {
		return false;
	}
}
