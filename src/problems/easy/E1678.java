package problems.easy;

public class E1678 {

    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(new Solution().interpret(command));
    }
    
    private static class Solution {
        public String interpret(String command) {
            StringBuilder rs = new StringBuilder();
            while (command.length() != 0) {
                if (command.indexOf("G") == 0) {
                    rs.append("G");
                    command = command.substring(1);
                } else if (command.indexOf("()") == 0) {
                    rs.append("o");
                    command = command.substring(2);
                } else if (command.indexOf("(al)") == 0) {
                    rs.append("al");
                    command = command.substring(4);
                }
            }
            return rs.toString();
        }
    }

}
