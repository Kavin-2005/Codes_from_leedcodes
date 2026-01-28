class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        if(hs.size()<3){
            return Collections.max(hs);
        }
        for(int i=0;i<2;i++){
            hs.remove(Collections.max(hs));
        }
        return Collections.max(hs); 
        
    }
}
class Solution {
    public int thirdMax(int[] nums) { 
        int res[]=Arrays.stream(nums).distinct().toArray();
        Arrays.sort(res);
        if(res.length<3){
            return res[res.length-1];
        }
        return res[res.length-3];
    }
}
