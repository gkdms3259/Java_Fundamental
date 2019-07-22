package java_20190722;

public class OverloadingDemo {
	//OverloadingDemo 클래스에서는 print()메서드가 4가지로 오버로딩 됨
	//Overloading의 작성규칙
	//1. 같은 클래스 내
	//2. 메서드 이름은 같아야 한다. (중요)
	//3. 매개변수 갯수가 같으면 자료형이 달라야 한다.
	//4. 매개변수 갯수가 달라야 한다.
	//5. 반환형과 접근한정자는 같아도 되고 달라도 됨.
   public void print(String str) {  //중첩되게 쓰지말것!! String을 출력한다. => str로 다르게
	System.out.print(str);
   }
   
   public void print(int i) {
	   System.out.print(i);
   }
   
   public void print(double d) {
	   System.out.print(d);
   }
   
   public void print(boolean b) {
	   System.out.print(b);
   }
   
   public static void main(String[] args) {
	   OverloadingDemo o1 = new OverloadingDemo();
	   o1.print(true);
	   o1.print("test");
	   o1.print(23+24);
	   o1.print(43.256);
	   
   }
  
}
