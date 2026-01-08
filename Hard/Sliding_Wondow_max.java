class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=k;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int []sub=Arrays.copyOfRange(nums,i,i+n);
            int max=sub[0];
            for(int j=1;j<sub.length;j++){
                if(max < sub[j]){
                    max=sub[j];
                }
            }
            arr[i]=max;
        }
        return arr;
    }
}//my apporch time limited excited.

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||k==0){
            return new int[0];
        }
        int[] arr=new int[nums.length-k+1];
        Deque<Integer>dq=new ArrayDeque<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty()&&(dq.peekFirst()<i-k+1)){
                dq.pollFirst();
            }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                arr[index++]=nums[dq.peekFirst()];
            }

        }
        return arr;
    }
}//optimzed code.
