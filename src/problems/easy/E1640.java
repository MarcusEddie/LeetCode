package problems.easy;

import java.util.Arrays;

public class E1640 {

    public static void main(String[] args) {
        int[] arr = { 32, 66, 73, 15, 3, 70, 53 };
        int[][] pieces = { { 66, 73 }, { 15 }, { 3 }, { 32 }, { 70 }, { 53 } };
        System.out.println(new Solution().canFormArray(arr, pieces));
    }

    private static class Solution {
        public boolean canFormArray(int[] arr, int[][] pieces) {
            boolean rs = true;
            String rss = Arrays.toString(arr);
            rss = rss.substring(1, rss.length() - 1);

            if (arr.length == 1 && pieces.length == 1 && pieces[0].length == 1) {
                if (arr[0] == pieces[0][0]) {
                    return true;
                } else {
                    return false;
                }
            }
            for (int i = 0; i < pieces.length; i++) {
                String tmp = Arrays.toString(pieces[i]);
                tmp = tmp.substring(1, tmp.length() - 1);
                if (rss.indexOf(tmp) < 0) {
                    rs = false;
                    break;
                } else {
                    if (!(rss.contains(" " + tmp + ",") || rss.contains(" " + tmp)
                            || rss.contains(tmp + ",")
                            || (tmp.equals(rss) && pieces.length == 1))) {
                        rs = false;
                        break;
                    }
                }
            }
            return rs;
        }
    }

}
