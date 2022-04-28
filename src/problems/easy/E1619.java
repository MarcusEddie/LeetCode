package problems.easy;

import java.util.Arrays;

public class E1619 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public double trimMean(int[] arr) {
            double rs = 0.0d;
            Arrays.sort(arr);
            int min = arr.length / 20;
            for (int i = min; i < arr.length - min; i++) {
                rs += arr[i];
            }
            rs = rs / (arr.length - min - min);
            return rs;
        }
    }

}
