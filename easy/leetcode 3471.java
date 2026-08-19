import java.util.*;
//chagpt version
class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of every number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // k == 1
        if (k == 1) {
            int ans = -1;

            for (int num : nums) {
                if (map.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }

            return ans;
        }

        // k == n
        if (k == n) {
            int ans = -1;

            for (int num : nums) {
                ans = Math.max(ans, num);
            }

            return ans;
        }

        // 1 < k < n
        int ans = -1;

        if (map.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (map.get(nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}
//my version 
class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k<=1&&nums.length==2){
            if(nums[0]==nums[1])
                return -1;
            if(nums[0]>nums[1])
            return nums[0];
            if(nums[0]<nums[1])
            return nums[1];
        }

        if(nums[0]<nums[nums.length-1]){
            if(nums[nums.length-1]!=nums[nums.length-k]){
                return nums[nums.length-1];

            }
        }
        return nums[0];
    }
}

