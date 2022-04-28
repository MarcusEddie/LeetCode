package problems.easy;

public class E917 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static class Solution {
        public String reverseOnlyLetters(String s) {
            StringBuilder builder = new StringBuilder();
            String[] slot = new String[100];
            for(int i = 0; i < s.length(); i++) {
                if ((65 <= s.charAt(i) && s.charAt(i) <=90) || (97 <= s.charAt(i) && s.charAt(i) <= 122)) {
                    builder.append(String.valueOf(s.charAt(i)));
                } else {
                    slot[i] = String.valueOf(s.charAt(i));
                }
            }
            builder = builder.reverse();
            for (int i = 0; i < slot.length; i++) {
                if (null != slot[i] && slot[i].length() == 1) {
                    builder.insert(i, slot[i]);
                }
            }
            return builder.toString();
        }
    }

}
