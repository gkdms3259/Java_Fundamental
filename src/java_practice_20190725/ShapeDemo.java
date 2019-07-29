package java_practice_20190725;

public class ShapeDemo {
	public static void run(Shape s) {
		s.draw();
	}
	public static void main(String[] args) {
		run(new Rectangle());
		
		Shape s2 = new Circle();
		run(new Circle());
	}
	

}
