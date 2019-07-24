package java_practice;

public class InitializationDemo2 {

	
	int a;
	static int b;
	static final int C = 100;
	
	public InitializationDemo2(int a) {
		super() ;
		System.out.println("생성자");
		this.a = a; 
	}
	
	public static void main(String[] args) {
		InitializationDemo2 i = new InitializationDemo2(1000);
		System.out.println(i.a);
		System.out.println(C);
	}
}
