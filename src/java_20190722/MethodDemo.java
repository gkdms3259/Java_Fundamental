package java_20190722;

public class MethodDemo {
	//5~8라인까지 메서드를 정의
	//boolean 메서드의 반환값
    //instance 메서드	
	//int year => 매개변수(parameter)
    public boolean isLeafYear(int year) {
        //메서드의 반환값이 boolean이기 때문에 return value의 value고 boolean이어야 한다.
    	return year%4 == 0 && year%100 != 0 || year%400 == 0;
    }
    //String msg, int index => 매개변수(parameter)
     public char charofString(String msg,int index) {
    	 //String msg = "Hello";
    	 return msg.charAt(index);
     }
     public long plus(int first, int second) { //int를 long으로 바꿔도되지만
    	return  (long)first + (long)second;    //long으로 casting하는게 나음.더한 값이 커질수도 있기 때문.
     }
     
     //나누기
     public double divide(int first, int second) {  //int로 해놨어도 소수점이 표현되어야기 때문에
    	 return (double)first / (double)second ;    //double로 반환해야함.
     } 
     //오름차순
     public void ascending(int[] array) { //void는 반환값이 없다라는 뜻
    	 for (int j = 0; j < array.length; j++) {
				for (int i = 0; i < array.length - (j + 1); i++) {
					if (array[i] > array[i + 1]) { // 배열 오름차순으로 정렬시키기
						int temp = array[i];
						array[i] = array[i + 1];
						array[i + 1] = temp;
					}
				}
			}
    	 
     }

     public static void main(String[] args) {
    	 
		MethodDemo m1 = new MethodDemo();
		//인스턴스 메서드의 사용법
		//반드시 객체 생성한 후에 reference(m1)을 이용해서 호출하면 됨
		//2019 => 전달인자(argument)
		boolean isLeafYear = m1.isLeafYear(2019); //안에 숫자값 바꿔주면 윤년인지 아닌지 나옴
		System.out.println(isLeafYear);
        //위에것을 간단하게 한줄로 표현하면 이렇게.!!	
        System.out.println(new MethodDemo().isLeafYear(2019)); //객체생성,매개변수    
        
        //"Hello",0 => 전달인자(argument)
        char c = m1.charofString("Hello",0); //Hello 글자의 0번째 글자
        System.out.println(c);
        
        long sum = m1.plus(2100000000,2100000000);
        System.out.println(sum);
        
        double div = m1.divide(5,0);
        System.out.println(div);
        
        int[] temp = {1,2,3,4,5,41,6,25,11};
       
        for(int a : temp) {  //temp를 출력할 임의의 변수명 a
        	System.out.print(a+"\t");
        }
        System.out.println();  //이거는 오름차순 안하고 결과 출력
        
        m1.ascending(temp);    //오름차순 진행
        
        for(int a : temp) {
        	System.out.print(a+"\t");
        }
        System.out.println();  //이거는 오름차순 하고 결과 출력
     }
}
