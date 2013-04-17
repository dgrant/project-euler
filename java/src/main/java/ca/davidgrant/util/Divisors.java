package ca.davidgrant.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divisors {

	public int[] divisorsOf(int num) {
		List<Integer> divisors = new ArrayList<Integer>(num);
		divisors.add(1);
		double sqrtOfNum = Math.sqrt(num);
		for (int i=2; i < sqrtOfNum; i++) {
			if (num % i == 0) {
				divisors.add(i);
				divisors.add(num/i);
			}
		}
		if (num % sqrtOfNum == 0) {
			divisors.add((int) sqrtOfNum);
		}
		// Sort
		Collections.sort(divisors);
		
		// Convert to int[]
		int[] ret = new int[divisors.size()];
		int i=0;
		for (Integer divisor : divisors) {
			ret[i++] = divisor;
		}
		return ret;
	}
	
	public int sumOfDivisors(int num) {
		int[] divisors = divisorsOf(num);
		int sum = 0;
		for (int divisor : divisors) {
			sum += divisor;
		}
		return sum;
	}

}
