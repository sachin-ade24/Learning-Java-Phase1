package coreJavaConcepts;

public class GrandchildAirCraftCompany extends ChildAirCraftCompany1{

	// We cannot extend multiple classes at the same time
	// public abstract class ChildAirCraftCompany1 extends ParentAirCraft, 
	// exampleClass1, exampleClass2
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentCompanyMethod1();
	}

	@Override
	public void methodFinal() {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
