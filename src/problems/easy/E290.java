package problems.easy;

public class E290 {

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(new Solution().wordPattern(pattern, s));
    }
    
    private static class Solution {
        public boolean wordPattern(String pattern, String s) {
            boolean flag = true;
            String[] match = new String[26];
            String[] words = s.split(" ");
            if (pattern.length() != words.length) {
                return false;
            }
            for(int i = 0; i < pattern.length(); i++) {
                int idx = pattern.charAt(i) - 97;
                if (match[idx] == null) {
                    match[idx] = words[i];
                    for (int j = 0; j < match.length; j++) {
                        if (j != idx && null != match[j] && match[j].equals(words[i])) {
                            flag = false;
                            break;
                        }
                    }
                } else {
                    if (!words[i].equals(match[idx])) {
                        flag = false;
                        break;
                    }
                }
            }
            return flag;
        }
    }

}
