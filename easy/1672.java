class Solution {
    public int maximumWealth(int[][] accounts) {
        int total=0;
        int n=accounts.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(total<sum){
                total=sum;
            }
        }
        return total;
        
    }
}
