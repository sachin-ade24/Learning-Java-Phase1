package javaConceptsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTypes_ForLoop_Array_Intro {
	
	public static void main(String[] arg) {
		int number = 5, i;
		System.out.println("My integer is: " + number);
		double newNum = 5.555;
		System.out.println("My double no. is: " + newNum);
		float numFloat = (float) 0.5;
		System.out.println("My float is: " + numFloat);
		char letter = 'K';
		System.out.println("My char is: " + letter);
		String sentence = "My name is Sachin";
		System.out.println("My String is: " + sentence);

// Array=============================================================================================================		
		// Conventional array
		
		//int arr23 [] = new int[7];
		int[] arr1 = new int[5];
		arr1[0] = 10;
		arr1[1] = 11;
		arr1[2] = 21;
		arr1[3] = 31;
		arr1[4] = 1;
 		for(i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		// Conventional array
		int[] arr2 = {18, 24, 12, 5, 6};
		System.out.println();
		System.out.println("Length of arr2 is: " + arr2.length);
		System.out.println(arr2[0]);
		for(i=4; i<arr1.length; i--) {
			if (arr1.length == arr2.length) {
				System.out.print(arr2[i] + " ");
				if(i==0) {
					break;
				}
			}
		}
		System.out.println();
		System.out.println();
		for(i=arr1.length-1; i>=arr1.length-5; i--) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		String[] listOfCities = new String[5];
		listOfCities[0] = "Mumbai";
		listOfCities[1] = "Pune";
		listOfCities[2] = "Nagpur";
		listOfCities[3] = "Nashik";
		listOfCities[4] = "Kolhapur";
		System.out.println();
		for(i=0; i<listOfCities.length; i++) {
			System.out.println(listOfCities[i]);
		}
		System.out.println();
		for(String cities: listOfCities) {
			System.out.println(cities);
		}
		
		
		// ArrayList - integer
		System.out.println();
		ArrayList<Integer> k = new ArrayList<Integer>();
		k.add(0, 1);
		k.add(1, 20);
		k.add(2, 4);
		k.add(3, 3);
		k.add(4, 5);
		k.add(5,50);
		System.out.println(k);
		k.remove(5);
		System.out.println(k);
		
		// ArrayList -- String
		System.out.println();
		ArrayList <String> a = new ArrayList <String>();
		a.add("Sachin");
		a.add("Kalpana");
		a.add("Prince");
		a.add("Suraj");
		a.add(4, "No name");
		System.out.println(a);
		a.remove("No name");
		System.out.println(a);
		a.add("No name");
		System.out.println(a);
		a.remove(4);
		System.out.println(a);
		System.out.println(a.get(0));
		
		// ArrayList -- String --> for loop
		System.out.println("\n*****************************");
		for(i=0; i<a.size(); i++) {
			System.out.print(a.get(i) + " ");
		};
		System.out.println();
		for(String name:a) {
			System.out.print(name + " ");
		};
		// Conventional array to arrayList
		System.out.println("\n*****************************");
		// ArrayList <String> listOfCitiesInMaharashtra = (ArrayList <String>) Arrays.asList(listOfCities);
		List <String> listOfCitiesInMaharashtra = Arrays.asList(listOfCities);
		for(String citiesInMaharashtra: listOfCitiesInMaharashtra) {
			 System.out.print(citiesInMaharashtra + " ");
		};
		System.out.println("\n*****************************");
		for(i=0; i<listOfCitiesInMaharashtra.size(); i++) {
			System.out.print(listOfCitiesInMaharashtra.get(i) + " ");
		};
		System.out.println("\nPune is part of array list: " + listOfCitiesInMaharashtra.contains("Pune") + ".");
		listOfCitiesInMaharashtra.set(0, "Beed");
		System.out.println(listOfCitiesInMaharashtra);
		System.out.println("\n*****************************");

		
// String programs=============================================================================================================
		
		String name = "My name is Sachin";
		Pattern p1 = Pattern.compile("\\b[A-Za-z]{6}\\b");
		Matcher m1 = p1.matcher(name);
		Pattern p2 = Pattern.compile("\\b[a-t]{2}\\b");
		Matcher m2 = p2.matcher(name);
		Pattern p3 = Pattern.compile("\\b[a-z]{4}\\b");
		Matcher m3 = p3.matcher(name);
		Pattern p4 = Pattern.compile("\\b[A-Za-z]{2}\\b");
		Matcher m4 = p4.matcher(name);
		Pattern p5 = Pattern.compile("\\s");
		Matcher m5 = p5.matcher(name); 
		
		while(m1.find() & m2.find()& m3.find() & m4.find() & m5.find()) {
			// System.out.println(m1.group() + " " + m2.group() + m3.group() + m4.group());
			System.out.println(m1.group() + m5.group() + m2.group() + m5.group() + m3.group() + m5.group() + m4.group());
		}
		
		System.out.println("\n*****************************");		
		String reversed = new StringBuilder(name).reverse().toString();
		System.out.println("This is reverse string: " + reversed);
	}
}
