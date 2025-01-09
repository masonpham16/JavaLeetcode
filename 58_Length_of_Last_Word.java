class Solution {
    public int lengthOfLastWord(String s) {

        // i want to make an array
        // use delimiter to distinguish words
        String[] words = s.trim().split("\\s+");

        // get the length of the last word in the array
        int lengthOfWord = words[words.length-1].length();
        return lengthOfWord;
        
    }
}
