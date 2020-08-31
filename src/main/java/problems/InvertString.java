package problems;

public class InvertString {

    /**
     * Invert a String without using String default reverse() method
     *
     * */


    public static void main(String[] args) {
        String string = "it is a Grand test";

        byte[] array = string.getBytes();
        byte[] result = new byte[array.length];

        for (int i = 0; i < array.length; i++)
            result[i] = array[array.length - i - 1];

        System.out.println(new String(result));

    }
}
