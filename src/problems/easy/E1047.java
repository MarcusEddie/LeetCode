package problems.easy;

public class E1047 {

    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates("abbaca"));
    }
    
    private static class Solution {
        public String removeDuplicates(String s) {
            StringBuilder builder = new StringBuilder(s);
            int idx = 0;
            while (idx < builder.length() - 1) {
                if (builder.charAt(idx) == builder.charAt(idx + 1)) {
                    builder.replace(idx, idx + 2, "");
                    if(idx > 0){
                        idx--;
                    } else {
                        idx = 0;
                    }
                    
                } else {
                    idx++;
                }
            }
            return builder.toString();
        }
    }

}
