class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder build = new StringBuilder(); // proper way to build string
        int currInd = 0;
        boolean continueLoop = true;

        while (continueLoop) {
            if (currInd >= strs[0].length()) { // check if still inbound
                break; // if not inbound. break.
            }
            char currChar = strs[0].charAt(currInd); // get char from first word 

            for (int word = 1; word < strs.length; ++word) { // check if all words have same character
                if (currInd >= strs[word].length() || strs[word].charAt(currInd) != currChar) {
                    continueLoop = false;
                    break;
                }
            }

            if(continueLoop) {
                build.append(currChar);
                currInd++;
            }
        }

        return build.toString(); // returns the result
        
    }
}
