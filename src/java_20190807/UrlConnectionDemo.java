package java_20190807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	public static void main(String[] args) throws IOException {
		
     	URL url = new URL("https://sports.news.naver.com/wbaseball/index.nhn"); //throws해줌.(중요하지 않아서)(중요하면 try/catch로 잡고)
     	URLConnection urlCon = url.openConnection(); //이전에는 MalformException이었는데 이거 import해주면 IOException으로바뀜(이게 더 상위버전)
     	
     	String cacheControl = urlCon.getHeaderField("cache-control");
     	String contentType = urlCon.getHeaderField("content-type");
     	String date = urlCon.getHeaderField("date");
     	
     	
     	System.out.println("cacheControl : "+cacheControl);
     	System.out.println("contentType : "+contentType);
     	System.out.println("date : "+date);
	
        InputStream is = urlCon.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine())!=null) {
			System.out.println(readLine);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
	