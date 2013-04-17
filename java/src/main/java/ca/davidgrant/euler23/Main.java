package ca.davidgrant.euler23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ca.davidgrant.util.Divisors;

public class Main {
	private static final int MAX = 21823;
	
	public static void main(String[] args) {
		List<Integer> abundantNumbers = new ArrayList<Integer>();
		Set<Integer> abundantNumbersSet = new HashSet<Integer>();
		Divisors d = new Divisors();
		for (int i=12; i < MAX; i++) {
			if (d.sumOfDivisors(i) > i) {
				abundantNumbers.add(i);
				abundantNumbersSet.add(i);
			}
		}
		Integer[] abundantNums = abundantNumbers.toArray(new Integer[abundantNumbers.size()]);
		
		List<Integer> notSumOfAbundants = new ArrayList<Integer>();
		
		int sumOfNonSumOfAbundants = 0;
		for (int i=1; i <= MAX; i++) {
			boolean done = false;
			for (int j = 0; j < abundantNums.length; j++) {
				int num1 = abundantNums[j];
				if (num1 >= i) {
					break;
				}
				int num2 = i - num1;
				if (abundantNumbersSet.contains(num2)) {
					done = true;
					continue;
				}
			}
			if (!done) {
				sumOfNonSumOfAbundants += i;
				notSumOfAbundants.add(i);
			}
		}
		System.out.println("sum=" + sumOfNonSumOfAbundants);
		
	}
}
