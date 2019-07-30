package java_20190730;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//자동 import : ctrl + shift + o(영문)
		//HashSet은 데이터(객체)의 중복을 허용하지 않고, 순서가 없음
		//HashSet set =new HashSet();
		//TreeSet은 데이터(객체)의 중복을 허용하지 않고, 오름차순 정렬한다.
		TreeSet<Integer> set = new TreeSet<Integer>();
 
		while(true) {
			int random = (int)(Math.random()*45)+1;
			//할당, auto-boxing(primitive data type => wrapper)
			set.add(random);  //set.add(Integer.valueOf(random));와 동일. int temp대신 Integer temp로 써야함
			//HashSet크기 : size()     //Integer는 overriding을 해줌.
			if(set.size()==6) break;
	}
		 //HashSet의 출력은 Iterator로 변경을 해서 출력해야 한다.
	     Iterator<Integer> i = set.iterator();
	     while(i.hasNext()) {          //hasNext() HashSet에 출력할 객체가 존재하는 판단하는 메서드
		 //auto-unboxing "wrapper => primitive data type
	     int temp = i.next(); //next() 해당 객체를 가져온다.
		 System.out.println(temp+"\t");
	   }
	}

}
