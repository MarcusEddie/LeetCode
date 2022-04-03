package problems.easy;

public class E1346 {

    public static void main(String[] args) {
        int[] arr = {-778,-481,842,495,44,1000,-572,977,240,-116,673,997,-958,-539,-964,-187,-701,-928,472,965,-672,-88,443,36,388,-127,115,704,-549,1000,998,291,633,423,57,-77,-543,72,328,-938,-192,382,179};
        System.out.println(new Solution().checkIfExist(arr));
    }
    
    private static class Solution {
        public boolean checkIfExist(int[] arr) {
            boolean rs = false;
            int[] nega = new int[1000];
            int[] posi = new int[1001];
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    posi[arr[i]] = 1;
                    if ((arr[i] & 1) == 0) {
                        if ((posi[arr[i] / 2] == 1)) {
                            rs = true;
                            break;
                        }
                    }
                    if ((arr[i] * 2 <1001) && posi[arr[i] * 2] == 1) {
                        rs = true;
                        break;
                    }
                } else if (arr[i] < 0) {
                    nega[1000 + arr[i]] = 1;
                    if (((-arr[i]) & 1) == 0) {
                        if ((nega[1000 + arr[i] / 2] == 1)) {
                            rs = true;
                            break;
                        }
                    }
                    if ((1000 + arr[i] * 2 >= 0) && nega[1000 + arr[i] * 2] == 1) {
                        rs = true;
                        break;
                    }
                }else {
                    cnt++;
                }
            }
            if (cnt > 1) {
                rs = true;
            }
            return rs;
        }
    }

}
