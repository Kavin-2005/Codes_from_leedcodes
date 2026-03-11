class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st=new Stack<>();
        int[]arr=new int[temp.length];
        st.push(0);
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty()&&temp[i]>temp[st.peek()]){
                int preIndex=st.pop();
                arr[preIndex]=i-preIndex;
            }
            st.push(i);
        }
        return arr;
        
    }
}
or 
  class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> st=new ArrayDeque<>();
        int[]arr=new int[temp.length];
        st.push(0);
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty()&&temp[i]>temp[st.peek()]){
                int preIndex=st.pop();
                arr[preIndex]=i-preIndex;
            }
            st.push(i);
        }
        return arr;
        
    }
}
