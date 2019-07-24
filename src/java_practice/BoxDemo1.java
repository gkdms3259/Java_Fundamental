package java_practice;

public class BoxDemo1 {
	int a;
	static int b;
	public static void main(String[] args) { 
		b=20;
		BoxDemo1.b=30;
		BoxDemo1 b = new BoxDemo1() ;
		b.a=10;
		
		Box1 b1 = new Box1() ;
		b1.width=10;
		b1.height=20;
		b1.depth=30;
		
		Box1 b2 =new Box1();
		b2.width=20;
		b2.height=30;
		b2.depth=40;
		
		Box1 b3 = b2;
		System.out.println(b3==b2);
		System.out.printf("width : %d,height : %d,depth : %d%n",b1.width,b1.height,b1.depth);
		b1.change(b1);
		System.out.printf("width : %d,height : %d,depth : %d%n",b1.width,b1.height,b1.depth);
		

	
	}

}
