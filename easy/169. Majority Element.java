class Solution {
    public int majorityElement(int[] nums) {
        int flag=1;
        Arrays.sort(nums);
        int max_count =1;
        int number=nums[0];
        for(int i=0;i<nums.length;i++){
            if(arr[i]==arr[i+1]){
                flag++;
            }
            elae{
                max_count=flag;
                number=nums[i];
            }

        }
        
    }
}
using haph map
    import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 2, 3, 2, 5, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxElement = -1;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println("Number repeated maximum times: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
}

