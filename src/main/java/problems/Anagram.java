package problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        Anagram anagram=new Anagram();
        Scanner scan=new Scanner(System.in);

        System.out.println("Write first word");
        String word1=scan.nextLine();
        System.out.println("Write second word");
        String word2=scan.nextLine();

        anagram.findAnagram(word1,word2);
    }

    public void findAnagram(String word1, String word2) {
        char[] firstWord=word1.toCharArray();
        char[] secondWord=word2.toCharArray();

        int lengthOfWord1= firstWord.length;
        int lengthofWord2= secondWord.length;

        boolean status=true;

        if(lengthOfWord1!=lengthofWord2){
            status=false;
        }
        else{
            Arrays.sort(firstWord);
            Arrays.sort(secondWord);

            for(int i=0;i<lengthOfWord1;i++){
                if(firstWord[i]==secondWord[i]){
                    status=true;
                }
                else{
                    status=false;
                }
            }
        }
        if(status){
            System.out.println("it is anagram");
        }
        else{
            System.out.println("it is not anagram");
        }
    }

}
