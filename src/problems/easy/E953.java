package problems.easy;

public class E953 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            boolean rs = true;
            int[] slot = new int[26];
            for (int i = 0; i < order.length(); i++) {
                int code = order.charAt(i) - 97;
                slot[code] = i;
            }
            for(int i = 0; i < words.length - 1; i++) {
                if (words[i].length() > words[i + 1].length()) {
                    rs = false;
                    break;
                }
                int len = words[i].length() < words[i + 1].length() ? words[i].length() : words[i + 1].length();
                for (int j = 0; j < len; j++) {
                    int aCode = words[i].charAt(j) - 97;
                    int bCode = words[i + 1].charAt(j) - 97;
                    if (slot[aCode] > slot[bCode]) {
                        rs = false;
                        break;
                    }
                }
            }
            return rs;
        }
    }

}
