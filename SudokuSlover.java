class SudokuSlover {
    public static boolean canIKeep(int row,int col,char num,char[][] board){
        for(int i=0;i<9;i++){
            if(board[row][i]==num){
                return false;
            }
            if(board[i][col]==num){
                return false;
            }
            int newRow=3*(row/3)+(i/3);
            int newCol=3*(col/3)+(i%3);
            if(board[newRow][newCol]==num){
                return false;
            }
        }
        return true;
    }
    public boolean solve(int row,int col,char[][] board){
        if(row==9){
            return true;
        }
        if(col==9){
            return solve(row+1,0,board);
        }
        if(board[row][col]!='.'){
            return solve(row,col+1,board);
        }
        for(char num='1';num<='9';num++){
            if(canIKeep(row,col,num,board)){
                board[row][col]=num;
                if(solve(row,col+1,board)){
                return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        solve(0,0,board);
    }
}