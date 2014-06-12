package chapter3.javaio;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Run {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/* FileReader extends InputStreamReader extends Reader.
		 * It is a concrete component that be wrapped by decorators.*/
		FileReader	reader  =  new FileReader("data.txt");
		
		/* LineNumberReader extends BufferedReader extends Reader
		 * It's a concrete decorator, that can wrap an instance of Reader.
		 * While BufferedReader is also a concrete decorator. */
		LineNumberReader  lineReader=  new LineNumberReader(reader);
		
		/* We create a customized reader, UpperCaseBufferReader which change
		 * lower case letter coming to to upper case.
		 */
		UpperCaseBufferReader  ucbreader  =  new UpperCaseBufferReader(new FileReader("data.txt"));
		
		int		data  =  0;
		while( (data  =  lineReader.read()) != -1 ) {
			System.out.println( (char)data + " : " + lineReader.getLineNumber());
		}
		
		while ( (data=ucbreader.read()) != -1) {
			System.out.println( (char)data );
		}
		
		lineReader.close();
		ucbreader.close();
	}

}
