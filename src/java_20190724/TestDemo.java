package java_20190724;         //Test클래스를 import해서 사용하기 위해서는 Test클래스의 접근한정자는 public이어야한다.
import java_20190724.aa.Test;  //Test클래스와 다른 패키지인데 public이 아니고 default라서 아예 import도 소환도 할수 없음
public class TestDemo {        //Test클래스에 public을 붙여주니깐 다 해결됨
   public static void main(String[] args) {
	Test t = new Test();       //Test클래스에 접근한정자Test();도 public이어야 새로운 객체를 생성할 수 있다.
    
   }
}
