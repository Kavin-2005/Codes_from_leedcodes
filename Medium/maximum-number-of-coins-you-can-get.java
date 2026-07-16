// slite chages made by chat gpt
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int n = piles.length;
        int ans = 0;

        for (int i = n - 2, count = 0; count < n / 3; i -= 2, count++) {
            ans += piles[i];
        }

        return ans;
    }
}
//me amd mohan try 
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int l=piles.length/3,result=0;
        int temp=piles.length;
        for(int i=0;i<l;i++){
            temp-=2;
            result+=piles[temp];
        }
        return result;
        
    }
}
