class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int arr[] = new int[n + 1];

        int start = 0, end = n;

        for (int i = 0; i < n; i++) {
            arr[i] = (s.charAt(i) == 'I') ? start++ : end--;
        }

        arr[n] = start;

        return arr;
    }
}
