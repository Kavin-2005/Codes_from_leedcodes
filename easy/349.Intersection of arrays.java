class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hm1=new HashSet<>();
        HashSet<Integer>hm2=new HashSet<>();
        for(int i:nums1) hm1.add(i);
        for(int i:nums2) if(hm1.contains(i))hm2.add(i);
        int[]result=new int[hm2.size()];
        int inderx=0;
        for(int i:hm2){
            result[inderx++]=i;
        }
        return result;
    }
}
