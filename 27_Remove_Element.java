class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // Index to place valid elements

        // Iterate through the array
        for (int num : nums) {
            if (num != val) {
                nums[index++] = num; // Only copy valid elements
            }
        }

        // The length of the modified array is the number of valid elements
        return index;
    }
}
