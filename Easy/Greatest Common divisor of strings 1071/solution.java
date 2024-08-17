import java.util.*;

/**
 * finding greatest common divisor
 * 
 * @author Ahmed Tariq
 */
public class solution {

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

		// Check if concatenated strings are equal or not, if not return ""
		if (!(str1 + str2).equals(str2 + str1))
			return "";
		// If strings are equal than return the substring from 0 to gcd of size(str1),
		// size(str2)
		int gcd = gcd(str1.length(), str2.length());
		return str1.substring(0, gcd);
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
