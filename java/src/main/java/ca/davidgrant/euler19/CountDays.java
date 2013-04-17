package ca.davidgrant.euler19;

import ca.davidgrant.euler19.Date.Day;
import ca.davidgrant.euler19.Date.Month;

public class CountDays {
	public static void main(String[] args) {
		int startYear = 1901;
		int endYear = 2000;
		
		int firstSunday = -1;
		for (int date = 1; date <=7; date++) {
			Date d = new Date(startYear, Month.JANUARY, date);
			if (d.getDayOfWeek() == Day.SUNDAY) {
				firstSunday = date;
				break;
			}
		}
		
		Date newDate = new Date(startYear, 1, firstSunday);
		int count = firstSunday == 1 ? 1 : 0;
		while (Date.compare(newDate, new Date(endYear, Month.DECEMBER, 31)) < 1) {
			newDate = newDate.addDays(7);
			System.out.println("newDate=" + newDate);
			if (newDate.getDate() == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
