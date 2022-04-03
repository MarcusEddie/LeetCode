package problems.medium;

public class M954 {

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,-1,-2};
        System.out.println(Math.pow(10,5) + 1);
        System.out.println(new Solution().canReorderDoubled(arr));
    }
    
    private static class Solution {
        public boolean canReorderDoubled(int[] arr) {
            boolean rs = true;
            int[] positive = new int[100001];
            int[] negative = new int[100001];
            boolean flagP = false;
            boolean flagN = false;
            int minP = Integer.MAX_VALUE;
            int maxP = 0;
            int minN = Integer.MAX_VALUE;
            int maxN = 0;
            int cntP = 0;
            int cntN = 0;
            int oddP = 0;
            int oddN = 0;
            int evenP = 0;
            int evenN = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    cntN++;
                    flagN = true;
                    if ((-arr[i] & 1) == 1) {
                        oddP++;
                    } else {
                        evenP++;
                    }
                    negative[-arr[i]] = negative[-arr[i]] + 1;
                    if (minN > -arr[i]) {
                        minN = -arr[i];
                    }
                    if (maxN < -arr[i]) {
                        maxN = -arr[i];
                    }
                } else {
                    cntP++;
                    flagP = true;
                    if ((arr[i] & 1) == 1) {
                        oddP++;
                    } else {
                        evenP++;
                    }
                    positive[arr[i]] = positive[arr[i]] + 1;
                    if (minP > arr[i]) {
                        minP = arr[i];
                    }
                    if (maxP < arr[i]) {
                        maxP = arr[i];
                    }
                }
            }
            if ((cntN & 1) == 1 || (cntP & 1) == 1) {
                return false;
            }
            if (oddN > evenN || oddP > evenP) {
                return false;
            }
            if ((positive[0] & 1) == 1) {
                return false;
            }
            if (maxP == minP) {
                if (maxP  == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            if (maxN == minN) {
                    return false;
            }
            if (flagP) {
                rs = check(positive, minP, maxP);
            }
            if (flagN) {
                rs = rs && check(negative, minN, maxN);
            }
            return rs;
        }
        
        private boolean check(int[] positive, int min, int max) {
            boolean rs = true;
            boolean end = false;
            while (rs && !end) {
                for (int i = min; i <= max; i++) {
                    if (i == max) {
                        end = true;
                        if(positive[i] != 0){
                            rs = false;
                            
                        }
                        break;
                    }
                    if (positive[i] >= 1) {
                        if (((i << 1) < 100000) && positive[i << 1] >= positive[i]) {
                            positive[i << 1] = positive[i << 1] - positive[i];
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
