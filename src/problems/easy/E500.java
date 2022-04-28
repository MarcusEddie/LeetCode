package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E500 {

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(new Solution().findWords(words)));
    }

    private static class Solution {
        public String[] findWords(String[] words) {
            String first = "qwertyuiop"; // 1
            String second = "asdfghjkl"; // 2
            String third = "zxcvbnm";    // 3
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                int row = 0;
                boolean flag = true;
                for (int j = 0; j < word.length(); j++) {
                    int idx = first.indexOf(String.valueOf(word.charAt(j)));
                    if (idx >= 0) {
                        if (row == 0) {
                            row = 1;
                        } else {
                            if (1 != row) {
                                flag = false;
                                break;
                            }
                        }
                    }
                    idx = second.indexOf(String.valueOf(word.charAt(j)));
                    if (idx >= 0) {
                        if (row == 0) {
                            row = 2;
                        } else {
                            if (2 != row) {
                                flag = false;
                                break;
                            }
                        }
                    }
                    idx = third.indexOf(String.valueOf(word.charAt(j)));
                    if (idx >= 0) {
                        if (row == 0) {
                            row = 3;
                        } else {
                            if (3 != row) {
                                flag = false;
                                break;
                            }
                        }
                    }
                }
                if (flag) {
                    list.add(word);
                }
            }
            String[] rs = new String[list.size()];
            for (int i = 0; i < rs.length; i++) {
                rs[i] = list.get(i);
            }
            return rs;
        }
    }
}
