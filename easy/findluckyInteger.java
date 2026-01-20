class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i:arr){
            if(hs.containsKey(i)){
                hs.put(i,hs.get(i)+1);
            }
            else{
                hs.put(i,1);
            }

        }
        int ans=-1;
        for(Map.Entry<Integer,Integer> es:hs.entrySet()){
            if(es.getKey().equals(es.getValue())){
                ans=Math.max(ans,es.getKey());
            }
        }
        return ans;

        
    }
}
