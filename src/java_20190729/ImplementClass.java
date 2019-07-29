package java_20190729;

public class ImplementClass implements InterA {

	@Override //언어텐션(빼도 에러는 안남)
	public void mB() {
		// TODO Auto-generated method stub
		System.out.println("mB() 메서드");

	}

	@Override
	public void mC() {
		// TODO Auto-generated method stub
		System.out.println("mC() 메서드");

	}

	@Override //붙이면 부모가 있냐 물어보는것. 없으면 그 자체적안 매서드로 판단
	public void mA() {
		// TODO Auto-generated method stub
		System.out.println("mA()메서드");

	}

}
