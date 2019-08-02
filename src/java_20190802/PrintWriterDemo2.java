package java_20190802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriterDemo2 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("c:\\dev\\test\\kic.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("c:\\dev\\test\\kic-copy.txt");
			bw = new BufferedWriter(fw);
			
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine();    //개행시켜주는 메서드
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

		
	}


