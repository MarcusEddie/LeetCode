package problems.easy;

public class E1784 {

    public static void main(String[] args) {
        String s = "111010";
        System.out.println(new Solution().checkOnesSegment(s));
    }
    
    private static class Solution {
        public boolean checkOnesSegment(String s) {
            int start = s.indexOf("1");
            int end = s.lastIndexOf("1");
            s = s.substring(start, end + 1);
            return !s.contains("0");
        }
    }

}
