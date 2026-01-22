class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        xor ^= n;
        return xor;
    }
}
own 
  class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
           if (nums[0] != 0) {
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]-1){
                return i+1;
            }
        }
        return nums[nums.length-1]+1;
    }

        
    }
