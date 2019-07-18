package java_20190716;

public class IfDemo {
	public static void main(String[] args) {
		// play버튼을 누르면 Run Configurations => Aguments => Program aguments에 넣기
		int month = Integer.parseInt(args[0]);

		// OR문으로 해도 되지만 AND문으로 해서 이상 이하로 해서 해도 됨.(사이값 정할때는 AND)
		// 단, 첫문장은 OR로 해야됨 month 앞에가 12이상이라 하면 없는계절이 되기때문.

		String season = null;
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 6 && month <= 8) {
			season = "여름";
		} else if (month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "없는 계절";
		}
		System.out.println(month + "월은" + season + "입니다.");
		// 숫자 + 문자는 문자로 간주 ex) 6 + "4" = 64로 나오게 됨.

	}

}
