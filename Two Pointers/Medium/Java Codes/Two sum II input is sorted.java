import java.util.Arrays;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store the index of each element in the array.
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }

        // Iterate over the map, and for each element, check if its complement exists in the map.
        // If it does, then return the indices of the two elements.
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indexMap.containsKey(complement) && indexMap.get(complement) != i) {
                return new int[]{i, indexMap.get(complement)};
            }
        }

        // If no two elements add up to the target, then return an empty array.
        return new int[]{};
    }

}
