class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []marscode=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs=new HashSet<>();
        for(String i:words){
            String temp="";
            for(char ch:i.toCharArray()){
                temp+=marscode[ch-'a'];
            }
            hs.add(temp);
        }
        return hs.size(); 
    }
}
