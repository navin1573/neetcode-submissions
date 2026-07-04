class Solution {
    public int rob(int[] arr) {
        int[] memo = new int[arr.length];
        Arrays.fill(memo,-1);
        return dfs(arr,memo,0);
    }
    private int dfs(int[] arr,int[] memo,int i){
        if(i>=arr.length){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        int take = arr[i]+dfs(arr,memo,i+2);
        int notTake = dfs(arr,memo,i+1);
        memo[i]= Math.max(take,notTake);
        return memo[i];

}
}

