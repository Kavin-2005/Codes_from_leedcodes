//my methode 
class Solution {
    public boolean hasAlternatingBits(int n) {
        String str=Integer.toBinaryString(n);//int to binary string
        char [] arr=str.toCharArray();//storing it in charArray
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){//checking first and its adjecent number
                return false;
            }
        }
        return true;
    }
}
or 
    //alternaive methode oms 
  class Solution {
    public boolean hasAlternatingBits(int n) {
        String str=Integer.toBinaryString(n);//int to binary
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){//checks its character to near one 
                return false;
            }
        }
        return true;
    }
}
