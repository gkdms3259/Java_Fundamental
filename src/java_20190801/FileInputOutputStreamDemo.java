package java_20190801;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null; //이게 try/catch 안으로 들어가버리면 finally를 못쓰게 돼서 밖으로 꺼내둔 것이다.
	    FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c:\\dev\\test\\jdk.exe");
			FileDemo f = new FileDemo();
			f.mkdirs("c:\\dev\\test\\2019\\8\\1");	
			/*
			    File f1  = new File("c:\\dev\\test\\2019\\8\\1"); 
				boolean isExisted = f1.isDirectory();
				if(!isExisted) {
					f1.mkdirs();  //Directory 를 만들어주면 true, or false  //파일(경로) 만들어주는 것
			}*/
			//FileOutputStream(String path) 생성자에서 FileNotFounfException
			//에러의 의미는 경로가 없기 때문에 발생하는 것임.
			//따라서 FileOutputStream 객체를 생성할 때는 경로가 있는지 체크한 후에 객체를 생성해야 한다.	
            fos = new FileOutputStream("c:\\dev\\test\\2019\\8\\1\\jdk.exe"); //해당 경로가 없으면 error가 남. 
			int readByte = 0;
			//fis.read() 메서드는 한 바이트 읽어 반환한다.
			//만약 더 이상 읽을 바이트가 없으면 -1을 반환한다.
		    while((readByte = fis.read()) != -1) { // "-1이면 더이상 읽을게 없다."라는 의미
		    	//fos.write(readByte)는 한 바이트 쓰기
		    	fos.write(readByte); 
		    	//System.out.println(readByte);  //1byte씩 읽어준 것을 프린트할 수 있다.
		    }
			
			//System.out.println("성공");
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}catch (IOException e) {           //상위 클래스가 아래에. IOException(더 상위) > FileNotFoundException
				e.printStackTrace();
			
		}finally {
			try {
				if(fis != null) fis.close(); //null 체크를 한번 해줘야함. 안그러면  NullPointerException 발생
			    if(fos != null) fos.close();
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
