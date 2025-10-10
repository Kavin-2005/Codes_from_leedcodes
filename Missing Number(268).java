//brute force

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;

        for (int i = 0; i <= nums.length; i++) {  // Loop through all numbers from 0 to n
            int n = 0;

            for (int j = 0; j < nums.length; j++) { // Check if i exists in nums
                if (i == nums[j]) {
                    n++;   // Found i
                    break;
                }
            }

            if (n == 0) {  // If i was not found
                sum = i;   // i is the missing number
            }
        }

        return sum;
    }
}
