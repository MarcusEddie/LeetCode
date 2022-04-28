package problems.easy;

public class E1360 {

    public static void main(String[] args) {
        System.out.println("2019-06-30".compareTo("2019-06-29"));
        System.out.println(new Solution().daysBetweenDates("2019-06-30", "2019-06-29"));
    }

    private static class Solution {
        public int daysBetweenDates(String date1, String date2) {
            int rs = 0;
            String[] dates1 = date1.split("-");
            String[] dates2 = date2.split("-");
            if (date1.compareTo(date2) < 0) {
                rs = cal(dates1, dates2);
            } else {
                rs = cal(dates2, dates1);
            }
            return rs;
        }

        private int cal(String[] start, String[] end) {
            int rs = 0;
            int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            for (int i = 1; i < Integer.valueOf(start[1]); i++) {
                rs += months[i];
            }
            rs += Integer.valueOf(Integer.valueOf(start[2]));
            if (isLeap(Integer.valueOf(start[0])) && Integer.valueOf(start[1]) > 2) {
                rs++;
            }
            int tmp = 0;
            for (int i = Integer.valueOf(start[0]); i < Integer.valueOf(end[0]); i++) {
                if (isLeap(i)) {
                    tmp += 366;
                } else {
                    tmp += 365;
                }
            }
            for (int i = 1; i < Integer.valueOf(end[1]); i++) {
                tmp += months[i];
            }
            tmp += Integer.valueOf(Integer.valueOf(end[2]));
            if (isLeap(Integer.valueOf(end[0])) && Integer.valueOf(end[1]) > 2) {
                tmp++;
            }
            rs = tmp - rs;
            return rs;
        }

        private boolean isLeap(int year) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

}
