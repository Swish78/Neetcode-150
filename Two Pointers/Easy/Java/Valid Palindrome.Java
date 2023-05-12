public class Solution {

    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        // Convert the string to lowercase and remove all punctuation.
        s = s.toLowerCase().replaceAll("\\p{Punct}", "");

        // Iterate through the string from the beginning and end, and compare each character.
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        // If we reach this point, the string is a palindrome.
        return true;
    }

}
