class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[]r_m=new int [row];
        Arrays.fill(r_m,Integer.MAX_VALUE);
        int []c_m=new int[col];
        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                int min=matrix[i][j];
                r_m[i]=Math.min(r_m[i],min);
                c_m[j]=Math.max(c_m[j],min);
                }         
        }
        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                int min=matrix[i][j];
                if(min==r_m[i]&&min==c_m[j]){
                    return Collections.singletonList(min);
                }
            }
        }
        return Collections.emptyList(); 
    }
}
