class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
      Map<Character,Integer> s1 = new HashMap<>(); 
      Map<Character,Integer> s2 = new HashMap<>(); 
      for(char i:s.toCharArray()){
        s1.put(i,s1.getOrDefault(i,0)+1);
      }
      for(char i:t.toCharArray()){
         s2.put(i,s2.getOrDefault(i,0)+1);
      }
   return s1.equals(s2); }
}
