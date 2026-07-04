class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int l=0,r=heights.length-1;
        while(l<r){
            if(heights[l]<heights[r])
            {
             max = Math.max(max,heights[l]*(r-l));
               l++;
            }
            else
            {
                max = Math.max(max,heights[r]*(r-l));
                r--;
            }
        }
        
    return max;}
}
