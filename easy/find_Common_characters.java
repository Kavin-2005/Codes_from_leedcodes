//my own solution
class Solution {
    public List<String> commonChars(String[] words) {

        List<String> ans = new ArrayList<>();

        // Convert each word to a character array
        char[][] arr = new char[words.length][];

        for (int i = 0; i < words.length; i++) {
            arr[i] = words[i].toCharArray();
        }

        // Traverse the first word
        for (char ch : arr[0]) {

            boolean common = true;

            // Check in all remaining words
            for (int i = 1; i < arr.length; i++) {

                boolean found = false;

                for (int j = 0; j < arr[i].length; j++) {

                    if (arr[i][j] == ch) {
                        arr[i][j] = '#'; // Mark as used
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    common = false;
                    break;
                }
            }

            if (common) {
                ans.add(String.valueOf(ch));
            }
        }

        //optimized solution
        
        class Solution {
    public List<String> commonChars(String[] words) {

        List<String> ans = new ArrayList<>();

        // Frequency of first word
        int[] minFreq = new int[26];

        for (char ch : words[0].toCharArray()) {
            minFreq[ch - 'a']++;
        }

        // Compare with remaining words
        for (int i = 1; i < words.length; i++) {

            int[] freq = new int[26];

            for (char ch : words[i].toCharArray()) {
                freq[ch - 'a']++;
            }

            // Keep the minimum frequency
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], freq[j]);
            }
        }

        // Build the answer
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                ans.add(String.valueOf((char)(i + 'a')));
                minFreq[i]--;
            }
        }

        return ans;
    }
}

        return ans;
    }
}
