package contest.weekly.c293;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D {

    public static void main(String[] args) {
        CountIntervals solution = new CountIntervals();
    }

    private static class CountIntervals {
        private List<int[]> list;
        private int count;
        private int[][] slot = new int[100000][2];
        private int min = Integer.MAX_VALUE;
        private int max = 0;
        public CountIntervals() {
            list = new ArrayList<int[]>();
            count = 0;
        }
        
        public void add(int left, int right) {
            boolean flag = true;
            boolean flag2 = true;
            for (int i = min; i <= max; i++) {
                if (slot[i][0] <= left && left <= slot[i][1] && slot[i][0] <= right && right <= slot[i][1]) {
                    flag = false;
                } else if (slot[i][0] <= left && left <= slot[i][1] && slot[i][1] < right) {
                    flag = false;
                    flag2 = false;
                    for (int j = i + 1; j < slot.length; j++) {
                        if (slot[j][0] <= right) {
                            slot[j][0] = -1;
                        } else {
                            break;
                        }
                    }
                } else if (left < slot[i][0] && slot[i][0] <= right && right <= slot[i][1]) {
                    flag = false;
                    flag2 = false;
                    for (int j = i - 1; j >= min; j--) {
                        if (slot[j][1] >= left) {
                            slot[j][1] = -1;
                        } else {
                            break;
                        }
                    }
                } else if (left < slot[i][0] && slot[i][1] < right) {
                    flag = false;
                    flag2 = false;
                    for (int j = i + 1; j < slot.length; j++) {
                        if (slot[j][0] <= right) {
                            slot[j][0] = -1;
                        } else {
                            break;
                        }
                    }
                    for (int j = i - 1; j >= min; j--) {
                        if (slot[j][1] >= left) {
                            slot[j][1] = -1;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        
        public int count() {
            int rs = 0;
            return rs;
        }
    }

}
