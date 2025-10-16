class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder sb=new StringBuilder(t);
        for(int i=0;i<s.length();i++){
            for(int j=0;j<sb.length();j++){
                if(s.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(j);
                    break;

                }
            }
        }
        return sb.charAt(0);   
    }
}
