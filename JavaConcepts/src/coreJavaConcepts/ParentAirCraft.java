package coreJavaConcepts;

public abstract class ParentAirCraft {
	
	public static void main(String[] args) {
		// We cannot create object for abstract class
		// ParentAirCraft parentCompany = new ParentAirCraft();
		
		// But we can create static class and call it in main method of an abstract class
		parentCompanyMethod1();
		
		// I cannot call the method in abstract class without an object
		// engine();
		
		parentCompanyMethod2();
		System.out.println(parentCompanyMethod2());
	};
	
	public static void parentCompanyMethod1() {
		System.out.println("This is parent Company Method1");
	}
	
	public static String parentCompanyMethod2() {
		System.out.println("This is parent Company Method2");
		return "parentCompanyMethod2";
	}
	
	// This is non-abstract <--> non-conconcrete method
	public void engine() {
		System.out.println("Follow the Engine Guidelines");
	};
	
	// This is non-abstract <--> non-conconcrete method
	public void safetyGuidelines() {
		System.out.println("Follow the Safety Guidelines");
	};
	
	public abstract void bodyColor1();
	
	public abstract String bodyColor2(String color);
	
	// Protected methods can be specified in the abstract class 
	// but protected methods can't be abstract
	protected void updatedGuidelines() {
		System.out.println("Follow the Updated Guidelines");
	};
}
