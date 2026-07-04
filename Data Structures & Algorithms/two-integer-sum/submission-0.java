class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int comp = target-num;
            if(hm.containsKey(comp)){
                return new int[] { hm.get(comp),i};
            }
            hm.put(num,i);
        }
   return new int[] {}; }
}
