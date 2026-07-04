class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length()==0) return 0;
       int r=0;
       int l=0;
       Set<Character> hs = new HashSet<>();
       int maxLen = 0;
       while(r<s.length()){
        char ch = s.charAt(r);
        while(hs.contains(ch)){ 
           hs.remove(s.charAt(l));
           l++; 
        }

            hs.add(ch);
            maxLen = Math.max(maxLen,r-l+1);
            r++; 
       }
       return maxLen; 
    }
}
