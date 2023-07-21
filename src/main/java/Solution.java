public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] chars = word.toCharArray();
        char start = chars[0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == start) {
                    if (backtrack(board, chars, 0, i, j)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean backtrack(char[][] board, char[] chars, int index, int i, int j) {
        if (index == chars.length - 1 && chars[index] == board[i][j]) {
            return true;
        }

        if (chars[index] != board[i][j]) {
            return false;
        }


        char temp = board[i][j];
        board[i][j] = '-';
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] direction : directions) {
            int nextI = i + direction[0];
            int nextJ = j + direction[1];
            if (nextI >= 0 && nextI < board.length && nextJ >= 0 && nextJ < board[0].length && board[nextI][nextJ] != '-') {
                if (backtrack(board, chars, index + 1, nextI, nextJ)) {
                    return true;
                }
                ;
            }
        }

        board[i][j] = temp;

        return false;
    }
}
