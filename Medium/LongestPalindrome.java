class Solution {
   static String pd1(String s){
        int l=0;
        int k=0;
        String str="";
        for(int i=0;i<s.length();i++){
            l=i;
            k=i;
            String sub="";
            while(l>=0&&k<s.length()&&s.charAt(l)==s.charAt(k)){
                l--;
                k++;
            }
            sub+=s.substring(l+1,k);
            if(str.length()<sub.length()){
                str=sub;
            }
        }
        for(int i=0;i<s.length();i++){
            l=i;
            k=i+1;
            String sub="";
            while(l>=0&&k<s.length()&&s.charAt(l)==s.charAt(k)){
                l--;
                k++;
            }
            sub+=s.substring(l+1,k);
            if(str.length()<sub.length()){
                str=sub;
            }
        }
        return str;
       
    }
    public String longestPalindrome(String s) {
        return pd1(s);
    }
}
