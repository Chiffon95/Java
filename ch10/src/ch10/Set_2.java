package ch10;

import java.util.Calendar;

public class Set_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] TIME_UNIT = {3600, 60, 1}; // hour(60 * 60), minute(60), second
		final String[] TIME_UNIT_NAME = {"-h ", "-m ", "-s "};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);

		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "-h "
				+ time1.get(Calendar.MINUTE) + "-m "
				+ time1.get(Calendar.SECOND) + "-s ");
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "-h "
				+ time2.get(Calendar.MINUTE) + "-m "
				+ time2.get(Calendar.SECOND) + "-s ");
		
		long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println("From time1 to time2 : " + difference + " second");
		String tmp = "";
		for(int i = 0; i < TIME_UNIT.length; i++) {
			tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			difference %= TIME_UNIT[i];
		}
		System.out.println("hour, minute, second : " + tmp);
	}

}
