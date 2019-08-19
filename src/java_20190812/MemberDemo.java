package java_20190812;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = MemberDao.getInstance();
		/*MemberDto m1 = new MemberDto(22,"트럼프1","미국1");
		boolean isSuccess = mdao.insert(m1);
		if(isSuccess) {
			System.out.println("삽입 성공");
		}else {
			System.out.println("삽입 실패");
		}
		
		m1 = new MemberDto(22,"트럼프2","미국2");
		isSuccess = mdao.update(m1);
		if(isSuccess) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
	    isSuccess = mdao.delete(20);
	    if(isSuccess) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		*/
		
		ArrayList<MemberDto> list = mdao.select();
		
	    for (MemberDto m : list) {
	    	/*
	    	int num = m.getNum();
	    	String name = m.getName();
	    	String addr = m.getAddr();
	    	System.out.printf("%d\t%s\t%s%n",num,name,addr);
	    	*/     
	    	//이렇게 해도 되고 아니면 한번에 아래처럼 해도 된다. (쉬운대로 선택하기)
			System.out.printf("%d\t%s\t%s%n",m.getNum(),m.getName(),m.getAddr());
			
		}
		
	}

}
