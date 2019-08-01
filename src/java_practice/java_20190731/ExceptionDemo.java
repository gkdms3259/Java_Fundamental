package java_practice.java_20190731;

import java.util.ArrayList;

public class ExceptionDemo {
	public static void main(String[] args) {
		int i = Integer.parseInt("1111");
		System.out.println(i);
		
		int[] a = {1,2,3,4};
		System.out.println(a[3]);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list.get(1));
		
		String str = "";
		System.out.println(str.length());
		
		int b = 0;
		int c = 0;
		System.out.println(b/c);
	}

}
