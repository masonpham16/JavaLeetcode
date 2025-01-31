class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last1 = m - 1;     // Last valid element in nums1
        int last2 = n - 1;     // Last element in nums2
        int last = m + n - 1;  // Last position in nums1

        // Merge from the end of nums1 and nums2
        while (last1 >= 0 && last2 >= 0) {
            if (nums1[last1] > nums2[last2]) {
                nums1[last] = nums1[last1];
                last1--;
            } else {
                nums1[last] = nums2[last2];
                last2--;
            }
            last--;
        }

        // If nums2 has remaining elements, copy them
        while (last2 >= 0) {
            nums1[last] = nums2[last2];
            last2--;
            last--;
        }
    }
}
