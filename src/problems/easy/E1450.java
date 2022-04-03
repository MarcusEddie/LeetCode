package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class E1450 {

    public static void main(String[] args) {
    }
    
    private static class Solution {
        public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
            int rs = 0;
            for (int i = 0; i < endTime.length; i++) {
                if (startTime[i] <= queryTime && queryTime <= endTime[i] ) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
