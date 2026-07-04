class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
       helper(0,candidates,target,ans,cur,0);
       return ans; 
    }
    void helper(int i,int[] arr,int tar,List<List<Integer>> ans,List<Integer> cur,int curSum){
        if(curSum==tar){
            ans.add(new ArrayList<>(cur));
            return;
        }

        if(curSum>tar || i==arr.length){
            return;
        }
         
        cur.add(arr[i]);
        curSum+=arr[i];
        helper(i+1,arr,tar,ans,cur,curSum);
        int rem =cur.get(cur.size()-1); 
        cur.remove(cur.size()-1);
        curSum-=rem;
        while(i+1<arr.length && arr[i]==arr[i+1]) i++;
        helper(i+1,arr,tar,ans,cur,curSum);
    }
}
