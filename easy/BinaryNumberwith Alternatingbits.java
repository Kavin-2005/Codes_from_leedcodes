class Solution {
    public boolean hasAlternatingBits(int n) {
        String str=Integer.toBinaryString(n);
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
or 
  class Solution {
    public boolean hasAlternatingBits(int n) {
        String str=Integer.toBinaryString(n);
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
