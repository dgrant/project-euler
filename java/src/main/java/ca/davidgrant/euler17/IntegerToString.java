package ca.davidgrant.euler17;

import com.google.common.collect.ImmutableMap;

public class IntegerToString {

    private static final ImmutableMap<Integer, String> ones = new ImmutableMap.Builder<Integer, String>()
            .put(1, "one")
            .put(2, "two")
            .put(3, "three")
            .put(4, "four")
            .put(5, "five")
            .put(6, "six")
            .put(7, "seven")
            .put(8, "eight")
            .put(9, "nine")
            .put(10, "ten")
            .put(11, "eleven")
            .put(12, "twelve")
            .put(13, "thirteen")
            .put(14, "fourteen")
            .put(15, "fifteen")
            .put(16, "sixteen")
            .put(17, "seventeen")
            .put(18, "eighteen")
            .put(19, "nineteen")
            .build();
    
    private static final ImmutableMap<Integer, String> tens = new ImmutableMap.Builder<Integer, String>()
    		.put(20, "twenty")
    		.put(30, "thirty")
    		.put(40, "forty")
    		.put(50, "fifty")
    		.put(60, "sixty")
    		.put(70, "seventy")
    		.put(80, "eighty")
    		.put(90, "ninety")
    		.build();
    
    public String convert(int i) {
        StringBuilder sb = new StringBuilder();
    
        if (i == 1000) {
        	return "one thousand";
        }
        
        // hundreds
        for (int x=900; x >= 100; x -= 100) {
        	if (i >= x) {
        		sb.append(ones.get(x/100));
        		sb.append(" hundred");
        		i = i % x;
        		if (i > 0) {
        			sb.append(" and ");
        		}
        		break;
        	}
        }

        int rem = i%20;
        int div = 0;
        
        // Tens
        for (int x=90; x >= 20; x -= 10) {
        	if ((div = i / x) == 1) {
        		sb.append(tens.get(x));
        		rem = i % x;
        		break;
        	}
        }
        
        // Ones
        if (rem != 0) {
            if (div == 1) {
                sb.append("-");
            }
            sb.append(ones.get(rem));
        }
        
        return sb.toString();
    }
}
