class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int container=0;
        while(l<r){
            if(heights[l]<heights[r]){
                 container=Math.max(container,(r-l)*heights[l]);
                 System.out.println(container+" l");
                l++;
            }
            else{
                container=Math.max(container,(r-l)*heights[r]);
                 System.out.println(container+" r");
                r--;
            }
        }
    return container;}
}

