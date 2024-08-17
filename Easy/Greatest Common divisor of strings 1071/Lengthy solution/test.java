import java.util.*;

/**
 * finding greatest common divisor
 * 
 * @author Ahmed Tariq
 */
public class test {

	/** private for gcd storing */
	private static int gcd = 0;
	/** private for original string 1 */
	private static String originalStr1;
	/** private for original string 2 */
	private static String originalStr2;

	/**
	 * starts program
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		// opening console
		Scanner console = new Scanner(System.in);
		// first word
		String word1 = "ABABAB";
		// second word
		String word2 = "ABAB";
		// gcd = gcd(word1.length(), word2.length());
		System.out.println(gcdOfStrings(word1, word2));

		// closes console
		console.close();
	}

	/**
	 * For two strings s and t, we say "t divides s" if and only if s = t + t + t +
	 * ... + t + t (i.e., t is concatenated with itself one or more times). Given
	 * two strings str1 and str2, return the largest string x such that x divides
	 * both str1 and str2.
	 * 
	 * @param str1 the first string
	 * @param str2 the second string
	 * @return largest string x such that x divides both str1 and str2.
	 */
	public static String gcdOfStrings(String str1, String str2) {

		// Calculate gcd only once at the beginning of the method
		if (gcd == 0) {
			gcd = gcd(str1.length(), str2.length());
		}
		// Save the original str1 when it's first passed to the method
		if (originalStr1 == null) {
			originalStr1 = str1;
		}
		// Save the original str2 when it's first passed to the method
		if (originalStr2 == null) {
			originalStr2 = str2;
		}
		// making a boolean for sequence finding
		boolean found = false;
		if (str1.length() >= str2.length()) {
			// we will take the maximum length of str2 to check whetehr it divides the str 1
			// length
			int max = str2.length();
			int maxForStr1 = str1.length();
			if (maxForStr1 % max == 0) {
				// we now know it divides it perfectly
				// now we will check whether the string divides the string
				// storing abc in temp
				String temp = str1.substring(0, max);
				// String temp2 = str1.substring(max,max*2);
				if (temp.equals(str2)) {
					// we now know that it has a starting sequence match
					// making the boolean true
					found = true;
					// now we will check whther adding the string the number of time it divides the
					// string
					// is equal to the string
					String temp3 = "";
					for (int i = 0; i < maxForStr1 / max; i++) {
						temp3 += temp;
					}
					if (temp3.equals(str1) && gcd == max) {
						String storer = temp;
						// now that we have the temp string we can add it to itself and check whether it
						// divides the original string
						while (temp.length() < originalStr2.length()) {

							temp += storer;

						}
						if (temp.equals(originalStr2)) {
							return storer;

						} else {
							return "";
						}
					} else {
						// we will call recursion here to find the gcd of the strings
						// by taking one less substring of str2 and checking whether it divides str1
						// make an if here to check if the string 2 length is 1
						// if it is we simply return ""
						if (str2.length() == 1) {
							return "";
						}
						return gcdOfStrings(str1, str2.substring(0, max - 1));
					}

				}

			} else {
				// we will call recursion here to find the gcd of the strings
				// by taking one less substring of str2 and checking whether it divides str1
				return gcdOfStrings(str1, str2.substring(0, max - 1));
			}

		} else if (str2.length() > str1.length()) {
			// we will take the maximum length of str2 to check whetehr it divides the str 1
			// length
			int max = str1.length();
			int maxForStr2 = str2.length();
			if (maxForStr2 % max == 0) {
				// we now know it divides it perfectly
				// now we will check whether the string divides the string
				// storing abc in temp
				String temp = str2.substring(0, max);
				// String temp2 = str1.substring(max,max*2);
				if (temp.equals(str1)) {
					// we now know that it has a starting sequence match
					// making the boolean true
					found = true;
					// now we will check whther adding the string the number of time it divides the
					// string
					// is equal to the string
					String temp3 = "";
					for (int i = 0; i < maxForStr2 / max; i++) {
						temp3 += temp;
					}
					if (temp3.equals(str2) && gcd == max) {

						String storer = temp;
						// now that we have the temp string we can add it to itself and check whether it
						// divides the original string
						while (temp.length() < originalStr1.length()) {

							temp += storer;

						}
						if (temp.equals(originalStr1)) {
							return storer;
						} else {
							return "";
						}

					} else {
						// we will call recursion here to find the gcd of the strings
						// by taking one less substring of str2 and checking whether it divides str1
						if (str1.length() == 1) {
							return "";
						}
						return gcdOfStrings(str1.substring(0, max - 1), str2);
					}

				}

			} else {
				// we will call recursion here to find the gcd of the strings
				// by taking one less substring of str2 and checking whether it divides str1
				if (str1.length() == 1) {
					return "";
				}
				return gcdOfStrings(str1.substring(0, max - 1), str2);
			}
		}

		return "";
	}

	/**
	 * Returns the greatest common divisor of two numbers.
	 * 
	 * @param a the first number
	 * @param b the second number
	 * @return the greatest common divisor of two numbers
	 */
	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
