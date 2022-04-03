package problems;

public class Hello1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< k; i++) {
            builder.append(words[i]).append(" ");
        }
        return builder.substring(0, builder.length() - 1);
    }
}
