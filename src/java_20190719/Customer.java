package java_20190719;

public class Customer {
	public String name; //굳이 따지자면 여기부터 3개는 참조변수
	public String email;
	public String phone; //-를 뺀다고 숫자로 잡고 하면 010XXX...있으므로 8진수로 취급해버리므로 문자로 넣어야 함.
	public int age;     //여기부터 3개는 속성변수-8개(byte,short,int,long,char,float,double,boolean)
	public double balance;
	public boolean isReleased ;
	public static double interestRate; //static이 있으면 객체들이 이것을 참조(공유) 할 수 있음
                                //없으면(인스턴스변수로 잡아버리면) 변동 생길 때 하나하나 다 바꿔야됨.
    public static final String BANKNAME = "신한은행"; 
    //final변수는 인스턴스로 쓰는사람X //static을 빼면 인스턴스 변수가 되어버리므로 꼭 써줄것.
    //한번 선언해 놓으면 바꿀수 없다.//할당이 안됨. //변수명은 관례상 대문자로.//
    
    
}
