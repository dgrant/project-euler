package ca.davidgrant.euler21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ca.davidgrant.util.Divisors;

public class AmicablePairs {
	private Divisors divisors;
	
	public AmicablePairs() {
		divisors = new Divisors();
	}
	
	public List<Integer> findAmicableNumbers(int max) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 3; i < max; i++) {
			int a = divisors.sumOfDivisors(i);
			int b = divisors.sumOfDivisors(a);
			if (b == i && a != b) {
				System.out.println(String.format("Found pair: (%d, %d)", a, b));
				set.add(a);
				set.add(b);	
			}
		}
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		return list;
	}
	
	public static void main(String[] args) {
		AmicablePairs a = new AmicablePairs();
		List<Integer> amicableNumbers = a.findAmicableNumbers(10000);
		System.out.println(amicableNumbers);
		int sum = 0;
		for (Integer num : amicableNumbers) {
			sum += num;
		}
		System.out.println(sum);
	}
}
