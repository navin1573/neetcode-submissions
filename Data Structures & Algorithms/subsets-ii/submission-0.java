class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subSet = new ArrayList<>();
        List<Integer> curSet = new ArrayList<>();
       Arrays.sort(nums); 
       helper(0,nums,subSet,curSet);
       return subSet;
    }
    void helper(int i,int[] nums,List<List<Integer>> subSet,List<Integer> curSet){
            if(i>=nums.length){
                subSet.add(new ArrayList<>(curSet));
                return;
            }

            curSet.add(nums[i]);
            helper(i+1,nums,subSet,curSet);
            curSet.remove(curSet.size()-1);
            while(i+1<nums.length && nums[i]==nums[i+1]) i+=1;
            helper(i+1,nums,subSet,curSet);
    }
}
