package problems.easy;

public class E832 {

    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] rs = new Solution().flipAndInvertImage(image);
        for (int i = 0; i < rs.length; i++) {
            for (int j = 0; j < rs[i].length; j++) {
                System.out.print(rs[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static class Solution {
        public int[][] flipAndInvertImage(int[][] image) {
            int[][] rs = {};
            for (int i = 0; i < image.length; i++) {
                int lo = 0;
                int hi = image[i].length - 1;
                while (lo <= hi) {
                    if (lo != hi) {
                        image[i][lo] = image[i][lo] + image[i][hi];
                        image[i][hi] = image[i][lo] - image[i][hi];
                        image[i][lo] = image[i][lo] - image[i][hi];
                    }
                    if (image[i][lo] == 1) {
                        image[i][lo] = 0;
                    } else {
                        image[i][lo] = 1;
                    }
                    if (lo != hi) {
                        if (image[i][hi] == 1) {
                            image[i][hi] = 0;
                        } else {
                            image[i][hi] = 1;
                        }
                    }
                    lo++;
                    hi--;
                }
            }
            return image;
        }
    }

}
