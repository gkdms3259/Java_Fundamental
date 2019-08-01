package java_20190730;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagementDemo {
	private ArrayList<Member> list;

	public MemberManagementDemo() {
		list = new ArrayList<Member>();
	}

	public void print() {
		System.out.println("***************************************************");
		System.out.println("* 1. insert 2. update 3. delete 4. search 5. exit *");
		System.out.println("***************************************************");
	}

	public String console(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	private void run(String selectedIndex) {
		// TODO Auto-generated method stub
		if (selectedIndex.equals("1")) {
			insert();
		} else if (selectedIndex.equals("2")) {
			update();
		} else if (selectedIndex.equals("3")) {
			delete();
		} else if (selectedIndex.equals("4")) {
			search();
		} else if (selectedIndex.equals("5")) {
			System.out.println("THE END..");
		} else {
			System.err.println("!!warning!!");
			print();
			String index = console("번호를 선택하세요:");
			run(index);
		}
	}
	
	
	
    //1.검색할 아이디를 입력 받는다.
	//2.ArrayList에 Member 객첵에 검색할 아이디를 찾아서 있으면 출력하고
	//  없으면 "검색된 결과가 없습니다." 메세지 출력
	// 3.ArrayList에 있는 모든 고객을 출력한다.
    // 4.print() 호출
    // 5.번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	private void search() {
		// TODO Auto-generated method stub
		
		String searchId = console("검색할 아이디 :");
		System.out.println("********검색결과*********");
		boolean isExisted = false;
		
		for(Member member : list) {
			if(searchId.equals(member.getId())) {
				System.out.println(member);
				isExisted = true;
				break;
			}
		}
		if(!isExisted) {
			System.out.println("검색된 결과가 없습니다.");
		}
		System.out.println("********검색결과*********");
		
		common();                              //아래 있는것의 압축된? 것이라고 볼 수 있다.
		/*
		 * for (Member member : list) {        //자주 반복되는 것은 드래그하고 우측키 눌러서 refactor 누른 후 
			System.out.println(member);        //extract method누르고 이름 지정해주면 위에처럼 간단하게 바뀐다.
		    }
		    print();

		    String index = console("번호를 선택하세요:");
		    run(index);
		*/
	}

	
	
	// 1.삭제할 아이디를 입력받는다.
	// 2.ArrayList의 Memeber 객체중에서 삭제할 아이디를 찾아 있으면 삭제하고
	// 없으면 "삭제할 아이디가 없습니다." 메세지 출력
	// 3.ArrayList에 있는 모든 고객을 출력한다.
	// 4.print() 호출
	// 5.번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	private void delete() {
		// TODO Auto-generated method stub
		String deleteId = console("삭제할 아이디 :");
		boolean isExisted = false;

		for (Member member : list) {
			if (deleteId.equals(member.getId())) {
				isExisted = true;
				list.remove(member); // 아래 방법으로 사용할 때는 이거 지워주기
				break;
			}
		}
		if (!isExisted) { // 아래 방법으로 사용할 때는 이것들 지워주기
			System.out.println("삭제할 아이디가 없습니다.");
		}
		common();
	}

	
	
	
	// 1.수정할 아이디를 입력받는다.
	// 2.ArrayList에 닜는 고객정보 중에서 수정할 아이디를 찾아서 있으면
	// 수정할 이름을 입력받고, ArrayList에서 수정하고, 없으면 "수정할 아이디가 없습니다." 메세지 출력
	// 3.ArrayList에 있는 모든 고객을 출력한다.
	// 4.print() 메서드 호출 (번호 선택할 수 있게끔)
	// 5.번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	private void update() {
		// TODO Auto-generated method stub
		String updateId = console("수정할 아이디>");
		boolean isExisted = false;

		for (Member member : list) {
			if (updateId.equals(member.getId())) {
				isExisted = true;
				break;
			}
		}
		if (isExisted) {
			String updateName = console("수정할 이름 :");
			for (Member member : list) {
				if (updateId.equals(member.getId())) {
					member.setName(updateName);
					break;
				}
			}
		} else {
			System.out.println("수정할 아이디가 없습니다.");
		}
		common();
	}

	
	
	
	// 1.아이디를 입력 받는다.
	// 2.이름을 입력 받는다.
	// 3.ArrayList에 고객을 추가한다.
	// 4.ArrayList에 있는 고객을 모두 출력한다.
	// 5.print() 메서드를 호출한다.
	// 6.번호를 선책하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	private void insert() {
		// TODO Auto-generated method stub
		String id = console("아이디:");
		String name = console("이름:");

		Member m = new Member(id, name);
		list.add(m);

		common();

	}

	private void common() {
		for (Member member : list) {
			System.out.println(member);
		}
		print();

		String index = console("번호를 선택하세요:");
		run(index);
	}

	public static void main(String[] args) {
		MemberManagementDemo m1 = new MemberManagementDemo();
		m1.print();
		String selectedIndex = m1.console("번호를 선택하세요>");
		m1.run(selectedIndex);

	}

}
