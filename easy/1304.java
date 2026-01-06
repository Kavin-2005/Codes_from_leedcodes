class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int sum = 0;
        if(n%2!=0){
            arr[sum++]=0;
        }
        for (int i = 1; i <= n/2; i++) {
            arr[sum++]=i;
            arr[sum++]=-i;
        }
        return arr;
    }
}
