package java_20190717;

public class SwitchDemo {
    public static void main(String[] args) {
    	int month = Integer.parseInt(args[0]);
    	String season = null;
    	switch(month) {
    	//braek 가 없으면 수행을 안하기때문에 하나만 써도 된당.
    	//case에 있는 값은 unique해야 함.
    	case 12 : 
    	case 1 :  
    	case 2 : season = "겨울" ; break ;
    	case 3 :  
    	case 4 :  
    	case 5 : season = "봄" ; break ;
    	case 6 : 
    	case 7 : 
    	case 8 : season = "여름" ; break ;
    	case 9 : 
    	case 10 : 
    	case 11 : season = "가을" ; break ;
    	default : season = "없는 계절" ;
    	//마지막 문장은 break가 없어도 됨. 웬만하면 default는 마지막에!!
    	}
    	System.out.printf("%d월은  %s 입니다.",month ,season);
    	//%d는  10진수 숫자. %s는 문자.
    	
    	
    	}
    }

