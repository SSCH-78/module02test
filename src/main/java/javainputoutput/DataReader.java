package javainputoutput;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class DataReader {

	public static void main(String[] args) throws IOException {

		/**
		 * Use API to read the below textFile and print to console.
		 * /src/main/resources/Key-To-Success
		 * Use FileReader class, no need to store in buffer
		 * Use try....catch block to handle Exception.
		 * Use ForEach loop/while loop/Iterator to retrieve data.
		 */
		DataReader reader=new DataReader();
		reader.readFile();

	}
		public void readFile() throws IOException {
			String fileName = "/resources/Key-To-Success.txt";
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource(fileName).getFile());

			String content = new String(Files.readAllBytes(file.toPath()));
			System.out.println(content);


		}

	}

