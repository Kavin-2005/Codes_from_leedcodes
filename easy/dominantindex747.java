class Solution {
    public int dominantIndex(int[] nums) {
       int max=-1;
        int secoundmax=-1;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secoundmax=max;
                max=nums[i];
                index=i;
            }
            else if(nums[i]>secoundmax){
                secoundmax=nums[i];
            }
        }
        if(max>=2*secoundmax) return index;
        return -1; 
    }
}
//own with out chatgpt
class Solution {
    public int dominantIndex(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        if(arr[nums.length-1]>=2*arr[nums.length-2]){
            for(int i=0;i<nums.length;i++){
                if(arr[nums.length-1]==nums[i]){
                    return i;
                }
            }
        }
        return -1;
        
    }
}
