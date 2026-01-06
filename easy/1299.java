class Solution {
    public int[] replaceElements(int[] arr) {
        int max=arr[arr.length-1];
        for(int i=arr.length-2;i>0;i--){
            int temp=arr[i];
            arr[i]=max;
            if(temp>max){
                max=temp;
            }
        }
        arr[0]=max;
        arr[arr.length-1]=-1;
        return arr;
    }
}
