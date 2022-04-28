package problems.easy;

public class E999 {

    public static void main(String[] args) {
        System.out.println("5F3Z-2e-9-w".replaceAll("-", ""));
    }
    
    private static class Solution {
        public int numRookCaptures(char[][] board) {
            int rs = 0;
            Boolean flag = false;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 'R') {
                        for (int j2 = j; j2 < board[i].length; j2++) {
                            if (board[i][j2] == 'p') {
                                rs++;
                                break;
                            } else if (board[i][j2] == 'B') {
                                break;
                            }
                        }
                        for (int j2 = j; j2 >= 0; j2--) {
                            if (board[i][j2] == 'p') {
                                rs++;
                                break;
                            } else if (board[i][j2] == 'B') {
                                break;
                            }
                        }
                        for (int j2 = i; j2 < board.length; j2++) {
                            if (board[j2][j] == 'p') {
                                rs++;
                                break;
                            } else if (board[j2][j] == 'B') {
                                break;
                            }
                        }
                        for (int j2 = i; j2 >= 0; j2--) {
                            if (board[j2][j] == 'p') {
                                rs++;
                                break;
                            } else if (board[j2][j] == 'B') {
                                break;
                            }
                        }
                        flag  = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            return rs;
        }
    }

}
