package arrayJava;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// normal int
		int a1 = 4, i;
		System.out.println(a1);
		System.out.println();
//========================================================================================		
		// list of integers or integer container
		int a2[] = new int[5];
		a2[0] = 2;
		a2[1] = 6;
		a2[2] = 1;
		a2[3] = 9;
		a2[4] = 12;
		for(i=0; i<=a2.length-1; i++) {
			System.out.println("Array no. " + a2[i] + " is having " + i + " index.");
		}
		System.out.println();
//========================================================================================
		int b[] = {1, 4, 3, 5, 7, 8};
		for(i=0; i<=b.length-1; i++) {
			System.out.println("Array no. " + b[i] + " is having " + i + " index.");
		}
	}

}
