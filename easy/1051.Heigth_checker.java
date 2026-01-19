class Solution {
    public int heightChecker(int[] heights) {
        int []arr=heights.clone();
                for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int s=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i]){
              s++;  
            }
        }
        return s;
        
    }
}
