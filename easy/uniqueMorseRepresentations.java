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
// secoud methode 
import java.util.*;

class Solution {

    private static final String[] MORSE = {
        ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
        "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
        "..-","...-",".--","-..-","-.--","--.."
    };

    public int uniqueMorseRepresentations(String[] words) {

        Set<String> set = new HashSet<>();

        for (String word : words) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                sb.append(MORSE[word.charAt(i) - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}
//third methode
import java.util.*;

class Solution {

    private static final String[] MORSE = {
        ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
        "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
        "..-","...-",".--","-..-","-.--","--.."
    };

    public int uniqueMorseRepresentations(String[] words) {

        Set<String> set = new HashSet<>();

        for (String word : words) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                sb.append(MORSE[word.charAt(i) - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}

