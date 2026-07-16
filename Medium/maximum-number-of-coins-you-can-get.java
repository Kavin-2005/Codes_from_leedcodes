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
