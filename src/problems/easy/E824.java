package problems.easy;

public class E824 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public String toGoatLatin(String sentence) {
            StringBuilder builder = new StringBuilder();
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                String ma = "ma";
                for (int j = 0; j < i + 1; j++) {
                    ma += "a";
                }
                if (words[i].toLowerCase().charAt(0) == 'a'
                        || words[i].toLowerCase().charAt(0) == 'e'
                        || words[i].toLowerCase().charAt(0) == 'i'
                        || words[i].toLowerCase().charAt(0) == 'o'
                        || words[i].toLowerCase().charAt(0) == 'u') {
                    builder.append(words[i]).append(ma).append(" ");
                } else {
                    builder.append(words[i].substring(1)).append(words[i].substring(0, 1)).append(ma).append(" ");
                }
            }
            return builder.substring(0, builder.length() - 1).toString();
        }
    }

}
