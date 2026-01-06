class Solution {
    public int findPeakElement(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                temp=i+1;
            }
        }
        return temp;
        
    }
}
