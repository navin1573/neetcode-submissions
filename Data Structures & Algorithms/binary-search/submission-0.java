class Solution {
    public int search(int[] n, int t) {
        int l=0;
        int mid=0;
        int r=n.length-1;
        while(l<=r)
        {    mid = l+(r-l)/2;
            if(n[mid]==t)
                return mid;
            else if(n[mid]>t)
                r=mid-1;
            else if(n[mid]<t)
                l=mid+1; 
        }
   return -1; }
}
