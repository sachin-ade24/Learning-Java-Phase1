package javaConceptsPackage;

import java.util.Arrays;
import java.util.List;

public class StringsBasicsIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String literal --> without "new" keyword
		int i;
		String s1 = "Raising Aimers";
		String s2 = "Raising Aimers";
		// treats s1 and s2 are the same strings (values are same for both of them)
		System.out.println(s1 + "\n");
		System.out.println(s2 + "\n");
		
//================================================================================
		
		// String with "new" keyword
		String s3  = new String("Raising Aimers: The Future");
		String s4 =  new String("Raising Aimers: The Future"); 
		// treats s3 and s4 as a separate string (though the values are same for both of them)
		System.out.println(s4 + "\n");
		
		// Splitting the string
		String [] splittedStringArray1 = s3.split(" "); // s3.split(" ") --> returns an String[] i.e. a String array
		
		System.out.println(splittedStringArray1.length);
		System.out.println(splittedStringArray1[0]);
		System.out.println(splittedStringArray1[1]);
		System.out.println(splittedStringArray1[2]);
		System.out.println();
		
		String [] splittedStringArray2 = s3.split("The");
		
		System.out.println(splittedStringArray2[0]); // 1st part: "Raising Aimers: "
		System.out.println(splittedStringArray2[1]); // 2nd part: " Future"
		// System.out.println(splittedStringArray2[2]); // This is not possible
		System.out.println("\n" + splittedStringArray2[0].trim());
		System.out.println(splittedStringArray2[1].trim());
		System.out.println();

		for(i=0; i<s3.length(); i++) {
			System.out.println(s3.charAt(i));
		};
		
		int colonIndex = s3.indexOf(":");
		System.out.println("\n" + colonIndex + "\n");
		String s5 = s3.replace(":", "");
		System.out.println("The new string after removing ':' is: " + s5 + "\n");
		
		// Challenge --> reverse the string --> s3
		System.out.println(s3.length() + "\n");
		for(i=s3.length()-1; i>=0; i--) {
			System.out.print(s3.charAt(i));
		};
		System.out.println();
		
//================================================================================
		
		// Sachin's experiments
		List <String> newSplittedStringArray = Arrays.asList(splittedStringArray1);
		System.out.println("\n" + newSplittedStringArray);
		String replace1 = newSplittedStringArray.get(1).replace(':', ' ').trim();
		System.out.println(replace1);
		System.out.println(newSplittedStringArray.get(1));
		
		// Can't add or remove element from already existing array which has converted into an Array List
		// newSplittedStringArray.remove(1);
		// newSplittedStringArray.add(replace1);
		
		// Replace the element
		newSplittedStringArray.set(1, replace1);
		System.out.println(newSplittedStringArray);
	}

}
