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
		//charAt(int index) : 문자열 중에서 특정 index에 있는 문자를 반환한다.
		//시작 index는 0부터 시작
		char c = ssn.charAt(6); //특정문자를 추출할 때 사용. //0부터 세서 6이면 결과값이 -이다.
		System.out.println(c);
		
		//concat(String msg) : 문자열 연결
		ssn = ssn.concat("abcd");
		System.out.println(ssn);
		
		String fileName = "abd.asd.asd.sad.dddddd.doc";
		
		//endsWith(String msg) msg문자열로 끝나면 true, or false
		if(fileName.endsWith("zip")) {                  //많이 사용함.
			System.out.println("압축파일 입니다.");
		}else if(fileName.endsWith("doc")) {
			System.out.println("워드 문서 입니다.");
		}else {
			System.out.println("파일 입니다.");
		}
		
        //equalsIgnoreCase(String msg) : 대소문자를 구분하지 않고 문자열을 비교하여 같으면 true, or false		
	    System.out.println(fileName.equalsIgnoreCase("ABD.DOc")); //대소문자 구별X
		
	    //indexOf(String msg) : msg문자열 위치를 반환한다.
	    //msg문자열을 찾을 때 처음시작은 0부터
	    
	    //lastIndexOf(String msg) : msg문자열 위치를 반환한다.
	    //msg문자열을 찾을 때 끝에서 찾고 index는 처음(0)부터 시작
	    int index = ssn.indexOf("-");
	    System.out.println(index);
		
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf(".")); //중요
		
		//111111-1111118
		//substring(int first, int second) //first(포함)부터 second(포함X)사이의 문자열을 추출
		//substring(int first) //first(포함)부터 이후 모든 문자열을 추출
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
		
		String html = "안녕하세요\n저는 성영한 입니다.\n잘 부탁드립니다.";
		//replaceAll(String first,String second)
		//first 문자열을 second 문자열로 대체한다.
		html = html.replaceAll("\n","<br>");  //html에서는 \n이 개행이 아니라 <br>이 개행이므로 바꿔준다.
		System.out.println(html);
		
		String url = "http://www.naver.com";
		String path = "/news/sdsdf.do?id=asd&asd=122";
		//startsWith(String msg) msg문자열로 시작하면 true, or false
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		String m1 = "hello";
		String m2 = "hello "; //m1은 length가 5, m2는 공백때문에 6이 나온다.
		
		System.out.println(m1);
		System.out.println(m2);
		
		//trim() 빈공백 없애는 것
		if(m1.equals(m2.trim())) {      
			System.out.println("true");
		}else { 
			System.out.println("false");
		}
		//toUppercase() 대문자로 변환
		m1 = m1.toUpperCase();
		System.out.println(m1);
		
		//toLowerCase() 소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1);
		
		//Steing.valueOf() : primitive data type을 문자열로 변환한다.
		int a = 10;
		String str = String.valueOf(a);
		
		char[] c1 = {'a','b','c'};
		String str1 = String.valueOf(c1);
		System.out.println(str1);
		
		//ssn : 111111-1111118
		//split(String delimiter) : 문자열을 구분자(delimiter)로 토큰(token)화 시키는 메서드
		String[] strArray = ssn.split("-"); //기준으로 나눈다
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		
		String str2 = String.format("%,.2f",1234.12512);
		System.out.println(str2);
		
		str2 = String.format("%,d",1000000);
		System.out.println(str2);
		
		
		
		
		
		
	}
	}


