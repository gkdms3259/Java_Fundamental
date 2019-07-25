package java_practice;

public class Parent2 {
	static {
	staticParent2 = 10 ;
	System.out.println("Parent2 static 초기화");
	}
	static int staticParent2 ;
	String name;
	{
		System.out.println("Parent2 static block");
	}
	public Parent2() {
		super();
		System.out.println("Parent2 생성자");
	}
	}