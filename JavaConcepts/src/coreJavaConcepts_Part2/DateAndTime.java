package coreJavaConcepts_Part2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1)
		Date d = new Date();
		String date = d.toString();
		System.out.println("Today's date: " + date);
		
		// 2)
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		// you can use format like: M/d/yyyy
		String finalDate = sdf.format(d);
		System.out.println("Today's date in simple date format: " + finalDate);
		
		// 3)
		SimpleDateFormat sdf1 = new SimpleDateFormat ("MM/dd/yyyy hh:mm:ss");
		String finalDate1 = sdf1.format(d);
		System.out.println(finalDate1);
	}

}
