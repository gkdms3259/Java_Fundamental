package java_20190718;

public class LotteryDemo {
	public static void main(String[] args) {
		// Math.random() => 0보다 크거나 같고 1보다 작은 양수를 double 값으로 반환.
		for (int k = 0; k < 5; k++) {
			int[] lotto = new int[6];

			for (int i = 0; i < lotto.length; i++) {
				// temp는 1보다 크거나 같고 45보다 작거나 같은 임의의 값
				// 매번 새로 생성되어야 한다.
				double random = Math.random();
				int temp = (int) (random * 45) + 1;
				if (i == 0) { // 첫번째는 비교가 필요없기 때문에 바로 입력
					lotto[i] = temp;
				} else {
					// isExisted는 임의의 값 temp와 이전 배열의 값을 비교했을 때
					// 동일한 값이 있는 경우는 true, 없으면 false
					boolean isExisted = false;
					// i==1 아래의 for loop는 1번 반복
					// i==2 아래의 for loop는 2번 반복
					// i==3 아래의 for loop는 3번 반복...
					for (int j = 0; j < i; j++) {
						if (lotto[j] == temp) {
							// 새로 생성한 temp와 이전 배열의 값을 비교해서 같은 값이 존재하면
							isExisted = true;
							break;
						}
					}
					// 존재하지않으면 새로은 배열에 값을 넣고
					if (!isExisted) {
						lotto[i] = temp;
						// 존재하면 i를 원위치로 만들기 위해. for문에서 i++로 가는것 방지.
					} else {
						i--;
					}
				}
			}
			for (int j = 0; j < lotto.length; j++) {
				for (int i = 0; i < lotto.length - (j + 1); i++) {
					if (lotto[i] > lotto[i + 1]) { // 오름차순으로 정렬시키기
						int temp = lotto[i];
						lotto[i] = lotto[i + 1];
						lotto[i + 1] = temp;
					}
				}
			}
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + "\t"
						+ "");
			}
			System.out.println();
		}
	}
}