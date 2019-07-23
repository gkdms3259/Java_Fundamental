package java_20190723;

public class VarArgDemo {
   //public VarArgDemo() {} //디폴트 작성자를 초기화해줌. 
   public long sum(int... temp){ //temp변수는 여기서 배열취급을 받는당
       long sum = 0; //지역변수 , 메서드내에서 유효함.(지역변수는 초기값을 자동으로 만들어주지 않는다.)
                                             //초기화=값을 처음으로 할당하는 것(프로그램에서) 	   
       for(int t : temp) { //여기서 temp를 배열로 처리
    	   sum += t;
       }
       return sum;
   }
   public static void main(String[] args) {
	 VarArgDemo v1 = new VarArgDemo();
	 
	 long s1 = v1.sum(1,2);
	 System.out.println(s1);
	 long s2 = v1.sum(1,2,3,4);
	 System.out.println(s2);

   } 
   
}
