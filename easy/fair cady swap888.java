class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1=0,sum2=0;
        for(int i:A) sum1+=i;
        for(int j:B) sum2+=j;
        int diff=(sum2-sum1)/2;
        HashSet<Integer>hs=new HashSet<>();
        for(int i:B){
            hs.add(i);
        }
        for(int i:A){
            int b=i+diff; 
                if(hs.contains(b)){
                    return new int[]{i,b};
                }
            
        }
        return new int[0];
    }
}
