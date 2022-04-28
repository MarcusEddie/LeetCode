package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E733 {

    public static void main(String[] args) {
        int[][] image = {{0,0,0},{0,1,1}};
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
        System.out.println();
        int[][] rs = new Solution().floodFill(image, 1, 1, 1);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(Arrays.toString(rs[i]));
        }
    }
    
    private static class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            List<Pair> list = new ArrayList<Pair>();
            list.add(new Pair(sr, sc));
            Set<Pair> set = new HashSet<Pair>();
            while (!list.isEmpty()) {
                List<Pair> tmp = new ArrayList<Pair>();
                for(int i = 0; i < list.size(); i++) {
                    Pair loc = list.get(i);
                    int val = image[loc.r][loc.c];
                    image[loc.r][loc.c] = newColor;
                    if(loc.r - 1 >=0 && image[loc.r - 1][loc.c] == val) {
                        Pair pair = new Pair(loc.r - 1, loc.c);
                        if (!set.contains(pair)) {
                            tmp.add(pair);
                            set.add(pair);
                        }
                    }
                    if (loc.r + 1 < image.length && image[loc.r + 1][loc.c] == val) {
                        Pair pair = new Pair(loc.r + 1, loc.c);
                        if (!set.contains(pair)) {
                            tmp.add(pair);
                            set.add(pair);
                        }
                    }
                    if (loc.c - 1 >= 0 && image[loc.r][loc.c - 1] == val) {
                        Pair pair = new Pair(loc.r, loc.c - 1);
                        if (!set.contains(pair)) {
                            tmp.add(pair);
                            set.add(pair);
                        }
                    }
                    if (loc.c + 1 < image[0].length && image[loc.r][loc.c + 1] == val) {
                        Pair pair = new Pair(loc.r, loc.c + 1);
                        if (!set.contains(pair)) {
                            tmp.add(pair);
                            set.add(pair);
                        }
                    }
                }
                list.clear();
                list.addAll(tmp);
            }
            return image;
        }
        private  static class Pair{
            public int r;
            public int c;
            public Pair(int r, int c) {
                this.r = r;
                this.c = c;
            }
            @Override
            public String toString() {
                return "Pair [r=" + r + ", c=" + c + "]";
            }
            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + c;
                result = prime * result + r;
                return result;
            }
            @Override
            public boolean equals(Object obj) {
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                Pair other = (Pair) obj;
                if (c != other.c)
                    return false;
                if (r != other.r)
                    return false;
                return true;
            }
        }
    }
}
