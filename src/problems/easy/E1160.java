package problems.easy;

public class E1160 {

    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(new Solution().countCharacters(words, chars));
    }
    
    private static class Solution {
        public int countCharacters(String[] words, String chars) {
            int rs = 0;
            int[] slot = new int[26];
            for(int i = 0; i < chars.length(); i++) {
                slot[chars.charAt(i) - 97]++;
            }
            for (int i = 0; i < words.length; i++) {
                boolean flag = true;
                int[] slot1 = new int[26];
                for(int i0 = 0; i0 < slot.length; i0++) {
                    slot1[i0] = slot[i0];
                }
                for (int j = 0; j < words[i].length(); j++) {
                    int code = words[i].charAt(j) - 97;
                    if (slot1[code] == 0) {
                        flag = false;
                        break;
                    } else {
                        slot1[code]--;
                    }
                }
                if (flag) {
                    rs += words[i].length();
                }
            }
            return rs;
        }
    }

}
