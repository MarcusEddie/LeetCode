package contest.weekly.c287;

public class A {

    public static void main(String[] args) {
        System.out.println(new Solution().convertTime("00:00", "23:59"));
    }
    
    private static class Solution {
        public int convertTime(String current, String correct) {
            int rs = 0;
            int cur = 0;
            String[] curs = current.split(":");
            cur = Integer.valueOf(curs[0]) * 100 + Integer.valueOf(curs[1]);
            
            int cor = 0;
            String[] cors = correct.split(":");
            cor = Integer.valueOf(cors[0]) * 100 + Integer.valueOf(cors[1]);
            cor = cor - cur;
            System.out.println(cor);
            if((Integer.valueOf(curs[0]) <= Integer.valueOf(cors[0])) && (Integer.valueOf(curs[1]) <= Integer.valueOf(cors[1])) ) {
                rs = rs + Integer.valueOf(cors[0]) - Integer.valueOf(curs[0]);
                cor = Integer.valueOf(cors[1]) - Integer.valueOf(curs[1]);
                while (cor != 0) {
                    if (cor / 15 > 0) {
                        System.out.println(rs);
                        cor = cor - 15;
                        rs++;
                    } else if (cor / 5 > 0) {
                        cor = cor - 5;
                        rs++;
                    } else {
                        rs = rs + cor;
                        cor = 0;
                    }
                }
            } else if((Integer.valueOf(curs[0]) <= Integer.valueOf(cors[0])) && (Integer.valueOf(curs[1]) > Integer.valueOf(cors[1])) ) {
                rs = rs + Integer.valueOf(cors[0]) - Integer.valueOf(curs[0]) - 1;
                cor = Integer.valueOf(cors[1]) - Integer.valueOf(curs[1]) + 60;
                while (cor != 0) {
                    if (cor / 15 > 0) {
                        System.out.println(rs);
                        cor = cor - 15;
                        rs++;
                    } else if (cor / 5 > 0) {
                        cor = cor - 5;
                        rs++;
                    } else {
                        rs = rs + cor;
                        cor = 0;
                    }
                }
            }  else if((Integer.valueOf(curs[0]) > Integer.valueOf(cors[0])) && (Integer.valueOf(curs[1]) <= Integer.valueOf(cors[1])) ) {
                ;
            } else {
                ;
            }
            return rs;
        }
    }

}
