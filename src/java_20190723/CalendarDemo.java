package java_20190723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; //ctrl + shift + o 
									//import 자동완성

public class CalendarDemo {

	public static String console() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드입력
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		Calendar c = new Calendar();
		while (true) {
			System.out.print("날짜를 입력하세요>");
			String readLine = console();
			if (readLine.contentEquals("exit"))
				break; // 종료시키기위해 exit를 누르면 정지할 수 있게 코딩했음

			// split 메서드는 공백으로 문자열을 분리시켜 배열로 반환.
			String[] data = readLine.split(" ");
			int dataLength = data.length;
			if (dataLength == 1) {
				// String syear = data[0];
				// int year = Integer.parseInt(syear); => 이렇게 두줄을 쓸바에는 밑에 처럼 한줄로 하는게 더 간단.
				int year = Integer.parseInt(data[0]); // 문자열을 int로 변환하는 메서드
				//System.out.printf("입력한 값 : %d%n", year);
				c.print(year);
			} else if (dataLength == 2) {
				// String syear = data[0];
				// String smonth = data[1];
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				//System.out.printf("입력한 값 :%d, %d%n", year, month);
				c.print(year,month);
			} else if (dataLength == 3) {
				// String syear = data[0];
				// String smonth = data[1];
				// String sday = data[2];
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				int day = Integer.parseInt(data[2]);
				c.print(year,month,day);
				//System.out.printf("입력한 값 :%d, %d, %d%n", year, month, day);
			}

			// System.out.printf("입력한 값 : %s%n",readLine); //종료시키고 싶으면 밑에 빨간 네모버튼 누르기
		}
	}
}
