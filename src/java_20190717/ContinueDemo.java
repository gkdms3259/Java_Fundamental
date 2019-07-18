package java_20190717;

public class ContinueDemo {
	public static void main(String[] orgs) {
		// if빼면 1~10까지 더하기. if문을 넣으면 짝수만 더하기.
		int sum = 0;
		// test라는 lable의 반복문을 빠져나가기 위한 것 => break test
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				continue;
			// 반복문에서 continue문을 만나면 그 이하의 문장은 수행하지않고 계속 실행 => 6만빼고 다 더해짐.
			sum += i;
		}

		System.out.printf("1부터 5까지 총 합은 %d 입니다. ", sum);

		outter: for (int first = 2; first <= 9; first++) {
			for (int next = 1; next <= 9; next++) {
				if (next == 5)
					continue outter;
				// for문 두번째꺼에서 5가 되면 수행하지않고 앞에 for문으로 넘어가서 다음 문장을 수행
				/*
				 * continue옆에 outter lable을 빼면 두번째 for문에 들어갈 수 있는 모든 5가 다 빠지게 된다. 
				 * ex)5*1 5*2 5*3 5*4 5*6 ..... 
				 *    6*1 6*2 6*3 6*4 6*6 .....
				 */
				System.out.printf("%d * %d = %d%n", first, next, first * next);
			}
			// lf(true)-조건다음에 return; 이면 그 아래는 다 수행이 안되고 끝나버린다.
		}
	}
}