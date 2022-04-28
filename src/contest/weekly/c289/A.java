package contest.weekly.c289;

public class A {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.digitSum("01234567890", 10));
        System.out.println(solution.digitSum("742190887044879874008", 20));
    }

    private static class Solution {
        public String digitSum(String s, int k) {
            int idx = 0;
            while (s.length() > k) {
                StringBuilder builder2 = new StringBuilder();
                while (idx < s.length()) {
                    int tmp = 0;
                    if (idx + k < s.length()) {
                        for (int i = idx; i < idx + k; i++) {
                            tmp += s.charAt(i) - 48;
                        }
                    } else {
                        for (int i = idx; i < s.length(); i++) {
                            tmp += s.charAt(i) - 48;
                        }
                    }
                    builder2.append(tmp);
                    idx += k;
                }
                s = builder2.toString();
                idx = 0;
            }
            return s;
        }
    }

}
