import java.util.ArrayList;

class Solution {
    private String longestWord = "";

    // Update the longest palindrome if the new one is longer
    private void updateLongest(String candidate) {
        if (candidate.length() > longestWord.length()) {
            longestWord = candidate;
        }
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return ""; // Handle edge cases
        }

        // Check for odd-length palindromes
        oddPal(s);

        // Check for even-length palindromes
        evenPal(s);

        // Return the longest palindrome
        return longestWord;
    }

    public void oddPal(String word) {
        for (int i = 0; i < word.length(); i++) {
            int range = 0;

            // Expand outward to find the largest odd-length palindrome centered at i
            while (i - range >= 0 && i + range < word.length() &&
                   word.charAt(i - range) == word.charAt(i + range)) {
                range++;
            }

            // Extract the palindrome
            String currentPalindrome = word.substring(i - (range - 1), i + range);

            // Update the longest palindrome
            updateLongest(currentPalindrome);
        }
    }

    public void evenPal(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            int range = 0;

            // Expand outward to find the largest even-length palindrome
            while (i - range >= 0 && i + 1 + range < word.length() &&
                   word.charAt(i - range) == word.charAt(i + 1 + range)) {
                range++;
            }

            // Extract the palindrome
            String currentPalindrome = word.substring(i - (range - 1), i + 1 + range);

            // Update the longest palindrome
            updateLongest(currentPalindrome);
        }
    }
}
