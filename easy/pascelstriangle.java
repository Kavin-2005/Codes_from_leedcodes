class Solution {
    public List<List<Integer>> generate(int N) {
        List<List<Integer>> pascals=new ArrayList();
        for(int i=0;i<N;i++){
            List<Integer> row=new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    List<Integer> previousrow= pascals.get(i-1);
                    row.add(previousrow.get(j)+previousrow.get(j-1));
                }
            }
            pascals.add(row);
        }
                    return pascals;

    }
}
