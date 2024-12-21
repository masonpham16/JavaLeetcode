class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        ArrayList<Character> current = new ArrayList<>();
        char[] word = s.toCharArray();

        for (int i = 0; i < word.length; ++i) {
            char letter = word[i];

            // Remove characters until the duplicate is gone
            while (current.contains(letter)) {
                current.remove(0);
            }

            // Add the current letter
            current.add(letter);

            // Update the longest length
            longest = Math.max(longest, current.size());
        }

        return longest;
    }
}
