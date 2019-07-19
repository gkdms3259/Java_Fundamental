package java_20190719;

public class ArrayCopyDemo {
   public static void main(String[] args) {
	  String[] fruits = {"apple", "banana","watermelon","blueberry"};
	  
	  String[] temp = new String[6]; //String으로 하면 for문에서도 String으로! int면 int로!
      //fruits => 원본배열
	  //0 => 원본배열의 위치 즉, 원본배열의 어디서부터 복사할 위치
	  //temp => 카피할 배열 
	  //0 => 카피할 배열의 위피
	  //4 => 원본배열의 4개요소를 카피
	  System.arraycopy(fruits, 0, temp, 0, 4);
	  temp[4] = "peach";
	  temp[5] = "rasberry";
	  
	  for(String str : temp) {  //str은 temp집어넣을 변수명-변수명 임의로 정하고 출력할때도 같은 변수명
		  System.out.println(str);
	  }
}
}
