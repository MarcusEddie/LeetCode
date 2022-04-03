package problems.easy;

public class E941 {

    public static void main(String[] args) {
        int[] arr = {0,3,4,5};
        System.out.println(new Solution().validMountainArray(arr));
    }
    
    private static class Solution {
        public boolean validMountainArray(int[] arr) {
            boolean rs = true;
            if (arr.length <= 2) {
                return false;
            }
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            if (arr[0] == max) {
                max = -1;
            }
            for (int i = 1; i < arr.length; i++) {
                if (max > -1 && arr[i] < max) {
                    if (arr[i] - arr[i - 1] <= 0) {
                        rs = false;
                        break;
                    }
                } else if (arr[i] == max) {
                    if (i != arr.length - 1) {
                        max = -1;
                    } else {
                        rs = false;
                        break;
                    }
                } else {
                    if (arr[i] - arr[i - 1] >= 0) {
                        rs = false;
                        break;
                    }
                }
            }
            return rs;
        }
    }

}
