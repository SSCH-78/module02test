package api;

import java.io.Console;
import java.util.Arrays;
import java.util.*;
import java.lang.*;
import static java.lang.System.clearProperty;
import static java.lang.System.setProperty;


public class SystemAPI<keySet> {

    /**
     * @author Jahidul Islam
     * Read System JDK 8 API documantation to be read and System source code to be viewed
     * Demonastrate your understanding on System after reading the documentation
     * Show some uses of System Class
     * Explain, what is System.out.println()?
     * List all the members of the System class, such as class variable, instance variables, local variables
     * method type etc
     *
     * */

    /* System.out.println() is a method that prints the argument which is passed to it.
    The out is a static member of the System class, and is an instance of java.io.PrintStream .
    The println is a method of java.io.PrintStream.
     */


    public static void main(String args[])
    {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {6, 7, 8, 9, 10};

        System.arraycopy(first, 0, second, 2, 2);

        // array b after arraycopy operation
        System.out.println(Arrays.toString(second));


        // checking specific property
        System.out.println(System.getProperty("user.home"));

        // claering this property
        clearProperty("user.home");

        System.out.println(System.getProperty("user.home"));

        // setting specific property
        setProperty("user.country", "PAKISTAN");

        // checking property
        System.out.println(System.getProperty("user.country"));

        // checking property other than system property
        // illustrating getProperty(String key, String def)
        System.out.println(System.getProperty("user.password",
                "javaTest"));




       // Returns the unique Console object associated with the current Java virtual machine, if any.
        Console c = System.console();
        if(c != null)
        {
            Currency currency = Currency.getInstance(Locale.ITALY);
            c.printf(currency.getSymbol());
            c.flush();
        }
        else
            System.out.println("No console attached");

       // Determines the current system properties
        Properties properties = System.getProperties();
        Set<Object> keySet = properties.keySet();
        for (Object key : keySet) {
            System.out.println("key= " + key);
        }
    }

}








