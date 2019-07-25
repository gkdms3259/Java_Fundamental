package java_20190725;

public class Child extends Parent { //super클래스 parent로 지정하기(클래스명 정하는곳에서)
   static {
	   staticChild = 200;
	   System.out.println("Child static 초기화");
   }
	static int staticChild;
	String phone;
	{
		System.out.println("Child instance block");
	}
	public Child() {
		//super();생략
		System.out.println("Child 생성자");
	}
}
