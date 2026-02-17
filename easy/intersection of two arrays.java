class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> hs=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    hs.add(nums2[j]);
                     nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int []arr=new int[hs.size()];
        int index=0;
        for(int i:hs){
            arr[index++]=i;
        }
        return arr;
    }
}
