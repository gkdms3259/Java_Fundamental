package java_20190731;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1; //얘만 특이하게 0부터 세서 +1을 해줘야한다.
		int day = c.get(Calendar.DATE);
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.printf("%d년%d월%d일%d시%d분%d초%n",year,month,day,hour,minute,second);
		
		c.set(2019,6,1); //2019-07-01일임
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); //얘는 1이 일요일,2이 월요일 ....7일 토요일    
		
		Calendar2 c2 = new Calendar2();
		//c2.print(2019, 7, 31);
		//c2.print(2019,7);
		c2.print(2019);
		
		/*
		GregorianCalendar g = new GregorianCalendar();
		for(int i=1521;i<=3000;i++) {
			System.out.println(i+"년 - "+g.isLeapYear(i));
		}
	    */
		
	}
}
