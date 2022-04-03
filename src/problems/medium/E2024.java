package problems.medium;

import java.util.ArrayList;
import java.util.List;

public class E2024 {

    public static void main(String[] args) {
        String answerKey = "TTFTTFTT";
        int k = 2;
        System.out.println(new Solution().maxConsecutiveAnswers(answerKey, k));
    }
    
    private static class Solution {
        public int maxConsecutiveAnswers(String answerKey, int k) {
            int rs = 0;
            StringBuilder tmp = new StringBuilder(answerKey);
            int cnt = 1;
            int start = 0;
            int last = 0;
            List<Integer> slot = new ArrayList<Integer>(); 
            for(int i = 1; i < tmp.length(); i++) {
                if (tmp.charAt(i) == tmp.charAt(i - 1)) {
                    cnt++;
                } else {
                    slot.add(cnt);
                    if (rs < cnt) {
                        rs = cnt;
                        start = slot.indexOf(cnt);
                    }
                    cnt = 1;
                }
                if (i == tmp.length() - 1) {
                    slot.add(cnt);
                    if (rs < cnt) {
                        rs = cnt;
                        start = slot.indexOf(cnt);
                    }
                }
            }
            
            System.out.println(start + " : " + slot.toString());
            if (start == 0) {
                rs = start(start, rs, slot, k);
            } else if (start == slot.size() - 1) {
                rs = end(start, rs, slot, k);
            } else {
                rs = middle(start, rs, slot, k);
            }

            return rs;
        }
        
        private int start(int start, int r, List<Integer> slot, int k) {
            int rs = r;
            int sign = 1;
            System.out.println(start);
            for (int i = 1; i < slot.size()&& k > 0; i++) {
                if (sign == 1) {
                    if (slot.get(i) <= k) {
                        rs = rs + slot.get(i);
                        k = k - slot.get(i);
                        if (k == 0 && i + 1< slot.size()) {
                            rs = rs + slot.get(i + 1);
                        }
                    } else {
                        rs = rs + k;
                        if (i + 1< slot.size()) {
                            rs = rs + slot.get(i + 1);
                        }
                        break;
                    }
                    sign = -sign;
                } else if (sign == -1) {
                    sign = -sign;
                }
            }
            return rs;
        }
        
        private int end(int start, int r, List<Integer> slot, int k) {
            int rs = r;
            System.out.println(start);
            int sign = 1;
            for (int i = start - 1; i >= 0 && k > 0; i--) {
                if (sign == 1) {
                    if (slot.get(i) <= k) {
                        rs = rs + slot.get(i);
                        k = k - slot.get(i);
                        if (k == 0 && i - 1 >= 0) {
                            rs = rs + slot.get(i - 1);
                        }
                    } else {
                        rs = rs + k;
                        if (i - 1 >= 0) {
                            rs = rs + slot.get(i - 1);
                        }
                        break;
                    }
                    sign = -sign;
                } else if (sign == -1) {
                    sign = -sign;
                }
            }
            return rs;
        }
        
        private int middle(int start, int r, List<Integer> slot, int k) {
            int rs = r;
            int leftS = 0;
            if (start - 2 >= 0) {
                leftS = slot.get(start - 2);
            }
            int rightS = 0;
            if (start + 2 < slot.size()) {
                rightS = slot.get(start + 2);
            }
            int leftD = slot.get(start - 1);
            int rightD = slot.get(start + 1);
            int i = 1;
            while (k > 0) {
                System.out.println(rs);
                System.out.println(leftD+ " " + leftS + " " + rightD + " " + rightS + " " + k);
                if (leftD > k && rightD > k) {
                    rs = rs + k;
                    k = 0;
                } else {
                    if (k - leftD - rightD <= 0) {
                        if (k >= leftD) {
                            if (rs + leftD + leftS > rs + k) {
                                rs = rs + leftD + leftS;
                                k = k - leftD;
                            } else {
                                rs = rs + k;
                                k = 0;
                            }
                        } else {
                            if (rs + rightD + rightS > rs + k) {
                                rs = rs + rightD + rightS;
                                k = k - rightD;
                            } else {
                                rs = rs + k;
                                k = 0;
                            }
                        }
                    } else {
                        rs = rs + leftS + leftD + rightD + rightS;
                        k = k - rightD - leftD;
                        i++;
                        leftD = 0;
                        if (start - (2 * i - 1) >=0) {
                            leftD = slot.get(start - (2 * i - 1));
                        }
                        leftS = 0;
                        if (start - (2 * i) >=0) {
                            leftD = slot.get(start - (2 * i));
                        }
                        rightD = 0;
                        if (start + (2 * i - 1) < slot.size()) {
                            rightD = slot.get(start + (2 * i - 1));
                        }
                        rightS = 0;
                        if (start + (2 * i) < slot.size()) {
                            rightS = slot.get(start + (2 * i));
                        }
                    }
                }
            }
            return rs;
        }
    }

}
