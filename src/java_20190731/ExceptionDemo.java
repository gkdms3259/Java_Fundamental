package java_20190731;

import java.util.ArrayList;

public class ExceptionDemo {
	public static void main(String[] args) {
		//NumberFormatException - 안에 문자들어가면 발생 ex)1111a
		int i = Integer.parseInt("1111");   
		System.out.println(i);
		
		//a[4] => ArrayIndexOutOfBoundsException
		int[] a = {1,2,3,4};
		System.out.println(a[3]);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		//list.get(2) => IndexOutOfBoundsException
		System.out.println(list.get(1));
		
		//str=null => NullPointerException
		String str = "";
		System.out.println(str.length());
		
		int b=0;
		int c=0;
		//분모가 0일때 => ArithmeticException / by zero 
		System.out.println(c/b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
