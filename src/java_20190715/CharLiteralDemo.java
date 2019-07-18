package java_20190715;

public class CharLiteralDemo {
	public static void main(String[] args) {
		char c1 = '\uc815';
		char c2 = '\ud558';
		char c3 = '\uc740';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		// char literal의 아스키코드 표현=> 65

		char c4 = 65;
		System.out.println(c4);

		// char literal의 문자표현 => ' '

		char c5 = 'q';
		System.out.println(c5);

		char c6 = '\"';

		// \n =>개행 line feed
		// \t =>tab
		// \\ => back slash
		// \' => single quotation
		// \" => double quotation

		String path = "aa\ncc";

		System.out.println(path);

	}
}
