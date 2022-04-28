package problems.easy;

public class E1394 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static class Solution {
        public int findLucky(int[] arr) {
            int rs = -1;
            int[] slot = new int[501];
            for (int i = 0; i < arr.length; i++) {
                slot[arr[i]]++;
            }
            for (int i = slot.length - 1; i >=0; i--) {
                if (slot[i] > 0 && slot[i] ==  i) {
                    rs = i;
                    break;
                }
            }
            return rs;
        }
    }

}
