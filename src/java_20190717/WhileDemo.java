package java_20190717;

public class WhileDemo {
	public static void main(String[] orgs) {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);

		// 구구단 while로 짜보기

		int first = 2;
		while (first <= 9) {
			int second = 1;
			while (second <= 9) {
				System.out.printf("%d * %d = %d%n", first, second, first * second);
				second++;
			}

			first++;
		}

	}
}
