package javaConceptsPackage;

public class IfElseConditionsIntro {
	public static void main(String[] args) {
		int i, j, countEven = 0, countOdd = 0, add;
		int[] arr1 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};
		System.out.println(arr1[arr1.length-1]);
		// multiply each value by 2
		for(i=0; i<arr1.length; i++) {
			System.out.println("Original elemnt is " + arr1[i] + ". Its twice is: " + 2*arr1[i]);
			if(i==10) {
				break;
			}
		}
		System.out.println();
		// Find no. which are multiple of 2
		for(i=0; i<arr1.length; i++) {
			if(arr1[i]%2 == 0) {
				System.out.println(arr1[i] + " is an even number.");
				countEven = countEven + 1; // countEven++;
			} 
			else {
				System.out.println(arr1[i] + " is an odd number.");
				countOdd = countOdd + 1;
			}
		}
		System.out.println();
		System.out.println("No. of even numbers: " + countEven);
		System.out.println("No. of odd numbers: " + countOdd);
		add = countEven + countOdd;
		System.out.println("Total no. in the array: " + arr1.length);
		System.out.println("Total no. = " + add);
		if(arr1.length == add) {
			System.out.println("Length of array = add");
		}
		System.out.println();
		System.out.println();
		for(i=0; i<arr1.length; i++) {
			for(j=0; j<arr1.length; j++) {
				if(arr1[i]-arr1[j] < 0) {
					System.out.println(arr1[i] + " is smaller than " + arr1[j] + ".");
				} else if(arr1[i]-arr1[j] > 0){
					System.out.println(arr1[i] + " is greater than " + arr1[j] + ".");
				} else if(arr1[i]==arr1[j]) {
					System.out.println(arr1[j] + " is equal to " + arr1[i] + ".");
				} else {
					System.out.println("Do not compare numbers.");
				}
			}
		}
	}
}
