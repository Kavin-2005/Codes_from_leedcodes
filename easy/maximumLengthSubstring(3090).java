// Hash Map
import java.util.HashMap;

class Solution {
    public int maximumLengthSubstring(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                // Character occurs more than twice
                if (map.get(ch) > 2) {
                    break;
                }

                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }
}
// brute force
class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] count = new int[26];

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                count[ch - 'a']++;

                // Character appears more than 2 times
                if (count[ch - 'a'] > 2) {
                    break;
                }

                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }
}
