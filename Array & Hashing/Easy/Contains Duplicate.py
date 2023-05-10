class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # Create an empty set to store unique elements
        sn = set()

        # Iterate through each element in the input list
        for i in nums:
            # If the element is already in the set, return True
            if i in sn:
                return True
            # Otherwise, add the element to the set
            sn.add(i)

        # If no duplicates were found, return False
        return False
