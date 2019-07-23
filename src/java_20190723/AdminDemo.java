package java_20190723;

public class AdminDemo {
    public static void main(String[] args) {
   Admin a = new Admin("syh1011","1234","syh@hbilab.org"); //new admin은 생성자를 호출해줌
   //Admin a = new Admin(); //이게 에러가 나는 이유는 디폴트
   //a.setId("syh1011");   //이런것을 편하게 하려고 나온게 생성자이다.(admin파일에 있음)
   //a.setPwd("1234");
   //a.setEmail("syh@hbilab.org");
   //a.setLevel(1);
   
   System.out.printf("%s,%s,%s,%d %n",a.getId(),a.getPwd(),a.getEmail(),a.getLevel());
}
}
