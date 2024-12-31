package coreJavaConcepts_Part2;

public class ParentClassSuperAndThisKeyword {

	String s = "Selenium Global -- Parent";
	
	public void getText() {
		String s = "Selenium in method --> Parent Class";
		System.out.println(s);
		System.out.println(this.s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClassSuperAndThisKeyword o = new ParentClassSuperAndThisKeyword();
		o.getText();
	}

}
