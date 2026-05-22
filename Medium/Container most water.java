class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int max = 0;

        while (left < right) {

            int width = right - left;

            int minHeight = Math.min(height[left], height[right]);

            int area = width * minHeight;

            max = Math.max(max, area);

            // Move smaller height pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
