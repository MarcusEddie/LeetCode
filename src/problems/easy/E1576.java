package problems.easy;

public class E1576 {

    public static void main(String[] args) {
        System.out.println(new Solution().modifyString("j?qg??b"));
    }

    private static class Solution {
        public String modifyString(String s) {
            StringBuilder builder = new StringBuilder();
            int idx = 0;
            int start = 0;
            int end = 0;
            while (idx < s.length()) {
                if (s.charAt(idx) != '?') {
                    builder.append(String.valueOf(s.charAt(idx)));
//                    System.out.println(builder.toString());
                } else {
                    if (idx == 0) {
                        if (s.charAt(idx + 1) !='a') {
                            builder.append("a");
                        } else {
                            builder.append("b");
                        }
                    } else if (idx == s.length() - 1) {
                        start = s.charAt(idx - 1);
                        if (start != 97) {
                            builder.append(String.valueOf((char) 97));
                        } else {
                            builder.append(String.valueOf((char) (98)));
                        }
                    } else {
                        if (s.charAt(idx + 1) != '?') {
                            start = builder.charAt(idx - 1);
                            end = s.charAt(idx + 1);
                            for (int i = 97; i < 123; i++) {
                                if (i != start && i != end) {
                                    builder.append(String.valueOf((char) i));
                                    break;
                                }
                            }
                        } else {
                            if (builder.charAt(idx - 1) !='a') {
                                builder.append("a");
                                System.out.println(builder.toString());
                            } else {
                                builder.append("b");
                                System.out.println(builder.toString());
                            }
                        }
                    }
                }
                idx++;
            }
            return builder.toString();
        }
    }

}
