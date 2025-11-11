class Solution {
    public int majorityElement(int[] nums) {
        int flag=1;
        Arrays.sort(nums);
        int max_count =1;
        int number=nums[0];
        for(int i=0;i<nums.length;i++){
            if(arr[i]==arr[i+1]){
                flag++;
            }
            elae{
                max_count=flag;
                number=nums[i];
            }

        }
        
    }
}
