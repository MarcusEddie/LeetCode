package problems.easy;

public class E1935 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static class Solution {
        public int canBeTypedWords(String text, String brokenLetters) {
            String[] str = new String[brokenLetters.length()];
            for(int i = 0; i < brokenLetters.length(); i++){
                str[i] = String.valueOf(brokenLetters.charAt(i));
            }
            String[] words = text.split(" ");
            int broken = 0;
            for(int i = 0; i < words.length; i++){
                for(int j = 0; j < str.length; j++){
                    if(words[i].contains(str[i])){
                        broken++;
                        break;
                    }
                }
            }
            return words.length - broken;
        }
    }

}
