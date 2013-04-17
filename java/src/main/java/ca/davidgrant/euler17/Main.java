package ca.davidgrant.euler17;

public class Main {
	public static void main(String[] args) {
		IntegerToString c = new IntegerToString();
		int totalLength = 0;
		for (int i=1; i <= 1000; i++) {
			String s = c.convert(i);
			s = s.replaceAll(" ", "");
			s = s.replaceAll("-", "");
			totalLength += s.length();
		}
		System.out.println(totalLength);
	}
}
