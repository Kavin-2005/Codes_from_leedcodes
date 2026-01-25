//my owm methode
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length<=1){
            return nums[0];
        }
        int ans=Integer.MIN_VALUE;
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
            int sub[]=Arrays.copyOfRange(nums,i,j+1);
            int sum=0;
            for(int k=0;k<sub.length;k++){
                sum+=sub[k];
            }
            if(ans<=sum){
                ans=sum;
            }
        }
    }
    if(ans<total){
        return total;
    }
        return ans; 
    }
}
//chat gpt methode
class Solution {
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
