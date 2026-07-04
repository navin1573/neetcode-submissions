class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();
        for(String s:strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            hm.putIfAbsent(sorted,new ArrayList<>());
            hm.get(sorted).add(s);
        }
    return new ArrayList<>(hm.values());}
}