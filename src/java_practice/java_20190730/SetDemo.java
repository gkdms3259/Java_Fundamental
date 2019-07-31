package java_practice.java_20190730;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		while(true) {
			int random = (int)(Math.random()*45)+1;
			set.add(random);
			if(set.size()==6) break;
		}
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			int temp = i.next();
			System.out.println(temp+"\t");
		}
	}

}
