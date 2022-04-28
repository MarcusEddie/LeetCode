package problems.medium;

public class M289 {

    public static void main(String[] args) {
        int[][] board = {{1,1},{1,0}};
        new Solution().imageSmoother(board);
    }
    
    private static class Solution {
        public int[][] imageSmoother(int[][] board){
            int[][] matrix = new int[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    int cnt = 1;
                    int sum = board[i][j];
                    if (i - 1 >= 0 ) {
                        cnt++;
                        sum += board[i - 1][j];
                    }
                    if (i + 1< board.length ) {
                        cnt++;
                        sum += board[i + 1][j];
                    }
                    if (j - 1 >= 0) {
                        cnt++;
                        sum += board[i][j - 1];
                    }
                    if (j + 1< board[i].length) {
                        cnt++;
                        sum += board[i][j + 1];
                    }
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        cnt++;
                        sum += board[i - 1][j - 1];
                    }
                    if (i - 1 >= 0 && j + 1 < board[i].length ) {
                        cnt++;
                        sum += board[i - 1][j + 1];
                    }
                    if (i + 1 < board.length && j - 1 >= 0) {
                        cnt++;
                        sum += board[i + 1][j - 1];
                    }
                    if (i + 1 < board.length && j + 1 < board[i].length ) {
                        cnt++;
                        sum += board[i + 1][j + 1];
                    }
                    matrix[i][j] = sum / cnt;
                }
            }
            return matrix;
        }
            
//        public void gameOfLife(int[][] board) {
//            int[][] matrix = new int[board.length][board[0].length];
//            for (int i = 0; i < board.length; i++) {
//                for (int j = 0; j < board[i].length; j++) {
//                    int cnt = 0;
//                    if (i - 1 >= 0 && board[i - 1][j] == 1) {
//                        cnt++;
//                    }
//                    if (i + 1< board.length && board[i + 1][j] == 1) {
//                        cnt++;
//                    }
//                    if (j - 1 >= 0 && board[i][j - 1] == 1) {
//                        cnt++;
//                    }
//                    if (j + 1< board[i].length && board[i][j + 1] == 1) {
//                        cnt++;
//                    }
//                    if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1) {
//                        cnt++;
//                    }
//                    if (i - 1 >= 0 && j + 1 < board[i].length && board[i - 1][j + 1] == 1) {
//                        cnt++;
//                    }
//                    if (i + 1 < board.length && j - 1 >= 0 && board[i + 1][j - 1] == 1) {
//                        cnt++;
//                    }
//                    if (i + 1 < board.length && j + 1 < board[i].length && board[i + 1][j + 1] == 1) {
//                        cnt++;
//                    }
//                    if (board[i][j] == 0 && cnt == 3) {
//                        matrix[i][j] = 1;
//                    } else if (board[i][j] == 1) {
//                        if (cnt < 2 || cnt > 3) {
//                            matrix[i][j] = 0;
//                        } else {
//                            matrix[i][j] = 1;
//                        }
//                    }
//                }
//            }
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    board[i][j] = matrix[i][j];
//                }
//            }
//        }
    }

}
