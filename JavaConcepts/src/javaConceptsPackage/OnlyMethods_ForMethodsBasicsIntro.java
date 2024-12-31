package javaConceptsPackage;

public class OnlyMethods_ForMethodsBasicsIntro {
	public void myMethod1() {
		System.out.println("Prince is my son.");
	};
	
	public String myMethod2(String myName, int i, int j) {
		System.out.println(i+j);
		return myName; // Returns a string
	};
	
	public int myMethod3(String myTownName, int i) {
		return i; // Returns a integer
	};
	
	public static boolean myMethod4() {
		return true;
	};
}
