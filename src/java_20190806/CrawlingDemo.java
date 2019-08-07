package java_20190806;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {
	/*String url ="http://www.imbc.com";
	//HTML 문서 전체를 관리하기 위한 객체
	Document doc = null;
	
	try {
		doc = Jsoup.connect(url).get();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("성공");
	
	Elements elements = doc.select(".con-wrap.notice-wrap");
	Elements noticeElements = elements.select("h3");
	String noticeTitle = noticeElements.text();
	System.out.println(noticeTitle);
	
	Elements liElements = elements.select(".notice-list li"); //더 정확하게 찾으려면 써주는게 낫다.저 명이 하나밖에 없으면 li라고 써도 괜춘~
	for(int i=0;i<liElements.size();i++) { //for loop로 안에 있는 리스트들을 가져옴.
		Element liElement = liElements.get(i);
		System.out.println(liElement.text());
	}*/
	
	//****************************************************************************************
		
	String url = "https://sports.naver.com/kfootball/index.nhn";
    Document doc = null;
	
	try {
		doc = Jsoup.connect(url).get();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("성공");
	
	Elements elements = doc.select(".home_news");
	Elements liElements = elements.select(".home_news_list li");
	
	for(int i=0;i<liElements.size();i++) { //for loop로 안에 있는 리스트들을 가져옴.
		Element liElement = liElements.get(i);
		System.out.println(liElement.text());
	}
	//*************************************************************************
	
	
	
	
	
	
}
}

