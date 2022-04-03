package problems.easy;

public class E762 {

    public static void main(String[] args) {

    }
    private static class Solution {
        public int countPrimeSetBits(int left, int right) {
            int rs = 0;
            for(int i = left; i <= right; i++) {
                int cnt = 0;
                int tmp = i;
                while (tmp != 0) {
                    if ((tmp & 1) == 1) {
                        cnt++;
                    }
                    tmp = tmp >> 1;
                }
                boolean flag = true;
                if ((cnt & 1) == 1) {
                    for(int j = 2; j <= cnt >> 1; j++) {
                        if(cnt % j == 0) {
                            flag = false;
                        }
                    }
                    if (flag) {
                        rs++;
                    }
                }
            }
            return rs;
        }
    }

}
