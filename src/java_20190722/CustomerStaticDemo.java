package java_20190722;
import java_20190719.Customer;//Customer자료가 없어서 다른파일에서 불러올 때 씀.import
                              //default면 값을 가져올 수 없어서 Customer파일에 public을 말도 안되지만 붙여줌.
public class CustomerStaticDemo {
	public static void main(String[] args) {
		//static변수는 class이름으로 접근하는 것이 더 좋다.
		//제일 위에 나타내 주는게 더 좋다. 
		//Customer파일에서 static으로 잡아줌. 이자율을 계속 바꾸긴 힘드니깐 
		//클래스명.interestRate를 해주면 이자율을 객체들이 참조(공유)할 수 있음
		
  		Customer.interestRate = 3.5; 
		
        Customer c1= new Customer();
        c1.name = "홍길동";
        c1.age = 40;
        c1.email = "kdhong@test.com";
        c1.phone = "010-8080-0987";
        c1.balance = 190000.43;
        c1.isReleased = false;
        //final 변수는 재할당 할 수 없음.     
        //Customer.BANKNAME = "신한은행"; //이것도 재할당이므로 오류가 남.
        //static 변수는 클래스 이름으로 접근하는 것이 관례이지만 reference로도 접근이 가능하다(권장하지않음)
        //c1.interestRate = 3.5; 
        
        Customer c2= new Customer();
        c2.name = "아무개";
        c2.age = 50;
        c2.email = "noname@test.com";
        c2.phone = "010-2345-9876";
        c2.balance = 3500000.45;
        c2.isReleased = false;
        
        System.out.println(Customer.interestRate) ; //출력도 클래스이름으로 
        
        Customer c3= new Customer();
        c3.name = "배조스";
        c3.age = 62;
        c3.email = "jaws@amazon.com";
        c3.phone = "010-1111-1111";
        c3.balance = 12000000000.45;
        c3.isReleased = true;
        
        System.out.println(Customer.interestRate);
        
	}
}
