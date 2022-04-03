package problems.easy;

public class E2011 {

    public static void main(String[] args) {
        String[] operations = { "--X", "X++", "X++" };
        System.out.println(new Solution().finalValueAfterOperations(operations));
    }

    private static class Solution {
        public int finalValueAfterOperations(String[] operations) {
            int rs = 0;
            for (int i = 0; i < operations.length; i++) {
                switch (operations[i]) {
                case "++X":
                    rs++;
                    break;
                case "--X":
                    rs--;
                    break;
                case "X++":
                    rs++;
                    break;
                case "X--":
                    rs--;
                    break;
                default:
                    break;
                }
            }
            return rs;
        }
    }

}
