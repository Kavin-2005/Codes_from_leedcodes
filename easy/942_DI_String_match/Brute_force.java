class Solution {
    public int[] diStringMatch(String s) {
        Scanner sc=new Scanner (System.in);
        int arr[]=new int[s.length()+1];
        int pos =0,start=0,end=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                    arr[pos++]=start++;}
            else{
                    arr[pos++]=end--;
            }
        }
        arr[pos]=start;
        return arr;
    }
}
