package java_20190722;

public class MemberDemo {
    public static void main(String[] args) {
		Member m = new Member();
		//m.name = "";
		m.setName("성영한");
		//System.out.println(m.name);
		m.setZipcode("12345");
		m.setAddr1("서울");
		m.setAddr2("용산구");
		m.setSsn1("111111");
		m.setSsn2("1111118");
		m.setAge(30);
		m.setRegdate("2019-07-22");
		System.out.println(m.getName());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getSsn1());
		System.out.println(m.getSsn2());
		System.out.println(m.getAge());
		System.out.println(m.getRegdate());
	
	}
}
