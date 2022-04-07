package problems.easy;

public class E944 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    private static class Solution {
        public int minDeletionSize(String[] strs) {
            int rs = 0;
            for (int j = 0; j < strs[0].length(); j++) {
                boolean flag = true;
                for (int i = 1; i < strs.length; i++) {
                    if (strs[i].charAt(j) < strs[i - 1].charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    rs++;
                }
            }
            return rs;
        }
    }
}
