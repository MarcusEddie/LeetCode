package problems.easy;

import java.util.Arrays;

public class E1652 {

    public static void main(String[] args) {
        int[] code = { 2, 4, 9, 3 };
        System.out.println(Arrays.toString(new Solution().decrypt(code, -2)));
    }

    private static class Solution {
        public int[] decrypt(int[] code, int k) {
            int[] rs = new int[code.length];
            if (k == 0) {
                return code;
            } else if (k > 0) {
                for (int i = 0; i < rs.length; i++) {
                    int sum = 0;
                    for (int j = i + 1; j <= i + k; j++) {
                        sum += code[j % code.length];
                    }
                    rs[i] = sum;
                }
            } else {
                int total = 0;
                for (int i = 0; i < code.length; i++) {
                    total += code[i];
                }
                for (int i = 0; i < rs.length; i++) {
                    int sum = total;
                    for (int j = i; j <= i + code.length - 1 + k; j++) {
                        sum -= code[j % code.length];
                    }
                    rs[i] = sum;
                }
            }
            return rs;
        }
    }

}
