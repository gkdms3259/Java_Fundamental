package java_20190814;

import java.util.ArrayList;

import java_20190812.MemberDto;

public class NoticeDemo {
	public static void main(String[] args) {
		NoticeDao dao = NoticeDao.getInstance();
		
		boolean isSuccess = dao.insert(new NoticeDto(0,"작성자20","제목20","내용20",""));
		if(isSuccess) {
			System.out.println("공지사항이 추가 되었습니다.");
		}else {
			System.out.println("추가 오류");
		}
		isSuccess = dao.update(new NoticeDto(1,"작성자20-1","제목20-1","내용20-1",""));
		if(isSuccess) {
			System.out.println("공지사항이 수정 되었습니다.");
		}else {
			System.out.println("수정 오류");
		}
		isSuccess = dao.delete(1);
		if(isSuccess) {
			System.out.println("공지사항이 삭제 되었습니다.");
		}else {
			System.out.println("삭제 오류");
		}
	
        ArrayList<NoticeDto> list = dao.select();
		
	    for (NoticeDto n : list) {
	    
			System.out.printf("%d\t%s\t%s\t%s\t%s%n",
					n.getNum(),n.getWriter(),n.getTitle(),n.getContent(),n.getRegdate());
			
		}
		}
	}


