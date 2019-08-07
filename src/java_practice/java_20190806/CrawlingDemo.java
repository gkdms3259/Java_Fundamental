package java_practice.java_20190806;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo { 
	public static void main(String[] args) {
		String url ="https://sports.news.naver.com/index.nhn";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("성공");
		
		Elements elements = doc.select(".aside_radio");
		Elements radioElements = elements.select("ul");
		//System.out.println(radioElements);
		
		Elements liElements = elements.select("li");
		for(int i=0; i<liElements.size();i++) {
			Element liElement = liElements.get(i);
			System.out.println(liElement.text());
		}
	}

}
