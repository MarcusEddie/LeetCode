package problems.easy;

import java.util.Comparator;

public class E748 {

    public static void main(String[] args) {
        
    }
    
    private class E748Comparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            int compare = 0;
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }

}
