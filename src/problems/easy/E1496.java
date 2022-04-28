package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class E1496 {

    public static void main(String[] args) {
        System.out.println(new Solution().isPathCrossing("NES"));
    }
    
    private static class Solution {
        public boolean isPathCrossing(String path) {
            boolean rs = true;
            Set<String> set = new HashSet<String>();
            set.add("0-0");
            int x0 = 0;
            int y0 = 0;
            for (int i = 0; i < path.length(); i++) {
                StringBuilder builder = new StringBuilder();
                if (path.charAt(i) == 'N') {
                    y0++;
                } else if (path.charAt(i) == 'S') {
                    y0--;
                } else if (path.charAt(i) == 'E') {
                    x0++;
                } else {
                    x0--;
                }
                builder.append(x0).append("-").append(y0);
                if (set.contains(builder.toString())) {
                    rs = false;
                    break;
                } else {
                    set.add(builder.toString());
                }
            }
            return !rs;
        }
    }

}
