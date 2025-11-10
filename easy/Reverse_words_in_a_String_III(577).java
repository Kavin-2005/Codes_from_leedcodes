class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder sbc=new StringBuilder(arr[i]);
            sbc.reverse();
            sb.append(sbc);
        if(i<arr.length-1)
        sb.append(" ");}
return sb.toString();
        
    }
}
//my own method with chatgpt (asking help like logic and concept//
