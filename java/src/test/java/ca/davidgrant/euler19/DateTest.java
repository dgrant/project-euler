package ca.davidgrant.euler19;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ca.davidgrant.euler19.Date.Day;
import ca.davidgrant.euler19.Date.Month;

public class DateTest {

	@Before
	public void setup() {
	}
	
	@Test
	public void daysInMonth_January() {
		assertThat(Date.getDaysInMonth(2000, Month.JANUARY), is(31));
	}
	
	@Test
	public void daysInMonth_March() {
		assertThat(Date.getDaysInMonth(2000, Month.MARCH), is(31));
	}
	
	@Test
	public void daysInMonth_May() {
		assertThat(Date.getDaysInMonth(2000, Month.MAY), is(31));
	}
	
	@Test
	public void daysInMonth_July() {
		assertThat(Date.getDaysInMonth(2000, Month.JULY), is(31));
	}
	
	@Test
	public void daysInMonth_August() {
		assertThat(Date.getDaysInMonth(2000, Month.AUGUST), is(31));
	}
	
	@Test
	public void daysInMonth_October() {
		assertThat(Date.getDaysInMonth(2000, Month.OCTOBER), is(31));
	}
	
	@Test
	public void daysInMonth_December() {
		assertThat(Date.getDaysInMonth(2000, Month.DECEMBER), is(31));
	}
	
	@Test
	public void daysInMonth_April() {
		assertThat(Date.getDaysInMonth(2000, Month.APRIL), is(30));
	}
	
	@Test
	public void daysInMonth_June() {
		assertThat(Date.getDaysInMonth(2000, Month.JUNE), is(30));
	}
	
	
	@Test
	public void daysInMonth_September() {
		assertThat(Date.getDaysInMonth(2000, Month.SEPTEMBER), is(30));
	}
	
	
	@Test
	public void daysInMonth_November() {
		assertThat(Date.getDaysInMonth(2000, Month.NOVEMBER), is(30));
	}
	
	@Test
	public void daysInMonth_Feburary_century_divisible_by_400() {
		assertThat(Date.getDaysInMonth(2000, Month.FEBRUARY), is(29));
	}
	
	@Test
	public void daysInMonth_Feburary_divisible_by_4() {
		assertThat(Date.getDaysInMonth(2004, Month.FEBRUARY), is(29));
	}
	
	@Test
	public void daysInMonth_Feburary_century_not_divisible_by_4() {
		assertThat(Date.getDaysInMonth(1900, Month.FEBRUARY), is(28));
	}
	
	@Test
	public void daysInMonth_Feburary_not_divisible_by_4() {
		assertThat(Date.getDaysInMonth(2003, Month.FEBRUARY), is(28));
	}
	
	@Test
	public void daysInYear_leapyear() {
		assertThat(Date.getDaysInYear(2004), is(366));
	}
	
	@Test
	public void daysInYear() {
		assertThat(Date.getDaysInYear(2005), is(365));
	}
	
	@Test
	public void difference_1day() {
		assertThat(Date.difference(new Date(2004, Month.JANUARY, 2), new Date(2004, Month.JANUARY, 1)), is(1));
	}
	
	@Test
	public void difference_1day_spans_month() {
		assertThat(Date.difference(new Date(2004, Month.FEBRUARY, 1), new Date(2004, Month.JANUARY, 31)), is(1));
	}
	
	@Test
	public void difference_entire_year() {
		assertThat(Date.difference(new Date(2004, Month.DECEMBER, 31), new Date(2004, Month.JANUARY, 1)), is(365));
	}
	
	@Test
	public void difference_across_year() {
		assertThat(Date.difference(new Date(2004, Month.JANUARY, 1), new Date(2003, Month.DECEMBER, 31)), is(1));
	}
	
	@Test
	public void difference_big1() {
		assertThat(Date.difference(new Date(4321, Month.DECEMBER, 31), new Date(1234, Month.JANUARY, 1)), is(1127867));
	}
	
	@Test
	public void difference_big2() {
		assertThat(Date.difference(new Date(4321, Month.JANUARY, 31), new Date(1234, Month.DECEMBER, 1)), is(1127199));
	}
	
	@Test
	public void dayOfWeekFirstMonday() {
	    assertThat(new Date(1900, Month.JANUARY, 1).getDayOfWeek(), is(Day.MONDAY));
	}
	
    @Test
    public void dayOfWeekFirstTuesday() {
        assertThat(new Date(1900, Month.JANUARY, 2).getDayOfWeek(), is(Day.TUESDAY));
    }
    
    @Test
    public void dayOfWeekSecondMonday() {
        assertThat(new Date(1900, Month.JANUARY, 8).getDayOfWeek(), is(Day.MONDAY));
    }
    
    @Test
    public void today() {
        assertThat(new Date(2012, Month.OCTOBER, 29).getDayOfWeek(), is(Day.MONDAY));
    }
    
    @Test
    public void add() {
        assertThat(new Date(1900, 1, 1).addDays(1), is(new Date(1900, 1, 2)));
    }
    
    @Test
    public void add_past_month() {
        assertThat(new Date(1900, 1, 1).addDays(31), is(new Date(1900, 2, 1)));
    }
    
    @Test
    public void add_past_2month() {
        assertThat(new Date(1900, 3, 1).addDays(30+31), is(new Date(1900, 5, 1)));
    }
    
    @Test
    public void add_past_many_months() {
        assertThat(new Date(1900, 3, 1).addDays(100), is(new Date(1900, 6, 9)));
    }
    
    @Test
    public void add_past_many_months2() {
        assertThat(new Date(1900, 3, 1).addDays(200), is(new Date(1900, 9, 17)));
    }
    
    @Test
    public void add_span_year() {
        assertThat(new Date(2003, 1, 1).addDays(364), is(new Date(2003, 12, 31)));
    }
    
    @Test
    public void add_over_year() {
        assertThat(new Date(2003, 1, 1).addDays(365), is(new Date(2004, 1, 1)));
    }
    
    @Test
    public void add_over_2year() {
        assertThat(new Date(2002, 1, 1).addDays(365*2), is(new Date(2004, 1, 1)));
    }
    
    @Test
    public void add_over_new_year() {
        assertThat(new Date(2002, 12, 31).addDays(1), is(new Date(2003, 1, 1)));
    }
    
    @Test
    public void compare_equals() {
    	assertThat(Date.compare(new Date(2002, 1, 1), new Date(2002, 1, 1)), is(0));
    }
    
    @Test
    public void compare_lessThan_year_equals_1() {
    	assertThat(Date.compare(new Date(2001, 1, 1), new Date(2002, 1, 1)), is(-1));
    }
    
    @Test
    public void compare_lessThan_month_equals_1() {
    	assertThat(Date.compare(new Date(2002, 1, 2), new Date(2002, 2, 1)), is(-1));
    }
    
    @Test
    public void compare_lessThan_date_equals_1() {
    	assertThat(Date.compare(new Date(2002, 1, 1), new Date(2002, 1, 2)), is(-1));
    }
    
    @Test
    public void compare_greaterThan_year_equals_1() {
    	assertThat(Date.compare(new Date(2002, 1, 1), new Date(2001, 1, 1)), is(1));
    }
    
    @Test
    public void compare_greaterThan_month_equals_1() {
    	assertThat(Date.compare(new Date(2002, 2, 1), new Date(2002, 1, 2)), is(1));
    }
    
    @Test
    public void compare_greaterThan_date_equals_1() {
    	assertThat(Date.compare(new Date(2002, 1, 2), new Date(2002, 1, 1)), is(1));
    }
}
