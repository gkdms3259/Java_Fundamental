package java_20190725;

public class Rectangle extends Shape{  //추상클래스라서 오버라이딩 시켜줘야함.
    int width,height; //사각형은 저 두개만 있으면 만들 수 있음.
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle - draw");
	}

}
