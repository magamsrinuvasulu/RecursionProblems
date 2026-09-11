class WordSearch {

    public boolean exist(char[][] board, String word, int row, int col, int index) {

        if(row < 0 || row == board.length || col < 0 ||
           col == board[0].length || board[row][col] == '$' ||
           board[row][col] != word.charAt(index))
            return false;

        if(index == word.length() - 1)
            return true;

        char data = board[row][col];
        board[row][col] = '$';

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        for(int[] each : dir) {
            if(exist(board, word, row + each[0], col + each[1], index + 1)) {
                board[row][col] = data;
                return true;
            }
        }

        board[row][col] = data;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(exist(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }
}