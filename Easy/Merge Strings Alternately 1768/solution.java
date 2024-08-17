import java.util.*;

/**
 * The solution class contains the main method and the mergeAlternately method
 * that merges two strings by adding letters in alternating order, starting with
 * word1. If a string is longer than the other, append the additional letters
 * onto the end of the merged string.
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
		String word1 = "abc";
		// second word
		String word2 = "pqrs";
		System.out.println(mergeAlternately(word1, word2));

		// closes console
		console.close();
	}

	/**
	 * two strings word1 and word2. Merge the strings by adding letters in
	 * alternating order, starting with word1. If a string is longer than the other,
	 * append the additional letters onto the end of the merged string.
	 * 
	 * @param word1 word1 is a string
	 * @param word2 word2 is a string
	 * @return the merged string
	 */
	public static String mergeAlternately(String word1, String word2) {
		// we have cases of appending to the end of the list
		// first we will check the length of the two strings
		// then we will append the longer string to the end of the merged string
		// then we will merge the two strings
		if (word1.length() == word2.length()) {
			// we are going to merge alternately
			String str1 = "";
			for (int i = 0; i < word1.length(); i++) {
				// since we are adding alternately we will add the first letter of word1
				// then the first letter of word2
				str1 += word1.charAt(i);
				str1 += word2.charAt(i);
			}
			return str1;
		} else if (word1.length() > word2.length()) {
			// we are going to merge alternately
			String str2 = "";
			for (int i = 0; i < word2.length(); i++) {
				// since we are adding alternately we will add the first letter of word1
				// then the first letter of word2
				str2 += word1.charAt(i);
				str2 += word2.charAt(i);
			}
			// we will add the remaining letters of word1
			for (int i = word2.length(); i < word1.length(); i++) {
				str2 += word1.charAt(i);
			}

			return str2;

		} else {
			// we are going to merge alternately
			String str3 = "";
			for (int i = 0; i < word1.length(); i++) {
				// since we are adding alternately we will add the first letter of word1
				// then the first letter of word2
				str3 += word1.charAt(i);
				str3 += word2.charAt(i);
			}
			// we will add the remaining letters of word2
			for (int i = word1.length(); i < word2.length(); i++) {
				str3 += word2.charAt(i);
			}

			return str3;
		}

	}

}
