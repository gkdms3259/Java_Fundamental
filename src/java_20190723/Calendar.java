package java_20190723;

public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	// instance변수는 공개를 안했지만 final은 공개해도 뭐~

	private int getCount(int year, int month, int day) {
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCount = 0;

		totalCount = preYear * 365 + preYear / 4 - preYear / 100 + preYear / 400;

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean isLeafYear = isLeafYear(year); //길게 중복되는것 드래그한 후 alt + shift + m
		if (isLeafYear) {                      //method이름 정해주고 확인 누르면 간단하게 바뀜.

			monthArray[1] = 29;
		}
		for (int i = 0; i < preMonth; i++) {
			totalCount += monthArray[i];
		}

		totalCount += day;
		return totalCount;
	}

	private boolean isLeafYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}

	public void print(int year) {

		for (int i = 1; i <= 12; i++) { // for(int i=0; i<12;i++) {
			if (i % 2 == 1) {           // 홀수 달만 뽑기
				print(year, i);         // print(year,i+1); 이렇게 해도 같은것.
			}
		}

		System.out.println();
	}

	private int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean isLeafYear = isLeafYear(year);
		if (isLeafYear) {

			monthArray[1] = 29;
		}
		return monthArray[month - 1]; // 1월이면0번째꺼,2월이면 1번째꺼... 그래서 -1
	}

	public void print(int year, int month) {
		System.out.printf("%d,%d%n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		// 들여쓰기
		// 2019 7 1 => 총 날짜를 구한다.
		int totalCount = getCount(year, month, 1);
		int rest = totalCount % 7;
		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= getLastDay(year, month); i++) {
			System.out.print(i + "\t");
			if (rest % 7 == Calendar.SATURDAY) {
				System.out.println();
			}
			rest++;
			// 개행
		}
		System.out.println();
	}

	public void print(int year, int month, int day) {
		int totalCount = getCount(year, month, day);

		int dayOfWeek = totalCount % 7;
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
