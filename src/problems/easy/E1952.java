package problems.easy;

public class E1952 {

    public static void main(String[] args) {
        System.out.println(new Solution().isThree(33));
    }
    
    private static class Solution {
        public boolean isThree(int n) {
            boolean rs = true;
            if((n & 1) == 1){
                int root = (int) Math.sqrt(n);
                int cnt = 0;
                for (int i = 2; i <= root; i++) {
                    if (n % i == 0 && i != root) {
                        cnt += 2;
                        if (cnt > 1) {
                            rs = false;
                            break;
                        }
                    } else if (n % i == 0 && i == root) {
                        cnt++;
                        if (cnt > 1) {
                            rs = false;
                            break;
                        }
                    }
                }
                if(cnt != 1){
                    rs = false;
                }
                System.err.println(cnt);
            } else {
                if (n != 4) {
                    rs = false;
                }
            }
            return rs;
        }
    }

}
