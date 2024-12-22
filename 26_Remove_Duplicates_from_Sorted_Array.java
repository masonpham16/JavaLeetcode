class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add all unique elements to the LinkedHashSet
        for (int num : nums) {
            set.add(num);
        }

        // Copy unique elements back to the array
        int index = 0;
        for (int num : set) {
            nums[index++] = num;
        }

        // Return the number of unique elements
        return set.size();
    }
}
