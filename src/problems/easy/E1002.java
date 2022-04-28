package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E1002 {

    public static void main(String[] args) {
        String[] words = {"bbddabab","cbcddbdd","bbcadcab","dabcacad","cddcacbc","ccbdbcba","cbddaccc","accdcdbb"};
        System.out.println(new Solution().commonChars(words).toString());
    }

    private static class Solution {
        public List<String> commonChars(String[] words) {
            List<String> rs = new ArrayList<String>();
            int[][] slot = new int[26][words.length + 1];
            for (int i = 0; i < words.length; i++) {
                Set<Integer> set = new HashSet<Integer>();
                for (int j = 0; j < words[i].length(); j++) {
                    int code = words[i].charAt(j) - 97;
                    if (!set.contains(code)) {
                        slot[code][0]++;
                        set.add(code);
                    }
                    slot[code][i + 1]++;
                }
            }
            for (int i = 0; i < slot.length; i++) {
                if (slot[i][0] == words.length) {
                    int min = 200;
                    for (int j = 0; j < slot[i].length; j++) {
                        if (min > slot[i][j]) {
                            min = slot[i][j];
                        }
                    }
                    for (int j = 0; j < min; j++) {
                        rs.add(String.valueOf((char) ((i + 97))));
                    }
                }
            }
            return rs;
        }
    }

}
