package java_practice;

public class Child2 extends Parent2{
	static {
		staticChild2 = 200;
		System.out.println("Child2 static 초기화");
	}
	static int staticChild2 ;
	String phone;
	{
		System.out.println("Child2 instance block");
	}
	public Child2() {
		super();
		System.out.println("Child2 초기화");
	}
	
}
	