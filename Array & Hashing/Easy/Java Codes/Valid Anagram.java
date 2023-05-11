/**
 * This function takes two strings and returns true if they are anagrams of each other.
 * An anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
 */
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        // The strings have different lengths, so they cannot be anagrams.
        return false;
    }

    // Convert the strings to arrays of characters.
    char[] sortedS = s.toCharArray();
    char[] sortedT = t.toCharArray();

    // Sort the characters in each array.
    Arrays.sort(sortedS);
    Arrays.sort(sortedT);

    // Compare the sorted arrays.
    // If they are equal, then the strings are anagrams.
    return Arrays.equals(sortedS, sortedT);
}
