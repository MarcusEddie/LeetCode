package problems.easy;

public class E168 {

    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(703));
    }
    
    private static class Solution {
        public String convertToTitle(int columnNumber) {
            String[] bets = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            StringBuilder rs = new StringBuilder();
            while (columnNumber > 0) {
                int remainder = columnNumber % 26;
                if (remainder == 0) {
                    rs.insert(0, bets[25]);
                    remainder = 26;
                } else {
                    rs.insert(0, bets[remainder - 1]);
                }
                if (columnNumber <= 26) {
                    break;
                }
                columnNumber = columnNumber - remainder;
                System.err.println(columnNumber);
                columnNumber = columnNumber / 26;
                System.out.println(columnNumber);
            }
            return rs.toString();
        }
    }

}
