package contest.biweekly.c76;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C {

    public static void main(String[] args) {
        ATM solution = new ATM();
//        int[] banknotesCount = { 500000, 500000, 500000, 500000, 500000 };
//      solution.deposit(banknotesCount);
//      solution.deposit(banknotesCount);
//      solution.deposit(banknotesCount);
//      solution.deposit(banknotesCount);
//      System.out.println(Arrays.toString(solution.withdraw(1000000000)));

        int[] banknotesCount11 = { 0, 0, 1, 2, 1 };
        solution.deposit(banknotesCount11);
        System.out.println(Arrays.toString(solution.withdraw(600)));
        int[] banknotesCount1 = { 0, 1, 0, 1, 1 };
        solution.deposit(banknotesCount1);
        System.out.println(Arrays.toString(solution.withdraw(600)));
        System.out.println(Arrays.toString(solution.withdraw(550)));
    }

    private static class ATM {
        private long[] slot = new long[5];
        private Map<Integer, Long> map = new HashMap<Integer, Long>();

        public ATM() {
            map.put(0, 20L);
            map.put(1, 50L);
            map.put(2, 100L);
            map.put(3, 200L);
            map.put(4, 500L);
        }

        public void deposit(int[] banknotesCount) {
            for (int i = 0; i < banknotesCount.length; i++) {
                slot[i] = slot[i] + banknotesCount[i];
            }
        }

        public int[] withdraw(int amount) {
            long tmp = amount;
            int[] rs = new int[5];
            for (int i = slot.length - 1; i >= 0; i--) {
                if (slot[i] != 0) {
                    if (map.get(i).compareTo(tmp) <= 0) {
                        long times = slot[i];
                        long cur = map.get(i) * times;
                        if (cur <= tmp) {
                            tmp = tmp - cur;
                            slot[i] = 0;
                            rs[i] = (int) times;
                        } else {
                            times = times - (tmp / map.get(i));
                            slot[i] = times;
                            rs[i] = (int) (tmp / map.get(i));
                            tmp = tmp % (map.get(i));
                        }
                    }
                }
            }
            if (tmp != 0) {
                for (int i = 0; i < rs.length; i++) {
                    slot[i] = slot[i] + rs[i];
                }
                int[] failed = { -1 };
                return failed;
            }
            return rs;
        }
    }

}
