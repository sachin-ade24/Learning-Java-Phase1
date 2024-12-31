package coreJavaConcepts_Part2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		String time = sdf.format(cal.getTime());
		System.out.println(time);
		System.out.println();
		
		// 1)
		System.out.println(cal.getTime());
		
		System.out.println();
		
		// 2) Following lines are providing unexpected outputs 
		System.out.println(sdf.format(cal.DATE));
		// DATE is a static field. It shows warning for that. 
		// Static field should be accessed in a static way
		System.out.println();
		System.out.println(sdf.format(Calendar.DATE));
		// No warning for this
		
		// 3) Following lines are providing expected outputs
		System.out.println(Calendar.JANUARY);
		System.out.println(Calendar.APRIL);
	}

}
