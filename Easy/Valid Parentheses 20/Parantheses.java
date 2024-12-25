import java.util.*;

/**
 * The solution class contains the main method and the isValid
 * method that checks if the parantheses are valid
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * Example 1:
 * 
 * Input: s = "()"
 * 
 * Output: true
 * 
 * Example 2:
 * 
 * Input: s = "()[]{}"
 * 
 * Output: true
 * 
 * Example 3:
 * 
 * Input: s = "(]"
 * 
 * Output: false
 * 
 * Example 4:
 * 
 * Input: s = "([])"
 * 
 * Output: true
 * 
 * 
 * @author Ahmed Tariq
 */
public class Parantheses {

    /**
     * starts program
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // opening console
        Scanner console = new Scanner(System.in);
        // first string
        String one = "()";
        // second string
        String two = "()[]{}";
        // third string
        String three = "(]";
        // fourth string
        String four = "([])";

        System.out.println(isValid(one));
        System.out.println(isValid(two));
        System.out.println(isValid(three));
        System.out.println(isValid(four));
        // System.out.println(longestCommonPrefix(word1));

        // closes console
        console.close();
    }

    /**
     * This method takes in a string and checks if the parantheses are valid
     * If the parantheses are valid, it returns true, otherwise it returns false
     * 
     * @param s the string to check
     * @return true if the parantheses are valid
     */
    public static boolean isValid(String s) {
        // get the length of the String
        int length = s.length();

        // make a Stack to keep track of the opening brackets
        // using the character class
        Stack<Character> opening = new Stack<>();

        // make a for loop to go over the String
        for (int i = 0; i < length; i++) {
            // get the char
            char theBracket = s.charAt(i);
            // check if this is the following type of bracket by using equal on the char
            if (theBracket == '(' || theBracket == '{' || theBracket == '[') {
                // put it onto the stack
                opening.push(theBracket);

                // otherwise if it is the closing bracket we have 3 cases
            } else if (theBracket == ')') {
                // go ahead and pop from the stack if the stack is empty or the
                // bracket that was popped out is not the corresponding bracket
                // then return false
                if (opening.isEmpty() || opening.pop() != '(') {
                    return false;
                }

            } else if (theBracket == '}') {
                if (opening.isEmpty() || opening.pop() != '{') {
                    return false;
                }

            } else if (theBracket == ']') {
                if (opening.isEmpty() || opening.pop() != '[') {
                    return false;
                }

            }
        }

        // if the stack is empty, all opening brackets have been matched with their
        // corresponding
        // closing brackets,
        // so the string is valid, otherwise, there are unmatched opening brackets, so
        // return false
        return opening.isEmpty();

    }

    //Runtime is O(n) where n is the length of the string

}
