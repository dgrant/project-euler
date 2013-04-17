package ca.davidgrant.euler22;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;

public class Main {
	private static int alpha(String string) {
		int sum = 0;
		for (char c : string.toCharArray()) {
			sum += c - 64;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		InputStream is = Main.class.getClassLoader().getResourceAsStream("names.txt");
		String fileContent = IOUtils.toString(is);
		
		String[] names = fileContent.split(",");
		List<String> namesList = new ArrayList<String>(names.length);
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			namesList.add(name.substring(1, name.length() - 1));
		}
		Map<String, Integer> positionMap = new HashMap<String, Integer>();

		Collections.sort(namesList);
		int i = 1;
		for (String name : namesList) {
			positionMap.put(name, i++);
		}
		
		int total = 0;
		for (String name : namesList) {
			total += positionMap.get(name) * alpha(name);
		}
		System.out.println(total);
	}
}
