package java_20190725;

public class ShapeDemo {
     //추상클래스의 다형성
	public static void run(Shape s) {
		s.draw();
	}
	// public static void run(Rectangle r) {
	// s.draw();
	// } //이런식으로 하면 하나하나 다 써야되지만 위에처럼 쓰면 한문장으로 끝
	// public static void run(Circle c) {
	// s.draw();

	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성할 수 없음!!
		// Shape s = new Shape(); //이게 바로 그 예

		// Rectangle r = new Rectangle();
		// Shape s1 = r;
		// s1.draw();

		run(new Rectangle());

		 Shape s2 = new Circle();
		// s2.draw();

		run(new Circle());  // run(s2); 를 넣어도 동일
		
	}

}
