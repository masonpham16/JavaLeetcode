class Solution {
    public int[] plusOne(int[] digits) {

        int current = digits.length-1;
        int next = current - 1;
        while (current >= 0) {
            if (digits[current] < 9){
                digits[current]++;
                return digits;
            }
            digits[current] = 0;
            current--;

        }
        int[] newCurrent = new int[digits.length + 1];
        newCurrent[0] = 1;
        return newCurrent;

        
    }

}
