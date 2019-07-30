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
		if(selectedIndex.equals("1")) {
			insert();
		}else if(selectedIndex.equals("2")) {
			System.out.println("update.....");
		}else if(selectedIndex.equals("3")) {
			System.out.println("delete.....");
		}else if(selectedIndex.equals("4")) {
			System.out.println("search.....");
		}else if(selectedIndex.equals("5")) {
			System.out.println("exit.....");
		}else {
			System.out.println("warning.....");
		    print();
		    String index = console("번호를 선택하세요>");
			run(index);
		}
		}
	//1.아이디를 입력 받는다.
	//2.이름을 입력 받는다.
	//3.ArrayList에 고객을 추가한다.
	//4.ArrayList에 있는 고객을 모두 출력한다.
	//5.print() 메서드를 호출한다.
	//6.번호를 선책하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	private void insert() {
		// TODO Auto-generated method stub
		String id = console("아이디:");
		String name = console("이름:");
       
		Member m = new Member(id,name);
        list.add(m);
        
        for(Member member : list ) {
        System.out.println(member);
        }
        print();
        
        String index = console("번호를 선택하세요>");
        run(index);
	
	}
	public static void main(String[] args) {
		MemberManagementDemo m1 = new MemberManagementDemo();
		m1.print();
		String selectedIndex = m1.console("번호를 선택하세요>");
		m1.run(selectedIndex);
		
		
		
		
		
	}
	
	
}
