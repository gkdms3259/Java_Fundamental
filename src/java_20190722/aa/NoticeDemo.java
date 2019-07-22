package java_20190722.aa;

public class NoticeDemo {
    public static void main(String[] args) {
		Notice n1 = new Notice(); //객체생성  
		//public은 서로 다른 패키지도 접근가능
		n1.number = 1;  
		//protected는 서로 다른 패키지이면서 상속받은 경우에는 접근가능
		n1.title = "공지사항입니다."; 
		//default는 같은 패키지 내에서만 접근가능
		n1.hit = 0; 
		//private은 같은 클래스 내에서만 접근가능
		//n1.regdate = "2019"; <- 오류
    
    }
}
