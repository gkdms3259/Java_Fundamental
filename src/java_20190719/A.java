package java_20190719;
//public은 파일이름과 동일한 클래스에만 추가할 수 있음

public class A {
	String name;
	int age;

	public void m() {
		System.out.println("m() 메서드");
	}

	// main은 파일이름과 클래스이름이 같은곳에 위치해야함
	// main매서드가 실행되기 위해서는 public이 추가된 클래스에서만 작동됨
	public static void main(String[] args) {
		//객체생성을 할 줄 알아야함.
		A a = new A();
		a.name = "성영한";
		a.age = 20;

		System.out.println(a.name);
		System.out.println(a.age);

		a.m();

	}
}

//클래스 두개 만드는건 가능. but, public과  main매서드는 파일이름과 같은 클래스만 가능
class B {

}
