import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the numbers and their indices.
        Map<Integer, Integer> mp = new HashMap<>();

        // Iterate over the numbers.
        for (int i = 0; i < nums.length; i++) {
            // Check if the target minus the current number is in the map.
            if (mp.containsKey(target - nums[i])) {
                // If it is, return the index of the current number and the index of the number in the map.
                return new int[]{mp.get(target - nums[i]), i};
            } else {
                // If it is not, add the current number and its index to the map.
                mp.put(nums[i], i);
            }
        }

        // If we reach this point, it means that the target cannot be represented as the sum of two numbers in the list.
        return new int[]{-1, -1};
    }
}

// This might be a little advance for ya rn 
// I'll suggest first explore this brute force sol
/**
 * This function takes an array of integers and a target integer and returns the indices of two numbers in the array whose sum is equal to the target. If no such pair of numbers exists, the function returns [-1, -1].
 *
 * @param nums The array of integers.
 * @param target The target integer.
 * @return The indices of two numbers in the array whose sum is equal to the target.
 */
// public static int[] twoSumBruteForce(int[] nums, int target) {
//     // Iterate over all pairs of numbers in the array.
//     for (int i = 0; i < nums.length; i++) {
//         for (int j = i + 1; j < nums.length; j++) {
//             // Check if the sum of the current two numbers is equal to the target.
//             if (nums[i] + nums[j] == target) {
//                 // If it is, return the indices of the two numbers.
//                 return new int[]{i, j};
//             }
//         }
//     }

//     // If we reach this point, it means that no pair of numbers in the array sums to the target.
//     return new int[]{-1, -1};
// }
