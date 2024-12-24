import java.util.*;

/**
 * The solution class contains the main method and the longestCommonPrefix
 * method
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * @author Ahmed Tariq
 */
public class Longest {

    /**
     * starts program
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // opening console
        Scanner console = new Scanner(System.in);
        // first word
        String[] word1 = { "flower", "flow", "flight" };
        // second word
        String[] word2 = { "dog", "racecar", "car" };

        System.out.println(longestCommonPrefix(word2));
        System.out.println(longestCommonPrefix(word1));

        // closes console
        console.close();
    }

    /**
     * This is the longestCommonPrefix method that takes in an array of strings and
     * returns the longest common prefix
     * 
     * @param strs the array of strings to find the longest common prefix
     * @return string the longest common prefix
     */
    public static String longestCommonPrefix(String[] strs) {
        // if the strs length is 0 then return an empty string
        if (strs.length == 0) {
            return "";
        }

        // find the length of the shortest string in the array
        // as that is what we will use to find the common prefix
        int minLength = Integer.MAX_VALUE;
        // make a loop to find the shortest string in the array
        // by comparing the length of each string
        // and storing the length of the shortest string
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }

        // the return string because StringBuilder is less runtime
        StringBuilder toReturn = new StringBuilder();

        // make a for loop to go over the length of the shortest string in the array
        for (int i = 0; i < minLength; i++) {
            // get the first letter of the first word
            // and check if it is present at the first index of other letters
            char firstWordFirstLetter = strs[0].charAt(i);
            // make another loop to check if the first letter is present in the same index
            // of the other words
            for (int j = 1; j < strs.length; j++) {
                // if the first letter is not present in the same index of the other words
                // then return the string
                if (firstWordFirstLetter != strs[j].charAt(i)) {
                    return toReturn.toString();
                }
            }
            // if the first letter is present in the same index of the other words
            // then add the letter to the return string
            toReturn.append(firstWordFirstLetter);
        }
        // return the string
        return toReturn.toString();
    }

}
