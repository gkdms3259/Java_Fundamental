package java_20190724;

public class Box {
   int width;
   int height;
   int depth;
   //final변수는 멤버변수  위치에서 초기화해야 함.
   //한번 정해니면 변경 불가
   //final변수명은 대문자로 하는것이 관례 but,소문자로 해도 한글로 해도 가능
   //final변수는 변수의 특성상 인스턴스 변수로 처리하지않고 static변수로 처리함.
   static final String NAME = "BOX";
   
   public void change(Box b) {   //change라는 변수?를 새로 하나 만들어서 depth를 3000으로 수정한것.
	   int a = 0;
	   String str = null;       //지역변수는 메서드내에서 매개변수를 포함한 사용자가 정의한 변수
	   double d = 0.0;          //default값 선언해줘야함. 지역변수(로컬변수)는 초기화를 해줘야함.
	                            //지역변수의 유효범위는 메서드 내에서만 사용 가능
	   int c = width +4;
	   System.out.println(width);
	   System.out.println(c); 
	   b.depth = 3000;
	
	
   }
}
