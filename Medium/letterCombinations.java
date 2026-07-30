class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0)
            return ans;

        String[] map = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
//this is for 1 digit
        if (digits.length() == 1) {
            String s = map[digits.charAt(0) - '0'];
            for (char c : s.toCharArray())
                ans.add(String.valueOf(c));
        }
//this is for 2 digit 
        else if (digits.length() == 2) {
            String first = map[digits.charAt(0) - '0'];
            String second = map[digits.charAt(1) - '0'];

            for (char c1 : first.toCharArray()) {
                for (char c2 : second.toCharArray()) {
                    ans.add("" + c1 + c2);
                }
            }
        }
//this is for 3 digit
        else if (digits.length() == 3) {
            String first = map[digits.charAt(0) - '0'];
            String second = map[digits.charAt(1) - '0'];
            String third = map[digits.charAt(2) - '0'];

            for (char c1 : first.toCharArray()) {
                for (char c2 : second.toCharArray()) {
                    for (char c3 : third.toCharArray()) {
                        ans.add("" + c1 + c2 + c3);
                    }
                }
            }
        }
//this is for 4 digit
        else if (digits.length() == 4) {
            String first = map[digits.charAt(0) - '0'];
            String second = map[digits.charAt(1) - '0'];
            String third = map[digits.charAt(2) - '0'];
            String fourth = map[digits.charAt(3) - '0'];

            for (char c1 : first.toCharArray()) {
                for (char c2 : second.toCharArray()) {
                    for (char c3 : third.toCharArray()) {
                        for (char c4 : fourth.toCharArray()) {
                            ans.add("" + c1 + c2 + c3 + c4);
                        }
                    }
                }
            }
        }

        return ans;
    }
}
// this is done by chatgpt 
//with the help of my idea
