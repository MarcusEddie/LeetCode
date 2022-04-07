package problems.easy;

public class E2129 {

    public static void main(String[] args) {
        System.out.println(new Solution().capitalizeTitle("i lOve leetcode"));
    }
    
    private static class Solution {
        public String capitalizeTitle(String title) {
            String rs = "";
            String[] words = title.split(" ");
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() <= 2) {
                    builder.append(words[i]).append(" ");
                } else {
                    builder.append(String.valueOf(words[i].charAt(0)).toUpperCase());
                    builder.append(words[i].substring(1).toLowerCase()).append(" ");
                }
            }
            return builder.substring(0, builder.length() - 1);
        }
    }

}
