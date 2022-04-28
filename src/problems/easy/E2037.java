package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class E2037 {

    public static void main(String[] args) {
//        int[] seats = {3,1,5};
//        int[] students = {2,7,4};
                        int[] seats = {12,14,19,19,12};
                int[] students = {19,2,17,20,7};
        System.out.println(new Solution().minMovesToSeat(seats, students));
    }
    
    private static class Solution {
        public int minMovesToSeat(int[] seats, int[] students) {
            int rs = 0;
            int[] slot = new int[101];
            Set<Integer> set = new HashSet<Integer>();
            
            for (int i = 0; i < seats.length; i++) {
                slot[seats[i]] = slot[seats[i]] + 1;
            }
            for (int i = 0; i < students.length; i++) {
                if (slot[students[i]] != 0) {
                    slot[students[i]] = slot[students[i]] - 1;
                    students[i] = -1;
                }
            }

            return rs;
        }
    }

}
