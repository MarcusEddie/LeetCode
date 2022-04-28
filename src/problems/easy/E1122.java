package problems.easy;

public class E1122 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int[] rs = new int[arr1.length];
            int[] slot = new int[1001];
            for (int i = 0; i < arr1.length; i++) {
                slot[arr1[i]]++;
            }
            int idx = 0;
            for (int i = 0; i < arr2.length; i++) {
                int time = slot[arr2[i]];
                slot[arr2[i]] = 0;
                for (int j = 0; j < time; j++) {
                    rs[idx++] = arr2[i];
                }
            }
            for (int i = 0; i < slot.length; i++) {
                int time = slot[i];
                if (time == 0) {
                    continue;
                }
                for (int j = 0; j < time; j++) {
                    rs[idx++] = arr2[i];
                }
            }
            return rs;
        }
    }

}
