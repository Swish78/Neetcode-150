import java.util.Arrays;

public class Solution {

    public static int[] productExceptSelf(int[] nums) {
        // Calculate the product of all the elements in the array.
        int product = 1;
        for (int num : nums) {
            product *= num;
        }

        // Create a new array to store the results.
        int[] result = new int[nums.length];

        // Iterate over the array, and for each element, divide the product by the element itself.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[i] = product / nums[i];
            } else {
                result[i] = 0;
            }
        }

        // Return the result array.
        return result;
    }

}
