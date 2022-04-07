package problems.easy;

public class E1854 {

    public static void main(String[] args) {
        int[][]logs = {{2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014}};
        System.out.println(new Solution().maximumPopulation(logs));
    }
    
    private static class Solution {
        public int maximumPopulation(int[][] logs) {
            int rs = 0;
            int[] year = new int[101];
            int max = 0;
            for (int i = 0; i < logs.length; i++) {
                for (int j = logs[i][0]; j < logs[i][1]; j++) {
                    year[j - 1950]++;
                }
                for (int j = 0; j < year.length; j++) {
                    System.out.print(year[j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < year.length; i++) {
                if (max < year[i]) {
                    max = year[i];
                    rs = i + 1950;
                }
            }
            return rs;
        }
    }

}
