package problems.easy;

public class E1588 {

    public static void main(String[] args) {
        int[] arr = {10,11,12};
        System.out.println(new Solution().sumOddLengthSubarrays(arr));
    }
    
    private static class Solution {
        public int sumOddLengthSubarrays(int[] arr) {
            int rs = 0;
            for (int i = 0; i < arr.length; i++) {
                rs = rs + arr[i];
            }
            int len = 3;
            while (len <= arr.length) {
                for (int i = 0; i <= arr.length - len; i++) {
                    for (int j = i; j < len + i; j++) {
                        rs = rs + arr[j];
                    }
                }
                len = len + 2;
            }
            return rs;
        }
    }

}
