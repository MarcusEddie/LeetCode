package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class E2062 {

    public static void main(String[] args) {
        System.out.println(new Solution().countVowelSubstrings("poazaeuioauoiioaouuouaui"));
    }

    private static class Solution {
        public int countVowelSubstrings(String word) {
            int rs = 0;
            int idx = 0;
            StringBuilder builder = new StringBuilder();
            Set<String> set = new HashSet<String>();
            while (idx < word.length()) {
//                System.out.println(idx);
                if (word.charAt(idx) == 'a' || word.charAt(idx) == 'e' || word.charAt(idx) == 'i'
                        || word.charAt(idx) == 'o' || word.charAt(idx) == 'u') {
                    builder.append(String.valueOf(word.charAt(idx)));
                    set.add(String.valueOf(word.charAt(idx)));
//                    System.out.println(builder.toString() + " " + set.size());
                    if (builder.length() >= 5 && set.size() == 5) {
                        rs++;
                    }
                    idx++;
                    if (idx == word.length()) {
                        idx = idx - builder.length() + 1;
                        set.clear();
                        builder = new StringBuilder();
                    }
                } else {
//                    System.out.println(builder.toString());
                    idx = idx - builder.length() + 1;
                    set.clear();
                    builder = new StringBuilder();
                }
            }
            return rs;
        }
    }

}
