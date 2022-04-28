package problems.easy;

import java.sql.BatchUpdateException;

public class E1736 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public String maximumTime(String time) {
            StringBuilder builder = new StringBuilder();
            String[] times = time.split(":");
            if (times[0].indexOf("?") == 0 && times[0].lastIndexOf("?") == 0) {
                if (Integer.valueOf(times[0].substring(1)) > 3) {
                    builder.append("1").append(times[0].substring(1));
                } else {
                    builder.append("2").append(times[0].substring(1));
                }
            } else if (times[0].indexOf("?") == 0 && times[0].lastIndexOf("?") == 1) {
                builder.append("23");
            } else if (times[0].indexOf("?") == 1 && times[0].lastIndexOf("?") == 1) {
                if (Integer.valueOf(times[0].substring(0)) > 3) {
                    builder.append(times[0].substring(0)).append("1");
                } else {
                    builder.append(times[0].substring(0)).append("2");
                }
            } else {
                builder.append(times[0]);
            }
            builder.append(":");
            if (times[1].indexOf("?") == 0 && times[1].lastIndexOf("?") == 0) {
                builder.append("5").append(times[0].substring(1));
            } else if (times[1].indexOf("?") == 0 && times[1].lastIndexOf("?") == 1) {
                builder.append("59");
            } else if (times[1].indexOf("?") == 1 && times[1].lastIndexOf("?") == 1) {
                builder.append(times[1].substring(0)).append("9");
            } else {
                builder.append(times[1]);
            }
            return builder.toString();
        }
    }

}
