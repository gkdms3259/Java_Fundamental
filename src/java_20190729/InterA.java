package java_20190729;
//생성할때 클래스가 아니라 인터페이스로 지정하고 생성하기.
public interface InterA extends InterB, InterC{   //상속 interB,interC)
	  //인터페이스의 변수 double 앞에 public static final이 생략되어 있음.
      double PI = 3.14; 
      //인터페이스 메서드의 접근 한정자를 붙이지 않으면 public이 생략되어 있음.
      //abstract 생략 가능
      void mA();  //void앞에 public abstract생략이 되어있음. 
      //생략은 가능 but,다 써준다. overriding할때 주의.default가 아닌 public이다.
      
}
