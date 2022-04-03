package problems.easy;

public class E69 {

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(2147395599));
        System.out.println(46340 * 46340);
    }
    
    //https://blog.csdn.net/daoxincc/article/details/79000641
    //https://blog.csdn.net/mecephy/article/details/52916954
    private static class Solution {
        public int mySqrt(int c) {
            double err = 1e-15;
            double t = c;
            while(Math.abs(t - c/t) > err * t) {
                t = (c/t + t) / 2.0;
            }
            return (int)t;
        }
    }

}
