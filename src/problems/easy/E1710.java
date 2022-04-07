package problems.easy;

public class E1710 {

    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        System.out.println(new Solution().maximumUnits(boxTypes, 10));
    }
    
    private static class Solution {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            int rs = 0;
            int[] slot = new int[1001];
            for (int i = 0; i < boxTypes.length; i++) {
                slot[boxTypes[i][1]] = boxTypes[i][0];
            }
            for (int i = slot.length - 1; i >= 0; i--) {
                if (slot[i] > 0) {
                    
                    if (truckSize >= slot[i]) {
                        rs = rs + i * slot[i];
                        truckSize = truckSize - slot[i];
                        if (truckSize == 0) {
                            break;
                        }
                    } else {
                        rs = rs + truckSize * i;
                        break;
                    }
                }
            }
            return rs;
        }
    }

}
