package problems.easy;

public class E434 {

    public static void main(String[] args) {
        System.out.println(new Solution().countSegments("Hello, my name is John"));
    }
    
    private static class Solution {
        public int countSegments(String s) {
            int rs = 0;
            if (s.trim().length() == 0) {
                return 0;
            }
            String[] tmp = s.split(" ");
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i].trim().length()  > 0) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
