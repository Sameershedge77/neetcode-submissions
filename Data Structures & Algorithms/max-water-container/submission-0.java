class Solution {
    public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {

        // Calculate area
        int newArea = Math.min(height[left], height[right])
                    * (right - left);

        // Update maxArea
        if (newArea > maxArea) {
            maxArea = newArea;
        }

        // Move the shorter pointer
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxArea;
    }
}
