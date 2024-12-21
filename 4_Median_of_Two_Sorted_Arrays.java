class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> all = new ArrayList<>();
        int i = 0, j = 0;
        // Merge the two sorted arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                all.add(nums1[i]);
                i++;
            } else {
                all.add(nums2[j]);
                j++;
            }
        } 
        // Add remaining elements from nums1, if any
        while (i < nums1.length) {
            all.add(nums1[i]);
            i++;
        }
        // Add remaining elements from nums2, if any
        while (j < nums2.length) {
            all.add(nums2[j]);
            j++;
        }
        // Calculate the median
        int n = all.size();
        if (n % 2 == 1) {
            return all.get(n / 2); // Odd size, return the middle element
        } else {
            // Even size, return the average of the two middle elements
            return (all.get(n / 2 - 1) + all.get(n / 2)) / 2.0;
        }
    }
}
