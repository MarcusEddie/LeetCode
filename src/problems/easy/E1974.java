package problems.easy;

public class E1974 {

    public static void main(String[] args) {
        System.out.println(new Solution().minTimeToType("pdy"));
    }

    private static class Solution {
        public int minTimeToType(String word) {
            int rs = word.length();
            int ptr = 0;
            for (int i = 0; i < word.length(); i++) {
                int code = word.charAt(i) - 97;
                if (code <= (ptr + 13) % 26) {
                    // ->
                    if (code < ptr) {
                        rs += code + 26 - ptr;
                    } else {
                        rs += code - ptr;
                    }
                    ptr = code;
//                    System.out.println(rs);
                } else {
                    if (ptr >= code) {
                        rs += ptr - code;
                    } else {
                        rs += 26 - (code - ptr);
                    }
                    ptr = code;
//                    System.out.println("-" + rs);
                }
            }
            return rs;
        }
    }

}
