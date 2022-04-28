package contest.weekly.c290;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Random;

public class B {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = { { 2, 2, 2 }, { 3,4, 1 } };
        System.out.println(solution.countLatticePoints(nums));
        int[][] nums1 = { { 2, 2, 1 } };
        System.out.println(solution.countLatticePoints(nums1));
        int[][] nums2 = { { 8, 9, 6 }, { 9, 8, 4 }, { 4, 1, 1 }, { 8, 5, 1 }, { 7, 1, 1 },
                { 6, 7, 5 }, { 5, 5, 3 } };
//        int[][] nums2 = {  {5, 5, 3 } };
        System.out.println(solution.countLatticePoints(nums2));
        Random random = new Random();
        random.nextInt(12);
    }

    // [5-5, 5-4, 5-6, 8-5, 5-8, 2-5, 5-2, 4-4, 4-5, 4-6, 6-4, 6-5, 6-6]
    private static class Solution {
        public int countLatticePoints(int[][] circles) {
            Set<String> set = new HashSet<String>();
            for (int i = 0; i < circles.length; i++) {
                int radius = circles[i][2];
                Pair pair = new Pair(circles[i][0], circles[i][1]);
                set.addAll(check(pair, radius));
            }
//            System.out.println(set.toString());
            return set.size();
        }

        private Set<String> check(Pair pair, int radius) {
            Set<String> set = new HashSet<String>();
            int x = pair.x;
            int y = pair.y;
            Queue<Pair> queue = new LinkedBlockingQueue<Pair>();
            queue.offer(pair);
            Set<Pair> visited = new HashSet<Pair>();
            visited.add(pair);
            while (!queue.isEmpty()) {
                Pair point = queue.poll();
                int distance = (point.x - x) * (point.x - x) + (point.y - y) * (point.y - y);
                if (distance - radius * radius <= 0) {
                    set.add(point.x + "-" + point.y);
                    Pair left = new Pair(point.x - 1, point.y);
                    if (!visited.contains(left)) {
                        queue.offer(left);
                        visited.add(left);
//                        System.out.println("point: " + point.toString() + " left: " + left.toString());
                    }
                    Pair right = new Pair(point.x + 1, point.y);
                    if (!visited.contains(right)) {
                        queue.offer(right);
                        visited.add(right);
//                        System.out.println("point: " + point.toString() + " right: " + right.toString());
                    }
                    Pair donw = new Pair(point.x, point.y - 1);
                    if (!visited.contains(donw)) {
                        queue.offer(donw);
                        visited.add(donw);
//                        System.out.println("point: " + point.toString() + " donw: " + donw.toString());
                    }
                    Pair top = new Pair(point.x, point.y + 1);
                    if (!visited.contains(top)) {
                        queue.offer(top);
                        visited.add(top);
                       //System.out.println("point: " + point.toString() + " top: " + top.toString());
                    }
                    int i = 1;
                }
            }
            set.add((x - radius) + "-" + y);
            set.add((x + radius) + "-" + y);
            set.add(x + "-" + (y - radius));
            set.add(x + "-" + (y + radius));
//            System.out.println(set.toString());
//            System.out.println(visited.toString() + " " + visited.size());
            return set;
        }

        private class Pair {
            int x;
            int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public String toString() {
                return "Pair [x=" + x + ", y=" + y + "]";
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + getEnclosingInstance().hashCode();
                result = prime * result + x;
                result = prime * result + y;
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
                if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                    return false;
                if (x != other.x)
                    return false;
                if (y != other.y)
                    return false;
                return true;
            }

            private Solution getEnclosingInstance() {
                return Solution.this;
            }

        }
    }

}
