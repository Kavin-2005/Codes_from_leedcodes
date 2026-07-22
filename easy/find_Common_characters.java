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

        return ans;
    }
}
