package javainputoutput;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class BufferReaderDemo {
    /**
     * Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
     */
    public static void main(String[] args) throws IOException {
        fileReader();

    }

    public static void fileReader() throws IOException {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputstream = classloader.getResourceAsStream("Key-To-Success");
        InputStreamReader streamReader = new InputStreamReader(inputstream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);

        }
    }
}
