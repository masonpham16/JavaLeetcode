class Solution {
    public int reverse(int x) {
        int reversed = 0;
    
        while (x != 0) {
            int digit = x % 10; // Extract last digit
            x /= 10;            // Remove last digit
    
            // Check for overflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
    
            // Update reversed
            reversed = reversed * 10 + digit;
        }
    
        return reversed;
    }
}
