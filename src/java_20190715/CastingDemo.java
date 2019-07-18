package java_20190715;

public class CastingDemo {
	public static void main(String[] args) {
		// overflow 발생하여 컴파일 에러
		// byte b1 = 250;

		byte b1 = (byte) 250; // circuit 발생, 권장하지않음
		System.out.println(b1);

		int i1 = (int) 123.45; // cut발생
		System.out.println(i1);

		double d1 = 123.45f; // 자동 형변환

		byte b2 = 10;
		byte b3 = 20;
		// 산술연산자는 반환값이 int이기 때문에 전체를 byte로 형변환해야 에러가 발생하지 않음.
		byte b4 = (byte) (b2 + b3);
		System.out.println(b4);

	}
}
