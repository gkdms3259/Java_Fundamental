package java_20190717;
//정하은
public class BreakDemo {
	public static void main(String[] orgs) {
		//if빼면 1~10까지 더하기. if문을 넣으면 짝수만 더하기.
		int sum = 0;
	//test라는 lable의 반복문을 빠져나가기 위한 것 => break test
		test:for (int i = 1; i <= 10; i++) {
		   if (i ==6 ) break test;
				sum += i;
			}
		
		System.out.printf("1부터 5까지 총 합은 %d 입니다. ", sum);
		
		outter:for(int first = 2; first <= 9; first++) {
			for (int next = 1; next <= 9; next++) {
			if(first ==4 && next ==8) break  ;	
		//outter lable을 break 뒤에 안쓰게 되면 4*8과4*9는 안나오고 다시 5단부터 시작해서 나옴
	    //진행하고있는 해당하는 부분 for문에서만 빠져나가게 됨.
				System.out.printf("%d * %d = %d%n", first, next, first * next);
			}
	}
	}
}