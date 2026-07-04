class Solution {
    public boolean isValidSudoku(char[][] board) {
       Set<String> hs = new HashSet<>();
       for(int r=0;r<9;r++){
        for(int c=0;c<9;c++){
            int num = board[r][c];
            if(num!='.') {

            if(!hs.add(num+"r"+r) || !hs.add(num+"c"+c) || !hs.add(num+"box"+c/3+"$"+r/3)){
                return false;
            }
        }
        }
       } 
       return true;
    }
}