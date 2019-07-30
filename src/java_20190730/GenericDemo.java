package java_20190730;

import java.util.ArrayList;

public class GenericDemo { //객체의 안정성을 목적으로 사용
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //ArrayList는 종료하는 순간 데이터 날아감.
		list.add(1); //wrapper가 들어간것.
		list.add(2);
		list.add(3);
		//list.add("4"); 
		
		for(int i=0;i<list.size();i++) { //auto=boxing안하고 casting함
			Integer temp = list.get(i); //<Integer> => Generic을 선언하면 casting을 안해도 된다.
			System.out.println(temp);
		}
	
	}

}
