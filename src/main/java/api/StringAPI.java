package api;

public class StringAPI {

    /**
     * @author Jahiudl Islam
     * Read String JDK 8 API documantation to be read and String source code to be viewed
     * Demonastrate your understanding on String after reading the documentation
     * You are free to document your understanding using comment
     * Reason to comment is to keep documentation so that next developer can get highlevel understaning of your implementation
     * by reading your comments/documents
     *
     * */
    public static void main(String[] args){
        String myStr = "Hello";
        String myStr2 = "HELLO";
        char result = myStr.charAt(0);
        System.out.println(result);

        String firstName = "John ";
        String lastName = "David";
        System.out.println(firstName.concat(lastName));

        System.out.println(myStr.contains("e"));

        System.out.println(myStr.contentEquals("Hi"));

        System.out.println(firstName.toUpperCase());

        System.out.println(lastName.toLowerCase());

        String string = "       Hello Java Test       ";
        System.out.println(string);
        System.out.println(string.trim());

        System.out.println(myStr.equalsIgnoreCase(myStr2));

    }
}
