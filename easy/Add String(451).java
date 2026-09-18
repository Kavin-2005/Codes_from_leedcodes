class Solution {
    public String addStrings(String num1, String num2) {
        int sum=0;
        sum=Double.valueOf(num1).intValue()+Double.valueOf(num2).intValue();
        return String.valueOf(sum);
        
    }
}// owm methode for me nut it is not corretc 
       
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int c=0;
        while(i>=0||j>=0||c>0){
            int n1=(i>=0)?num1.charAt(i)-'0':0;
            int n2=(j>=0)?num2.charAt(j)-'0':0;
            int sum=n1+n2+c;
            sb.append(sum%10);
            c=sum/10;
            i--;
            j--;
        }      
        return sb.reverse().toString();
    }
}//correct versioln
