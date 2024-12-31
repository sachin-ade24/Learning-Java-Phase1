package javaConceptsPackage;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		
		// print 0 to 9
		while(i<10) {
			System.out.println(i);
			i++;
		}
		// It will print the last incremented value
		System.out.println(i + "\n"); 
		
		// print 9 to 0
		// initialize the same variable again or take a new variable and initialize it
		i=9;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
		System.out.println(i + "\n");
	}

}
