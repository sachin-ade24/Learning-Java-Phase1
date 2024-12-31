package coreJavaConcepts_Part2;

public class ChildClassSuperAndThisKeyword extends ParentClassSuperAndThisKeyword{

	String s = "Selenium Global -- Child";
	
	public void getText() {
		String s = "Selenium in method --> Child Class";
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);// String from parent
		System.out.println();
		super.getText();// method from parent
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Selenium in Main method --> Child Class";
		ChildClassSuperAndThisKeyword o = new ChildClassSuperAndThisKeyword();
		System.out.println(o.s);
		System.out.println(s);
		System.out.println();
		o.getText();
		System.out.println();
		
		ParentClassSuperAndThisKeyword p = new ChildClassSuperAndThisKeyword();
		p.getText();// method from parent
		System.out.println(p.s);// String from parent
		
	}

}
