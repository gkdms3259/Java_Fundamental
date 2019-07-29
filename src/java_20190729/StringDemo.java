package java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String ssn = "111111-1111118";
		char c = ssn.charAt(6); //특정문자를 추출할 때 사용. //0부터 세서 6이면 결과값이 -이다.
		System.out.println(c);
		
		ssn = ssn.concat("abcd");
		System.out.println(ssn);
		
		String fileName = "abd.asd.asd.sad.dddddd.doc";
		if(fileName.endsWith("zip")) {                  //많이 사용함.
			System.out.println("압축파일 입니다.");
		}else if(fileName.endsWith("doc")) {
			System.out.println("워드 문서 입니다.");
		}else {
			System.out.println("파일 입니다.");
		}
		
	    System.out.println(fileName.equalsIgnoreCase("ABD.DOc")); //대소문자 구별X
		
	    int index = ssn.indexOf("-");
	    System.out.println(index);
		
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf(".")); //중요
		
		//111111-1111118
		//String first = ssn.substring(0,6); //0부터 포함 6 이전까지만 포함.(6 불포함)
		//String second = ssn.substring(7);  //하나만 주어지면 그것부터 이후 값 모두 다 가져옴.(7부터)
		String first = ssn.substring(0,ssn.indexOf("-")); //문자열을 기준으로 왼쪽 오른쪽 나눔
		String second = ssn.substring(ssn.indexOf("-")+1);  //7부터
		System.out.println(first);
		System.out.println(second);
		
		String first2 = fileName.substring(0,fileName.lastIndexOf(".")); //문자열을 기준으로 왼쪽 오른쪽 나눔
		String second2 = fileName.substring(fileName.lastIndexOf(".")+1);  
		System.out.println(first2);
		System.out.println(second2);
		
		
		
		
	}

}
