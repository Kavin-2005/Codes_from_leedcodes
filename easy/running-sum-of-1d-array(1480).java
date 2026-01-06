class Solution {
    public int[] runningSum(int[] nums) {
        int arr[]=new int [nums.length];
        int k=0;
        int sum=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                arr[k++]=sum;
            }
            else{
                sum=sum+nums[i];
                arr[k++]=sum;
            }
        }
        return arr;
        
    }
}
