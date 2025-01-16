class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1; // start from right
        int j = b.length() - 1; // start from right
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0; // Get bit from a or 0 if out of bounds
            /*
            int bitA;
            if (i >= 0) {
                bitA = a.charAt(i) - '0';
            } else {
                bitA = 0;
            }
            */

            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0; // Get bit from b or 0 if out of bounds
            /*
            int bitB;
            if (j >= 0) {
                bitB = b.charAt(j) - '0';
            } else {
                bitB = 0;
            }
            */

            int sum = bitA + bitB + carry; // Add bits and carry
            result.append(sum % 2); // Append the current bit
            /*
            0 % 2 = 0
            1 % 2 = 1
            2 % 2 = 0
            */
            carry = sum / 2; // Update carry
            /*
            0 / 2 = 0
            1 / 2 = 0
            2 / 2 = 1
            */
    
            i--; // Move to the left by one
            j--; // Move to the left by one
        }
    
        return result.reverse().toString(); // Reverse the result and return 
    }
}
