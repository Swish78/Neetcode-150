public class Solution {

    /**
     * This function takes an array of integers and returns true if the array contains any duplicates, false otherwise.
     *
     * @param nums The array of integers.
     * @return True if the array contains any duplicates, false otherwise.
     */
    public boolean containsDuplicate(int[] nums) {
        // Create a set to store the unique elements of the array.
        Set<Integer> set = new HashSet<>();

        // Iterate over the array.
        for (int i : nums) {
            // Check if the current element is already in the set.
            if (set.contains(i)) {
                // If it is, return true.
                return true;
            }

            // Otherwise, add the element to the set.
            set.add(i);
        }

        // If the loop finishes without returning true, then the array does not contain any duplicates.
        return false;
    }
}
