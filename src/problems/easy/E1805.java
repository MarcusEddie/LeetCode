package problems.easy;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class E1805 {

    public static void main(String[] args) {
        System.out.println(new Solution().numDifferentIntegers("sh8s0"));
    }
    
    private static class Solution {
        public int numDifferentIntegers(String word) {
            Set<String> rs = new HashSet<String>();
            Queue<String> queue = new LinkedBlockingDeque<String>(); 
            for(int i = 0; i < word.length(); i++) {
                if (48 <= word.charAt(i) && word.charAt(i) <= 57) {
                    queue.offer(String.valueOf(word.charAt(i)));
                    if (i == word.length() - 1) {
                        int sign = 1;
                        StringBuilder builder = new StringBuilder();
                        Integer sum = -1;
                        boolean flag = false;
                        while (!queue.isEmpty()) {
                            flag = true;
                            String tmp = queue.poll();
                            sum = sum + Integer.valueOf(tmp);
                            if (!tmp.equals("0") && sign == 1) {
                                sign = -sign;
                            }
                            if (sign == -1) {
                                builder.append(tmp);
                            }
                        }
                        if (builder.length() > 0) {
                            rs.add(builder.toString());
                        } else if (sum == -1 && flag) {
                            rs.add("0");
                        }
                    }
                } else {
                    int sign = 1;
                    StringBuilder builder = new StringBuilder();
                    Integer sum = -1;
                    boolean flag = false;
                    while (!queue.isEmpty()) {
                        flag = true;
                        String tmp = queue.poll();
                        sum = sum + Integer.valueOf(tmp);
                        if (!tmp.equals("0") && sign == 1) {
                            sign = -sign;
                        }
                        if (sign == -1) {
                            builder.append(tmp);
                        }
                    }
                    if (builder.length() > 0) {
                        rs.add(builder.toString());
                    } else if (sum == -1 && flag) {
                        rs.add("0");
                    }
                }
            }
            return rs.size();
        }
    }

}
