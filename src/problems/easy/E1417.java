package problems.easy;

public class E1417 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public String reformat(String s) {
            StringBuilder builder = new StringBuilder();
            char[] letters = new char[s.length()];
            int idxLetter = 0;
            char[] digits = new char[s.length()];
            int idxDigit = 0;
            for (int i = 0; i < s.length(); i++) {
                if (97 <=s.charAt(i) && s.charAt(i) <= 122) {
                    letters[idxLetter++] = s.charAt(i);
                } else {
                    digits[idxDigit++] = s.charAt(i);
                }
            }
            if (Math.abs(idxDigit - idxLetter) > 1) {
                return "";
            }
            int len = idxDigit > idxLetter ? idxLetter : idxDigit;
            for (int i = 0; i < len; i++) {
                builder.append(letters[i]).append(digits[i]);
            }
            len = idxLetter - idxDigit;
            if (len < 0) {
                builder.insert(0, digits[idxDigit - 1]);
            } else if (len > 0) {
                builder.append(letters[idxLetter - 1]);
            }
            return builder.toString();
        }
    }

}
