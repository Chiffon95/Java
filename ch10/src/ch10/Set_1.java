package ch10;

import java.util.Calendar;

public class Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String[] DAY_OF_WEEK = {"", "SUN", "MON", "TUES", "WEDNES", "THURS", "FRI", "SATUR"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//Month start - 0
		date1.set(2020, 0, 1);
		System.out.println("date1 -> " + toString(date1)
			+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "DAY");
		System.out.println("TODAY (date2) -> " + toString(date2)
			+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "DAY");
		//GAP between date1, date2 -> getTimeInMillis()
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("From date1 to TODAY (date2) : " + difference + " second after");
		//1day = 24hour * 60(hour) * 60(second)
		System.out.println("From date1 to TODAY (date2) : " + difference / (60) + " minute after");
		System.out.println("From date1 to TODAY (date2) : " + difference / (60 * 60) + " hour after");
		System.out.println("From date1 to TODAY (date2) : " + difference / (24 * 60 * 60) + " day after");
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR) + "YEAR "
				+ (date.get(Calendar.MONTH) + 1) + "MONTH "
				+ date.get(Calendar.DATE) + "DAY ";
	}
}
