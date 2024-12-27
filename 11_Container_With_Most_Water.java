class Solution {
    public int maxArea(int[] height) {
        int most = 0; // maximum area
        int left = 0; // Start pointer
        int right = height.length - 1; // End pointer;

        while (left < right) {
            // Calculate height and width of container
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;

            // Calculate area and update max area
            int area = minHeight * width;
            most = Math.max(most, area);

            // Move pointer pointing to shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return most;
    }
}
