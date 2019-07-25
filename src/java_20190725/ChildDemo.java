package java_20190725;

public class ChildDemo {
	//static {
	//    System.out.println("ChildDemo static 초기화"); 
	//}
	public static void main(String[] args) {  //얘가 없으면 아무것도 출력되지 않음.
		System.out.println("Main");           //Main이 있어야 메모리 로딩을 할 수 있다
		Child c = new Child(); //메모리 올리는 작업. 이 객체 생성을 안하면 Main만 찍히게 된다.
	}
	
}
//Parent,Child,ChildDemo 세개 보면서
//실행을 시켰을때 왜 이런 순서로 나오는가를 이해해야함.