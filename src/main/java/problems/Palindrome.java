package problems;

public class Palindrome {
    public static void main(String[] args) {
        /**
         *If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
         * Palindrome. So write java code to check if a given String is Palindrome or not.
         *
         **/
        String str = "Hello";
        boolean isPalindrome = true;

        int i = 0;
        int j;
        while (i < (j = str.length() - 1)) {

            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                i++;
                j--;
            } else {
                isPalindrome = true;
            }
        }
        System.out.println(isPalindrome);
    }}
