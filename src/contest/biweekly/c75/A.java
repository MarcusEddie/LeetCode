package contest.biweekly.c75;


public class A {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minBitFlips(10, 7));
        System.out.println(solution.minBitFlips(3, 4));
    }
    
    private static class Solution{
        public int minBitFlips(int start, int goal) {
            int rs = 0;
            String startBit = Integer.toBinaryString(start);
            String goalBit = Integer.toBinaryString(goal);
//            System.err.println(startBit);
//            System.err.println(goalBit);
            if (startBit.length() > goalBit.length()) {
                int len = startBit.length() - goalBit.length();
                while (len > 0) {
                    goalBit = "0" + goalBit;
                    len--;
                }
            } else if (startBit.length() < goalBit.length()) {
                int len = goalBit.length() - startBit.length();
                while (len > 0) {
                    startBit = "0" + startBit;
                    len--;
                }
            }
//            System.err.println(startBit);
//            System.err.println(goalBit);
            for(int i = 0; i< startBit.length(); i++) {
                if (startBit.charAt(i) != goalBit.charAt(i)) {
                    rs++;
                }
            }
            return rs;
        }
        
    }

}
