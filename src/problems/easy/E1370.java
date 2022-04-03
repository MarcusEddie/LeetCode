package problems.easy;

public class E1370 {

    public static void main(String[] args) {
        System.out.println(new Solution().sortString("rat"));
    }
    
    private static class Solution {
        public String sortString(String s) {
            StringBuilder builder = new StringBuilder();
            int[] slot = new int[26];
            int max = 0;
            for(int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 97;
                slot[idx] = slot[idx] + 1;
                if (max < slot[idx]) {
                    max = slot[idx];
                }
            }
            int sign = 1;
            while (max > 0) {
                max--;
                if (sign > 0) {
                    for (int i = 0; i < slot.length; i++) {
                        if (slot[i] != 0) {
                            builder.append(String.valueOf((char)(i + 97)));
                            slot[i] = slot[i] - 1;
                        }
                    }
                    sign = -sign;
                } else {
                    for(int i = slot.length - 1; i >= 0; i--) {
                        if (slot[i] != 0) {
                            builder.append(String.valueOf((char)(i + 97)));
                            slot[i] = slot[i] - 1;
                        }
                    }
                    sign = -sign;
                }
            }
            
            return builder.toString();
        }
    }

}
