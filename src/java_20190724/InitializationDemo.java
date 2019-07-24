package java_20190724;
//i18n => 국제화 I nternationalizatio n
//l10n => 지역화 l ocalizatio n
public class InitializationDemo {

	static {
	//static 초기화 블럭 => static변수만 쓸 수 있음	
		System.out.println("static area"); //1
		b = 100;
	}
	//instance 초기화 블럭
	{
	System.out.println("instance area"); //4
       a=10;
	}
	int a;
	static int b;
	static final int C=10;//final변수의 초기화는 여기서 한번.
	//static 초기화
	
	//생성자에서 초기화 할수 있는 변수는 instance 변수만 가능
	public InitializationDemo(int a) {
		super(); //모든생성자에는 이게 생략되어있다.
	    System.out.println("생성자"); //5
		this.a = a;
	}
	
	public static void main(String[] args) { //2
		System.out.println("main area");
		InitializationDemo i = new InitializationDemo(1000); //3
		System.out.println(i.a);
		System.out.println(b);
		System.out.println(C);
		
	}
	

}
