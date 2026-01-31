class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        // Step 1: Frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Step 2: Add elements in arr2 order
        for (int num : arr2) {
            int freq = map.get(num);
            while (freq-- > 0) {
                result.add(num);
            }
            map.remove(num);
        }

        // Step 3: Sort remaining keys
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        // Step 4: Add remaining elements
        for (int key : keys) {
            int freq = map.get(key);
            while (freq-- > 0) {
                result.add(key);
            }
        }

        // Step 5: Convert to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
