package problems.easy;

public class E1592 {

    public static void main(String[] args) {
        System.out.println(new Solution().reorderSpaces("this"));
    }
    
    private static class Solution {
    public String reorderSpaces(String text) {
            String builder = "";
            int cnt = 0;
            for(int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    cnt++;
                }
            }
            String[] words = text.split(" ");
            int cnt1 = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 0) {
                    cnt1++;
                }
            }
            String space = "";
            if (cnt1 == 1) {
                for (int i = 0; i < cnt; i++) {
                    space += " ";
                }
                for (int i = 0; i < words.length; i++) {
                    if (words[i].length() > 0) {
                        builder += words[i];
                    }
                }
                builder = builder + space;
                return builder;
            }
            int len = cnt / (cnt1 - 1);
        //System.out.println(cnt);
        //System.out.println(cnt1 - 1);
            cnt = cnt %  (cnt1 - 1);
        //System.out.println(cnt);
            space = "";
            for (int i = 0; i < len; i++) {
                space += " ";
            }
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 0) {
                    builder += words[i] + space;
                }
            }
            builder = builder.trim();
            if (cnt != 0) {
                space = "";
                for (int i = 0; i < cnt; i++) {
                    space += " ";
                }
                builder += space;
            }
            
            return builder;
        }
}

}
