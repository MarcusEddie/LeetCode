package problems.easy;

public class E1700 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int countStudents(int[] students, int[] sandwiches) {
            int rs = 0;
            int[] slot = new int[2];
            for (int i = 0; i < students.length; i++) {
                slot[students[i]]++;
            }
            for (int i = 0; i < sandwiches.length; i++) {
                if (slot[sandwiches[i]] > 0) {
                    slot[sandwiches[i]]--;
                } else {
                    break;
                }
            }
            if (slot[0] != 0) {
                rs = slot[0];
            }
            if (slot[1] != 0) {
                rs = slot[1];
            }
            return rs;
        }
    }

}
