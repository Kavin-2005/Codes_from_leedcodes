class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]){
                return true;
            }
        }return false;     
    }
}
another method
  class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}

