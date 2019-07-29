package java_20190729;

import java.util.ArrayList; //ctrl + shift + o(영문) 단축키

public class WrapperDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //array는 크기를 한번 정하면 크기가 변하지 않지만  arraylist는 크기가 변할 수 있다.
		//자바 1.4이전 버전에서는 primitive data type을 Collection에 저장 할 수 없었기 때문에
		//primitive data type을 객체와 할 수 있는 Wrapper으로 변환하여 저장해야 한다.
		//아래와 같이 1을 add할 수 없음.
		//list.add(1);
		list.add(new Integer(1)); //1이라는 primitive를 담을수 없어서 객체로 만들어서 넣어준다.
		
		//1.primitive data type => wrapper class(생성자 이용 -> new Integer(10))
		Integer i2 = new Integer(10); //auto-boxing
		Integer i3 = new Integer(20);
		
		//2.string => wrapper class(Integer.valueOf("10"))
		String s1 = "10"; //문자열을 wrapper class로 변환하는 경우
		String s2 = "20";
		Integer i1 = Integer.valueOf(s1);
		
		//3.wrapper class => primitive data type (xxx.intValue()) xxx는 double or int
		//i2와 i3를 더하고싶을때 레퍼런스이기때문에 primitive로 바꿔서 더해준다.
		int temp = i2.intValue() + i3.intValue(); //auto-unboxing
		
//제일 사용 多 //4.String => primitive data type(Integer.parseInt("10")) 
		temp = Integer.parseInt(s1) + Integer.parseInt(s2); //문자열(string)을 primitive로 바꾸는 방법
		
		//5.primitive data type => String(+"")
		int a1 = 10;
		String s3 = String.valueOf(a1);
		
		//auto-boxing : primtive data type 자동으로 wrapper
		Integer i4 = 10;
		
		//auto-unboxing : wrapper 자동으로 primitive data type
		int a2 = i2 + i3;
		
	    System.out.println(i2);
	    System.out.println(i2.equals(i3));
		
	    String s4 = "12.34";
	    double d1 = Double.parseDouble(s4);
	    System.out.println(d1);
	}

}
