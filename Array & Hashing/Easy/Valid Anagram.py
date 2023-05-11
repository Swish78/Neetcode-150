class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # Check if the lengths of the strings are equal.
        if len(s) != len(t):
            # If the lengths are not equal, then the strings cannot be anagrams.
            return False

        # Sort the characters of each string.
        # Check if the sorted strings are equal.
        # If they are equal, then the strings are anagrams.
        return sorted(s) == sorted(t)
