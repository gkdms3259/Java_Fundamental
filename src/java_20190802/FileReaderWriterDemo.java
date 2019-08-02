package java_20190802;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		
	FileReader fr = null;
	FileWriter fw = null;
	
	try {
		fr = new FileReader("c:\\dev\\test\\kic.txt");
		fw = new FileWriter("c:\\dev\\test\\kic-copy.txt");
		/*
		int readChar = 0;
		while((readChar = fr.read())!=-1) {
			System.out.print((char)readChar);
			fw.write(readChar);
		}
		*/
		int readCharCount = 0;
		char[] readChars = new char[1024];
		while((readCharCount = fr.read(readChars)) != -1) {
	     	System.out.print(new String(readChars,0,readCharCount));
			//fw.write(new String(readChars,0,readCharCount)); write는 문자열이 가능하기때문에 이렇게 써도 된다.
	     	fw.write(readChars,0,readCharCount);
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			if(fr != null) fr.close();
			if(fw != null) fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}


