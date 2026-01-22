class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int finaltotal=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int length=j-i+1;
                if(length%2!=0){
                int sub[]=Arrays.copyOfRange(arr,i,j+1);
                int subtotal=0;
                for(int k=0;k<sub.length;k++){
                    subtotal+=sub[k];
                }
                finaltotal+=subtotal;
            }
        }
    }
        return finaltotal;
        
    }
}
