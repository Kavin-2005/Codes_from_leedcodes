class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(i==j){
                    j=j+1;
                }
                int secoundsum=((nums[i]-1)*(nums[j]-1));
                if(max<secoundsum){
                    max=secoundsum;
                }

            }
        }
        return max;
    }
}//11ms run time due to two for loop
class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        max=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        return max;
    }
}//5ms without forloop time takes to sort
