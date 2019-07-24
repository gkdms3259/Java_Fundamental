package java_20190724;

public class BoxDemo {
    
	int a;
	static int b ;
     //Box.NAME= "BOX2";  //final로 해놔서 바꿀수가 없다.
	
	public static void main(String[] args) {
		
        b=20;
        BoxDemo.b = 30; //그냥 가져와서 고대로 쓰는것보다 이렇게 쓰는게 더 나음.
 		
		BoxDemo b = new BoxDemo();  //a를 쓰고싶으면 객체생성해서 위로 올리면 됨(a를 참조하게 만들면 됨.)
        b.a =10;                    //a는 인스턴스 변수라  static에서 호출X
	
	   Box b1 = new Box();
       b1.width = 10;
       b1.height = 20;
       b1.depth = 30;
       
       Box b2 = new Box();
       b2.width = 10;
       b2.height = 20;
       b2.depth = 30;
       
       Box b3 = b2;
       System.out.println(b3 == b2);   //reference비교일때는 b1과 b2가 같은 오브젝트를 참조하면 true,아니면 false
       
       System.out.printf("width : %d, height : %d , depth : %d%n",b1.width,b1.height,b1.depth);

       b1.change(b1);   //call by reference
                        //Box b = b1이 생략됐다고 보는게 더 편함. => b1이 가리키는곳을  b도 가리켜라.
       System.out.printf("width : %d, height : %d , depth : %d%n",b1.width,b1.height,b1.depth);
       
       
} 
}
