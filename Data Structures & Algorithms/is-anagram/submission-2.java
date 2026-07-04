class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if(l1!=l2) return false;
        Map<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<l1;i++){
            char c1 = s.charAt(i);
            char c2 =t.charAt(i);
            hm.put(c1,hm.getOrDefault(c1,0)+1);
            hm.put(c2,hm.getOrDefault(c2,0)-1);
        }
        for(int i:hm.values()){
            if(i!=0) return false;
        }
        return true;
    }
}
