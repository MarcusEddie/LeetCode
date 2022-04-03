package problems.easy;

public class E925 {

    public static void main(String[] args) {
        String name = "leelee";
        String typed = "lleeelee";
        System.out.println(new Solution().isLongPressedName(name, typed));
    }
    
    private static class Solution {
        public boolean isLongPressedName(String name, String typed) {
            if (name.length() == typed.length()) {
                if (name.equals(typed)) {
                    return true;
                } else {
                    return false;
                }
            }
            boolean rs = true;
            int idxName = 0;
            int idxType = 0;
            while (rs) {
                
            }
            
            return rs;
        }
    }

}
