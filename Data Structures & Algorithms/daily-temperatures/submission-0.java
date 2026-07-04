class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] res = new int[temp.length];
       for(int i=0;i<temp.length;i++){
        while(!st.isEmpty() && temp[i]>temp[st.peek()]){
            int id = st.pop();
           res[id] = i-id;
        }
        st.push(i);
       }
       return res; 
    }
}
