package problems.easy;

public class E278 {

    public static void main(String[] args) {
        System.out.println(new Solution().firstBadVersion(2126753390));
    }
    
    private static class Solution {
        int bad = 1702766719;
        public int firstBadVersion(int n) {
            int rs = 0;
            if (isBadVersion(1)) {
                return 1;
            }
            int tmp = 0;
            if (isBadVersion(n / 2)) {
                if (isBadVersion((n / 2) - 1)) {
                    n = (n / 2) - 1;
                }else {
                    rs = n / 2;
                    return rs;
                }
            } else {
                if (isBadVersion((n / 2) + 1)) {
                    rs = (n / 2) + 1;
                    return rs;
                }else {
                    tmp = n / 2;
                    n = (n / 2) + 1;
                }
            }
//            System.out.println("tmp: " + tmp);
            int low = 1;
            int high = n;
            while (low < high) {
                int medium = (high + low) / 2;
                boolean mediumF = isBadVersion(medium + tmp);
//                idx++;
//                if (idx < 15) {
//                    System.out.println(high + " " + low + " " + " " + medium + " " + (medium + tmp) + " " + mediumF);
//                }
                if (mediumF) {
                    boolean flag = isBadVersion(medium + tmp - 1);
                    if (flag) {
                        high = medium - 1;
                    } else {
                        rs = medium;
                        break;
                    }
                } else {
                    boolean flag = isBadVersion(medium + tmp +1);
//                    System.out.println(high + " " + low + " " + " " + (medium + tmp)  + " " + (medium + tmp +1) + " " + mediumF);
                    if (flag) {
                        rs = medium + 1;
                        break;
                    } else {
                        low = medium + 1;
                    }
                }
            }
            return rs + tmp;
        }
        
        public boolean isBadVersion(int i) {
            boolean rs = true;
            if (i < bad) {
                return false;
            }
            return rs;
        }
    }

}
