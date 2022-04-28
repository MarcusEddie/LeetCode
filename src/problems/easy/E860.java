package problems.easy;

public class E860 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean lemonadeChange(int[] bills) {
            int[] slot = new int[3];
            boolean rs = true;
            for (int i = 0; i < bills.length; i++) {
                if (bills[i] == 5) {
                    slot[0] ++;
                } else if (bills[i] == 10) {
                    if (slot[0] < 1) {
                        rs = false;
                        break;
                    }
                    slot[1]++;
                    slot[0]--;
                } else {
                    slot[2]++;
                    if (slot[1] >= 1) {
                        if(slot[0] >= 1) {
                            slot[1]--;
                            slot[0]--;
                        } else {
                            rs = false;
                            break;
                        }
                    } else if (slot[1] < 1) {
                        if (slot[0] >= 3) {
                            slot[0] = slot[0] - 3;
                        } else {
                            rs = false;
                            break;
                        }
                    }
                }
            }
            return rs;
        }
    }
}
