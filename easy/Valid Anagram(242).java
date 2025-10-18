import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char []arr=s.toCharArray();
        char []arr2=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        String str=new String(arr);
        String str1=new String(arr2);
        if(str.equals(str1)){
            return true;
        }
        else return false; 
    }
}
