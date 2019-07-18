package java_20190717;

public class ForDemo {
	public static void main(String[] orgs) {
		//if빼면 1~10까지 더하기. if문을 넣으면 짝수만 더하기.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			//if (i % 2 != 1) {
				// if( i%2 == 0) { => 위랑 동일(짝수만 더하기)
				sum += i;
			//} if문의 괄호임.
		}
		System.out.printf("1부터 10까지 총 합은 %d 입니다. ", sum);

		// 구구단 구하기(2중 for)
		for (int first = 2; first <= 9; first++) {
			for (int next = 1; next <= 9; next++) {
				System.out.printf("%d * %d = %d%n", first, next, first * next);
			}
		}
		
		/* 모형 만들기
		 *****
		 ****
		 ***
		 **
		 *
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.printf("%d%d",i,j);
				// 1.개행하기 전이라서 j가 0~4까지 찍는데 그걸 별로 표현
				// 3.개행한 후 i가 1이 되었고 j가 0~3까지 찍히고 그걸 별로 표현
			}
			System.out.printf("%n");
			// 2.개행 한번 하고 이제 i는 1로 증가.
			// 4.개행한 후 i가 2가 되었고 계속 반복...
		}
      //구구단 9단부터 2단까지
		for(int i =9; i>=2; i-- ) {
			for(int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d = %d%n", i, j, i*j);	
			}
		}
		
	}
}
