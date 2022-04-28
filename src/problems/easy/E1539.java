package problems.easy;

public class E1539 {

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 1;
        System.out.println(new Solution().findKthPositive(arr, k));
    }
    
    private static class Solution {
        public int findKthPositive(int[] arr, int k) {
            int rs = 0;
            
            int left = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] - left <= 1) {
                    left = arr[i];
                    continue;
                }
                if (arr[i] - left - 1>=k) {
                    rs = left + k;
                    k = 0;
                    break;
                } else {
                    int len = arr[i] - left - 1;
                    k = k - len;
                    left = arr[i];
                }
            }
            if (k != 0) {
                rs = arr[arr.length - 1] + k;
            }
            return rs;
        }
    }

}
