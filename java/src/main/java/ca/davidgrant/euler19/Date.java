package ca.davidgrant.euler19;

public final class Date {
	private final int year;
	private final Month month;
	private final int date;
	
	public enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
		
		public int getAsInt() {
		    return this.ordinal() + 1;
		}
	}
	
	public enum Day {
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public Date(int year, Month month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
    public Date(int year, int month, int date) {
        this.year = year;
        this.month = Month.values()[month-1];
        this.date = date;
    }
	
	public int getYear() {
		return year;
	}
	
	public Month getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
	
	public Day getDayOfWeek() {
	    int days = difference(this, new Date(1900, 1, 1));
	    return Day.values()[days % 7];
	}
	
	public static int difference(Date date1, Date date2) {
		int daysToAdd = 0;
		int daysToSubtract = 0;
		for (int year=date2.getYear(); year < date1.getYear(); year++) {
			daysToAdd += getDaysInYear(year);
		}
		for (int month_index = date2.getMonth().ordinal();
				month_index < date1.getMonth().ordinal();
				month_index++) {
			daysToAdd += getDaysInMonth(date1.getYear(), Month.values()[month_index]);
		}
		for (int month_index = date1.getMonth().ordinal();
				month_index < date2.getMonth().ordinal();
				month_index++) {
			daysToSubtract += getDaysInMonth(date2.getYear(), Month.values()[month_index]);
		}
		return date1.getDate() - date2.getDate() + daysToAdd - daysToSubtract;
	}
	
	public static int compare(Date date1, Date date2) {
		if (date1.getYear() < date2.getYear()) {
			return -1;
		}
		if (date1.getYear() > date2.getYear()) {
			return 1;
		}
		if (date1.getMonth().ordinal() < date2.getMonth().ordinal()) {
			return -1;
		}
		if (date1.getMonth().ordinal() > date2.getMonth().ordinal()) {
			return 1;
		}
		if (date1.getDate() < date2.getDate()) {
			return -1;
		}
		if (date1.getDate() > date2.getDate()) {
			return 1;
		}
		return 0;
	}
	
	public static int getDaysInYear(int year) {
		int ret = -1;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					ret = 366;
				} else {
					ret = 365;
				}
			} else {
				ret = 366;
			}
		}
		else {
			ret = 365;
		}
		return ret;

	}
	
	public static int getDaysInMonth(int year, Month month) {
		int ret = -1;
		
		switch (month) {
		case JANUARY:
		case MARCH:
		case MAY:
		case JULY:
		case AUGUST:
		case OCTOBER:
		case DECEMBER:
			ret = 31;
			break;
		case APRIL:
		case JUNE:
		case SEPTEMBER:
		case NOVEMBER:
			ret = 30;
			break;
		case FEBRUARY:
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						ret = 29;
					} else {
						ret = 28;
					}
				} else {
					ret = 29;
				}
			}
			else {
				ret = 28;
			}
			break;
		}
		return ret;
				
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (date != other.date)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return year + "-" + month + "-" + date;
	}

    public Date addDays(int days) {
        int currentYear = getYear();
        int daysInCurrentYear;
        
        while (days >= (daysInCurrentYear = getDaysInYear(getYear()))) {
            days -= daysInCurrentYear;
            currentYear += 1;
        }
        
        int currentMonth = getMonth().ordinal();
        int newDays = days + getDate();
        int daysInMonth;
        
        while (newDays > (daysInMonth = getDaysInMonth(currentYear, Month.values()[currentMonth%12]))) {
          newDays -= daysInMonth;
          currentMonth += 1;
          if (currentMonth > 11) {
        	  currentMonth = 0;
        	  currentYear += 1;
          }
        }
        return new Date(currentYear, Month.values()[currentMonth], newDays);
    }
}
