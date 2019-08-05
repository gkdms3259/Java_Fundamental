package java_20190802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class NaverCafeScanningDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://blog.naver.com/PostView.nhn?blogId=harloveysj&logNo=221460034406&redirect=Dlog&widgetTypeCall=true&directAccess=false");
		InputStream is = url.openStream();
	    //1. InputStream을 InputStreamReader로 바꾼다.(stream chainning)
		//2. InputStreamReader를 BufferedReader로 바꾼다.(stream chainning)
		//3. BufferedReader로 읽은 정보(html)를  c:\\dev\\test\\naver.cafe.html 파일 저장한다.
	    InputStreamReader isr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
   
	    try {
	    	isr = new InputStreamReader(is); 
	    	br = new BufferedReader(isr); 
	    	
	    	fw = new FileWriter("c:\\dev\\test\\naver.cafe.html"); //true이어쓰기
	    	bw = new BufferedWriter(fw);
	    	pw = new PrintWriter(bw,true);
	    	
	    	String readLine = null;
	    	while((readLine = br.readLine()) != null) {
	    		//System.out.println(readLine);
	    		pw.println(readLine);
	    	}	
	    	
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br !=null) br.close();
				if(bw !=null) bw.close();
				if(fw !=null) fw.close();
				if(pw !=null) pw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        }
	}

        
	
        
		
    	
		
	

	

