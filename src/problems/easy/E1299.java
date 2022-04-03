package problems.easy;

public class E1299 {

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int[] rs = new Solution().replaceElements(arr);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public int[] replaceElements(int[] arr) {
            int[] rs = new int[arr.length];
            if (arr.length == 1) {
                rs[0] = -1;
                return rs;
            }
            int cur = -1;
            int idxMax = 0;
            int max = 0;
            int idx = 0;
            while (true) {
                for (int i = cur + 1; i < arr.length; i++) {
                    if (max < arr[i]) {
                        max = arr[i];
                        idxMax = i;
                    }
                }
                for (int i = 0; i < idxMax; i++) {
                    if (rs[i] == 0) {
                        rs[idx++] = arr[idxMax];
                    }
                }
                cur = idxMax;
                max = 0;
                if (cur >= arr.length - 1) {
                    break;
                }
            }
            rs[rs.length - 1] = -1;
            return rs;
        }
    }

}
