package homework2;

public class MemberFindDtoDemo {
	public static void main(String[] args) {
		//1.객체를 생성한다.
		MemberFindDto m1 = new MemberFindDto(1,"gkdms3259@naver.com","111","2019-08-01","2019-08-02");
		//2. 객체의 내용을 출력해 본다.
		System.out.println(m1.getSeq());
		System.out.println(m1.getEmail());
		System.out.println(m1.getCode());
		System.out.println(m1.getSdate());
		System.out.println(m1.getEdate());
		//3.객체의 내용을 수정해 본다.
		m1.setSeq(111);
		//4. 객체의 내용을 출력해 본다.
		System.out.println(m1.getSeq());
		//1,2,3,4
		MemberFindDto m2 = new MemberFindDto(2,"gkdms@naver.com","2222","2019-08-02","2019-08-03");
	}

}
