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
class Solution {
    public int maxArea(int[] height) {

        int max = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int width = j - i;

                int minHeight = Math.min(height[i], height[j]);

                int area = width * minHeight;

                max = Math.max(max, area);
            }
        }

        return max;
    }
}
