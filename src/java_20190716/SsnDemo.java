package java_20190716;

public class SsnDemo {
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int a3 = 1;
		int a4 = 1;
		int a5 = 1;
		int a6 = 1;

		int b1 = 1;
		int b2 = 1;
		int b3 = 1;
		int b4 = 1;
		int b5 = 1;
		int b6 = 1;
		int b7 = 8;

		// 1. 각 자리수를 2부터 9까지 곱하고 다시 2~5까지 곱해서 합을 구함.

		int sum = a1 * 2 + a2 * 3 + a3 * 4 + a4 * 5 + a5 * 6 + a6 * 7 + b1 * 8 + b2 * 9 + b3 * 2 + b4 * 3 + b5 * 4
				+ b6 * 5;

		// 2. 총합을 11로 나눈 나머지를 구한다.
		int rest = sum % 11;
		// 3. 11에서 니머지를 뺀다.
		rest = 11 - rest;
		// 4.2의 결과를 10으로 나눈 나머지를 구한다.
		rest %= 10;
		// 5. 4의 결과와 마지마 숫자가 같으면 정상적인 주민 번호
		if (rest == b7) {
			System.out.println("정상적인 주민 번호");
			/*
			 * }else { System.out.println("비 정상적인 주민 번호"); => 선생님 방식
			 */
		} else if (rest != b7) {
			System.out.println("비 정상적인 주민 번호");
		}

	}
}
