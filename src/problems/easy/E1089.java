package problems.easy;

public class E1089 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public void duplicateZeros(int[] arr) {
            int left = 0;
            int right = 1;
            while (left < arr.length) {
                if (arr[left] == 0) {
                    for(int i = arr.length - 1; i > left; i--) {
                        arr[i] = arr[i - 1];
                    }
                    left = left + 2;
                } else {
                    left++;
                }
            }
        }
    }

}
