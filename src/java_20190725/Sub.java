package java_20190725;

public class Sub extends Super{
	String chicken;
	public void gotoSchool() {
		System.out.println("Sub gotoSchool");
	}      
	//over riding : 부모의 메서드를 재정의
	//1. 반환형, 메서드 이름, 매개변수 일치
	//2. 접근한정자는 부모보다 자식이 상위이거나 같으면 됨.
    
	public void play(String starcraft) {
	    super.play("omok"); //부모의 기능과 재정의해서 쓸때
		System.out.println("Sub play()");
	}

}
