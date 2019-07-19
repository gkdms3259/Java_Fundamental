package java_20190719;

public class CustomerDemo {
	public static void main(String[] args) {
		// Customer 객체 생성
		// Customer => Object type
		// c1 => reference
		// new Customer() => Object
		Customer c1 = new Customer();
		c1.name = "성영한";
		c1.age = 30;
		c1.email = "syh@hbilab.org";
		c1.phone = "010-3204-1703";
		c1.balance = 23000000000.23;
		c1.isReleased = false;

		System.out.printf("%s,%d,%s,%s,%.2f,%s%n",c1.name,c1.age, //개행하고싶을시 마지막에 
				c1.email,c1.phone,c1.balance,c1.isReleased);      //%n써주면 보기 더 편함.    
		
		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.age = 60;
		c2.email ="ced@softbank.com";
		c2.phone = "010-9999-0000";
		c2.balance = 45000000000.24;
		c2.isReleased = true;
		
		Customer c3 = c2; //c2가 가리키는 클래스에 c3도 가리키는데
		c3.age=20; //c3의 age값을 20으로 정하게 되면서 같이 참조하고 있던 
		           //클래스의 age가 20으로 변경되면서 c2.age를 출력할 때 20이 나오게 된다. 
		
		System.out.printf("%s,%d,%s,%s,$%,.2"
				+ "f,%s",c2.name,c2.age, //%,.2f면 ,표시도 함께
				c2.email,c2.phone,c2.balance,c2.isReleased);
		
	}
}
