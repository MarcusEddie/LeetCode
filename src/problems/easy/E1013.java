package problems.easy;

public class E1013 {

    public static void main(String[] args) {
        int[] arr = {0,2,1,-6,6,-7,9,1,2,0,1}; // true
//        int[] arr = {0,2,1,-6,6,7,9,-1,2,0,1}; // false
//        int[] arr = {3,3,6,5,-2,2,5,1,-9,4}; // true
        System.out.println(new Solution().canThreePartsEqualSum(arr));
    }
    
    private static class Solution {
        public boolean canThreePartsEqualSum(int[] arr) {
            boolean rs = true;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            sum = sum / 3;
            int segment = 0;
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                segment += arr[i];
                if (segment == sum) {
                    cnt++;
                    segment = 0;
                    if (cnt == 2) {
                        cnt = 3;
                        break;
                    }
                } else if (segment > sum) {
                    cnt = cnt - 5;
                    break;
                }
            }
            if (cnt != 3) {
                rs = false;
            }
            return rs;
        }
    }

}
