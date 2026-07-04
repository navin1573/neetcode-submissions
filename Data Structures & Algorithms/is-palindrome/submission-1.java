class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-z0-9]","");
        int n=s.length();
    int l=0,r=n-1;
    while(l<r){
        char a = s.charAt(l);
        char b = s.charAt(r);
        if(Character.toLowerCase(a)!=Character.toLowerCase(b)){
            return false;
        }
        l++;
        r--;
    }
return true;}
}
