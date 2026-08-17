class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int pos=0;

        // Find sequential prefix sum
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                pos++;
                sum += nums[i];
            } else {
                break;
            }
        }
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=pos;j<len;j++){
                if(sum==nums[j]){
                    sum++;
                }
            }
        }
       return sum;
    }
}
