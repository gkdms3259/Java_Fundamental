package java_practice.java_20190731;

import java.util.Calendar;

public class Calendar2 {
	public void print(int year) {
		for(int i=1; i <=12; i++) {
			print(year,i);
		}
	}
	public void print(int year,int month) {
		Calendar c = Calendar.getInstance();
		c.set(year,month-1,1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		for(int i=1; i<dayOfWeek; i++) {
			System.out.println("\t");
		}
		for (int i = 1; i <= c.getActualMaximum(Calendar.DATE); i++) {
			System.out.print(i + "\t");
			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}
			dayOfWeek++;
			// 개행
		}
		System.out.println();
	}
	/**
	 매개변수에 년, 월, 일로 호출하면 요일을 출력하는 기능입니다.
     */
	public void print(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year,month-1,day);
				
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		String message = null;
		if (dayOfWeek == Calendar.MONDAY) {
			message = "월요일";
		} else if (dayOfWeek == Calendar.TUESDAY) {
			message = "화요일";
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			message = "수요일";
		} else if (dayOfWeek == Calendar.THURSDAY) {
			message = "목요일";
		} else if (dayOfWeek == Calendar.FRIDAY) {
			message = "금요일";
		} else if (dayOfWeek == Calendar.SATURDAY) {
			message = "토요일";
		} else if (dayOfWeek == Calendar.SUNDAY) {
			message = "일요일";
		}
		System.out.println(year + "년 " + month + "월 " + day + "일 " + message);
	}

	}


