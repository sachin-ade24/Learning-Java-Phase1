package javaConceptsPackage;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 20;
		// print no. between 20 to 30
		do {
			System.out.println(j + "\n");
			j++;
			// following 'if' condition is applied to avoid printing 31
			if(j==30) {
				break;
			}
		} while(j<=30);
		System.out.println(j + "\n");
	}

}
