package ca.davidgrant.euler21;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Before;
import org.junit.Test;

import ca.davidgrant.util.Divisors;

public class DivisorsTest {
	private Divisors d;
	
	@Before
	public void setup() {
		d = new Divisors();
	}
	
	@Test
	public void test_2() {
		assertThat(ArrayUtils.isEquals(d.divisorsOf(2), new int[] {1}), is(true));
	}
	
	@Test
	public void test_3() {
		assertThat(ArrayUtils.isEquals(d.divisorsOf(3), new int[] {1}), is(true));
	}
	
	@Test
	public void test_4() {
		assertThat(ArrayUtils.isEquals(d.divisorsOf(4), new int[] {1, 2}), is(true));
	}
	
	@Test
	public void test_5() {
		assertThat(ArrayUtils.isEquals(d.divisorsOf(5), new int[] {1}), is(true));
	}
	
	@Test
	public void test_6() {
		assertThat(ArrayUtils.isEquals(d.divisorsOf(6), new int[] {1, 2, 3}), is(true));
	}
	
	@Test
	public void test_220() {
		assertThat(ArrayUtils.isEquals(d.divisorsOf(220), new int[] {1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110}), is(true));
	}
	
	@Test
	public void test_284() {
		assertThat(ArrayUtils.isEquals(d.divisorsOf(284), new int[] {1, 2, 4, 71, 142}), is(true));
	}
}
