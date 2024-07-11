package date_Calendar;

import java.text.SimpleDateFormat;

public class Calendar {

	public static void main(String[] args) {
		
		java.util.Calendar cal = java.util.Calendar.getInstance() ;
		
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(java.util.Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(java.util.Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(java.util.Calendar.AM_PM));
		System.out.println(cal.get(java.util.Calendar.MINUTE));
		
		
	}

}
