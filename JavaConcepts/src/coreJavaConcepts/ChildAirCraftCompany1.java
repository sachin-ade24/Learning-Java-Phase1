package coreJavaConcepts;

public abstract class ChildAirCraftCompany1 extends ParentAirCraft{

	// We cannot extend multiple classes at the same time
	// public abstract class ChildAirCraftCompany1 extends ParentAirCraft, 
	// exampleClass1, exampleClass2
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Commented for extending ChildAirCraftCompany1 to grandchildAirCraftCompany
//		ChildAirCraftCompany1 childCompany1 = new ChildAirCraftCompany1();
		
		// Static method of parent class 
		// does not need an object to call in child class	
		parentCompanyMethod1();
		
		
		// Commented for extending ChildAirCraftCompany1 to grandchildAirCraftCompany
		
//		childCompany1.bodyColor1();
//		childCompany1.bodyColor2("White + Black + Red");
//		childCompany1.engine();
//		childCompany1.safetyGuidelines();
//		childCompany1Method2(0);
//		childCompany1.childCompany1Method2("Selenium", 1);
	}
	
	public abstract void methodFinal();
	
	public void childCompany1Method1() {
		System.out.println("This is child company1 method1");
	}
	
//======================================================================================	
	
	// I can create two or more methods with same name but with different (return) data types and with different arguments
	
	public static int childCompany1Method2(int num) {
		System.out.println("This is child company1 method2");
		return num;
	};
	
	public String childCompany1Method2(String s, int i) {
		System.out.println("This is child company1 method2");
		return s;
	};
	
	public String childCompany1Method2(String s) {
		System.out.println("This is child company1 method2");
		return s;
	};

//======================================================================================
	
	@Override
	public void bodyColor1() {
		// TODO Auto-generated method stub
		System.out.println("The Child air craft company1 color is: White, Black and Red");
	}

	@Override
	public String bodyColor2(String color) {
		// TODO Auto-generated method stub
		System.out.println("The Child air craft company1 color is: " + color);
		return color;
	}
}
