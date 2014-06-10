package chapter3.javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class UpperCaseBufferReader extends BufferedReader{
	
	public UpperCaseBufferReader (Reader in) {
		super(in);
	}
	
	public int read () throws IOException {
		int		c  =  super.read();
		return c == -1 ? -1 : Character.toUpperCase(c);
	}
	
}
