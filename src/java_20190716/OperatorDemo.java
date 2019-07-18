package java_20190716;

//ctrl + shift + f => 자동으로 줄 맞춰주기
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		c = a * b;
		System.out.println(c);

		d = (double) b / (double) a;
		System.out.println(d);

		c = b % a;
		System.out.println(c);

		a += b; // a = a + b;
		System.out.println(a);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("-----------------");
		a = 10;
		b = 20;

		a++; // 11
		b++; // 21

		// 대입 후 증가
		c = a++; // c:11 a:12
		System.out.println(c);

		// 증가 후 대입
		c = ++b; // c:22 b:22
		System.out.println(c);

		a = 10;
		b = 20;

		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);

		isSuccess = a < b;
		System.out.println(isSuccess);

		isSuccess = a >= b;
		System.out.println(isSuccess);

		isSuccess = a <= b;
		System.out.println(isSuccess);

		isSuccess = a == b;
		System.out.println(isSuccess);

		isSuccess = a != b;
		System.out.println(isSuccess);

		// 앞에가 false면 계산을 아예 하지않음. => short circuit (논리연산자&&에서) -false가 나오면 true가 나올수
		// 없기때문
		// 앞에가 true면 계산을 하지않음. => short circuit (논리연산자 ||에서) - 둘중 하나라도true면 true이기때문

		isSuccess = (a == b) && (a++ == b++);
		System.out.println(isSuccess);
		// a $$ b => a가 false 이면 b연산을 하지않음(short circuit발생)
		isSuccess = (a == b) && (++a == b++);

		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);

		// a || b => a가 true 이면 b연산을 하지않음(short circuit발생)
		isSuccess = (a == b) || (++a == b++);

		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);

		// not 연산자 !
		isSuccess = (a == b) && (++a == b++);

		System.out.println(!isSuccess);
		System.out.println(a);
		System.out.println(b);

	}
}
