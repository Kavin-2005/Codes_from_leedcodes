class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> summary=new ArrayList();
         if(nums.length==0) return summary;
         int start=nums[0];
        for(int i=1;i<=nums.length;i++){
            if(i==nums.length||nums[i]!=nums[i-1]+1){
                if(start==nums[i-1]){
                    summary.add(String.valueOf(start));
                }
                else{
                    summary.add(start+"->"+nums[i-1]);
                }
                if(i<nums.length){
                    start=nums[i];
                }
            }
        }
        return summary;
    }
}
