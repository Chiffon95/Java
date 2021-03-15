package ch10;

import java.util.Calendar;

public class Util_Calendar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		System.out.println("This Year : " + today.get(Calendar.YEAR));
		System.out.println("Month (0 ~ 11, 0:Jan) : " + today.get(Calendar.MONTH));
		System.out.println("Week of Year : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Week of Month : " + today.get(Calendar.WEEK_OF_MONTH));
		// DATE == DAY_OF_MONTH
		System.out.println("Date : " + today.get(Calendar.DATE));
		System.out.println("Day of Month : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of Year : " + today.get(Calendar.DAY_OF_YEAR));
		//1 : Sunday, 2 : Monday ...
		System.out.println("Day of Week : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of Week In Month : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("AM_PM (0:AM, 1:PM) : " + today.get(Calendar.AM_PM));
		System.out.println("Hour(0 ~ 11) : " + today.get(Calendar.HOUR));
		System.out.println("Hour(0 ~ 23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute (0 ~ 59) : " + today.get(Calendar.MINUTE));
		System.out.println("Second (0 ~ 59) : " + today.get(Calendar.SECOND));
		System.out.println("Millisecond (0 ~ 999) : " + today.get(Calendar.MILLISECOND));
		// 1/1000 -> second ( 1hour = 60 * 60 second)
		System.out.println("TimeZone (-12 ~ +12) : " + today.get(Calendar.ZONE_OFFSET));
		//Last day of this month
		System.out.println("Last day of this month : " + today.get(Calendar.DATE));
	}

}
