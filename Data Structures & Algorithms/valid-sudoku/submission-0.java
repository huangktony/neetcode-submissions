class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
        }
        HashSet<Character>[] cols = new HashSet[9];
        for(int i = 0; i < 9; i++){
            cols[i] = new HashSet<>();
        }
        HashSet<Character>[][] squares = new HashSet[3][3];
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                squares[r][c] = new HashSet<>();
            }
        }
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                char curVal = board[r][c];
                if(curVal != '.'){
                    if(!rows[r].add(curVal) || !cols[c].add(curVal) || !squares[r/3][c/3].add(curVal)){
                        return false;
                    }
                }
            }
        }

        return true;

    }
}
