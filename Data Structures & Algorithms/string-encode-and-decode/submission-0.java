class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int idx = 0;
        int totallen = str.length();
        while(idx<totallen){
        int del = str.indexOf('#',idx);
        int len = Integer.parseInt(str.substring(idx,del));
        int startIdx = del+1;
        int endIdx = startIdx+len;
        ans.add(str.substring(startIdx,endIdx));
        idx = endIdx;
    }
    return ans;
}
}
