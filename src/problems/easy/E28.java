package problems.easy;

public class E28 {

    public static void main(String[] args) {
        String haystack = "";
        String needle = "";
        System.out.println(new Solution().strStr(haystack, needle));
        
    }   
    private static class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack.equals(needle)) {
                return 0;
            }
            if (needle.trim().length() == 0) {
                return 0;
            }
            int i = 0, j = 0;
            char[] src = haystack.toCharArray();
            char[] ptn = needle.toCharArray();
            int sLen = src.length;
            int pLen = ptn.length;
            int[] next = getNext(ptn);
            while (i < sLen && j < pLen) {
                if (j == -1 || src[i] == ptn[j]) {
                    i++;
                    j++;
                } else {
                    j = next[j];
                }
            }
            if (j == pLen)
                return i - j;
            return -1;
        }
        
        private int[] getNext(char[] p) {
            int pLen = p.length;
            int[] next = new int[pLen];
            int k = -1;
            int j = 0;
            next[0] = -1; // next数组中next[0]为-1
            while (j < pLen - 1) {
                if (k == -1 || p[j] == p[k]) {
                    k++;
                    j++;
                    if (p[j] != p[k]) {
                        next[j] = k;// KMPStringMatcher中只有这一行
                    } else {
                        next[j] = next[k];
                    }
                } else {
                    k = next[k];
                }
            }
            return next;
        }
    }

}
