package java_20190718;

public class CalendarDemo {
	public static void main(String[] args) {
		/*-달력 만들기
		1. 1년 1월 1일 월요일
		2. 1년 365일, 윤년일 때는 366일 - 2월 29일
		3. 윤년은 4년마다 발생하고 그 중에서 100의 배수는 제외하고 
		   400의배수는 제외하지 않는다.
		4. 2019년 12월 25일 무슨 요일일까요?
		5. 2018년까지 총일수, 11월까지 총일수, 25일 더해서 
		   7로 나눈 나머지가 1이면 월요일, 2이면 화요일...
		
		*/

		int year = 2019;
		int month = 12;
		int day = 25;

		// preYear => 2018년도
		// preMonth => 2019년의 11월달까지 구하는것
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCount = 0;

		// 2018년도까지 총일 수 구하기
		
		totalCount = preYear * 365 + preYear / 4 - preYear / 100 + preYear / 400;
      
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean isLeafYear = year%4==0 && (year%100!=0|| year%400==0);
		if (isLeafYear) {  //if안에 true가 되면 밑에를 실행하고, false면 실행을 안하기때문에
			               //isLeafYear로만 쓰면 위에서 true,false를 출력해서 나오기때문에 가능.
			               //isLeafYear==true로써도 위에서 true,false를 출력한것을 기준으로 판단해서 결과출력.
			               //isLeafYear=true로 써버리면 자체가 true로 인식되어서 실행을 무조건 해버림ㅠ
                           //if문안에 (year%4==0 && year%100!=0|| year%400==0)을 넣어도 무방.
			monthArray[1] = 29;
		}
		//2019년도 11월까지 합 구하기
		for(int i=0;i<preMonth;i++) {
			totalCount += monthArray[i];
		}
		
		
		totalCount += day;
		
		int dayOfWeek = totalCount % 7;
		String message = null;
		if (dayOfWeek == 1) {
			message = "월요일";
		} else if (dayOfWeek == 2) {
			message = "화요일";
		} else if (dayOfWeek == 3) {
			message = "수요일";
		} else if (dayOfWeek == 4) {
			message = "목요일";
		} else if (dayOfWeek == 5) {
			message = "금요일";
		} else if (dayOfWeek == 6) {
			message = "토요일";
		} else if (dayOfWeek == 0) {
			message = "일요일";
		}

		// System.out.println(year + "년\t" + month + "월\t"+ day + "일\t" + message); =>
		// tab사용해서 tab만큼 띄울수 있음.
		System.out.println(year + "년 " + month + "월 " + day + "일 " + message);
	}
}
