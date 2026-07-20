class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();

        // Replace punctuation with spaces
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        String[] words = paragraph.split("\\s+");

        int[] freq = new int[words.length];

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(""))
                continue;

            boolean bannedWord = false;

            for (String b : banned) {
                if (words[i].equals(b)) {
                    bannedWord = true;
                    break;
                }
            }

            if (bannedWord)
                continue;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    freq[i]++;
                }
            }
        }

        int max = 0;
        String ans = "";

        for (int i = 0; i < words.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = words[i];
            }
        }

        return ans;
    }
}
