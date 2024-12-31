package package1;

public interface CentralTrafficRules {
	
//==============================================================================================	
	// in interface variable declaration => can be public, static, final
	// you have to initialize the variable
	final int a=0; // Global scope
	public boolean b = true;
	static String s = "Selenium";
	// protected int p = 5; // protected not allowed
	// private static String pr = "qwerty"; // private not allowed
	
	public static String interfaceMethod1(String myData) {
		int a = 1;
		System.out.println("interfaceMethod1 a => " + a);
		System.out.println("Hello world!!!");
		return myData;
	}
	
	// Protected access modifier are not allowed in interface
	// protected void protectedMethod(){};
	
	// private access modifier
	// creation is allowed but cannot be implemented 
	// in the same interface as well as in other implemented classes
	private void privateMethod() {
		System.out.println("I am a tester");
	};
	
	// Static private is allowed in same interface itself not in other classes
	private static void privateStaticMethod() {
		System.out.println("It's a private static void method");
	}
	
	public void interfaceMethod1();
	public int interfaceMethod2();
	public String interfaceMethod3(String rule);
	void interfaceMethod4();
	// For static method we need to add body for the method
	// public static boolean interfaceMethod4(String newRule, boolean yOrN);
	
	public boolean interfaceMethod4(String newRule, boolean yOrN);
	
//==============================================================================================	
	
	public void greenGo(String r1);
	public void redStop(int i1);
	public void yellowWarning();

//==============================================================================================	
	
// I can add "main" method here but cannot call non-static method in it.
	public static void main(String[] args) {
		
//		int a = 2;
		
		System.out.println("Main method a: " + a);
		System.out.println(s);
		System.out.println(b);
		System.out.println();
		
		interfaceMethod1("Selenium + Java");
		System.out.println();
		// Cannot create an object for interface inside interface itself
		// CentralTrafficRules interfaceObj = new CentralTrafficRules();
		System.out.println("This is an " + interfaceMethod1("Interface") + ".");
		
		/* For rest of the non-static methods which do not have bodies, 
		 * we cannot create object and we cannot call them here */
		// interfaceMethod2(); // not allowed
		
		// privateMethod(); // not allowed
		
		privateStaticMethod();
		
	}
}
