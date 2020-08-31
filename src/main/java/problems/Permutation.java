package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("Java","");



    }
        public static void permutation(String string,String answer){
        if (string.length() == 0) {
            System.out.print(answer + " ");
            return;
        }

        boolean alpha[] = new boolean[26];

        for (int i = 0; i < string.length(); i++) {
            
            char ch = string.charAt(i);
            String remainingString = string.substring(0, i) +
                    string.substring(i + 1);
            
            if (alpha[ch - 'a'] == false)
                permutation(remainingString, answer + ch);
            alpha[ch - 'a'] = true;
        }
    }
}

