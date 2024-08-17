import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where
 * each candies[i] represents the number of candies the ith kid has, and an
 * integer extraCandies, denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after
 * giving the ith kid all the extraCandies, they will have the greatest number
 * of candies among all the kids, or false otherwise. Note that multiple kids
 * can have the greatest number of candies.
 * 
 * Example 2: Input: candies = [4,2,1,1,2], extraCandies = 1 Output:
 * [true,false,false,false,false] Explanation: There is only 1 extra candy. Kid
 * 1 will always have the greatest number of candies, even if a different kid is
 * given the extra candy.
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
		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		List<Boolean> result = kidsWithCandies(candies, extraCandies);

		// printing the result
		System.out.println(result);

		// closes console
		console.close();
	}

	/**
	 * This method will take an array of candies and an integer of extra candies and
	 * return a list of boolean values. The boolean values will be true if the kid
	 * with the candies + extraCandies has the greatest number of candies, and false
	 * otherwise.
	 * 
	 * @param candies      an array of integers representing the number of candies
	 *                     each kid has
	 * @param extraCandies an integer representing the number of extra candies you
	 *                     have
	 * @return a list of boolean values
	 */
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		// first we will make a list to store the result
		List<Boolean> result = new ArrayList<Boolean>();
		// make an integer to store the max value. It will be used to compare the
		// candies with the max value
		int max = 0;
		// make a loop to find the max value in the candies array
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}

		// make another loop to compare the candies with the max value
		for (int i = 0; i < candies.length; i++) {
			// if the candies + extraCandies is greater than or equal to the max value, then
			// add true to the result list
			if (candies[i] + extraCandies >= max) {
				result.add(true);
			} else {
				result.add(false);
			}
		}
		return result;

	}

}