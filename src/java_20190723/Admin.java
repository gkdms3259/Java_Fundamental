package java_20190723;

public class Admin {
   private String id;   //instance변수는 private을 쓰는것을 습관처럼 하라.
   private String pwd;
   private String email;
   private int level;
   
   //디폴트 생성자(default constructor) => alt + shift + s => c
    public Admin() { 
	   super();//부모 클래스의 디폴트 생성자를 호출
	   
   }
   
   //생성자(constructor)
   //생성자는 반환값이 없고, 이름은 클래스 이름과 동일하게
   //역할= 인스턴스 변수 초기화(값을 처음으로 할당)
   //alt + shift + s => o
   public Admin(String id, String pwd, String email, int level) {
	   this.id = id;       // this의 역할
	   this.pwd = pwd;    //자기자신 객체 => this.
	   this.email = email;//다른생성자 호출 => this(~~) 생성자에게만 사용 가능
	   this.level = level;
   }
   public Admin(String id, String pwd, String email) { //level을 빼고 호출하고 싶을때
	   //this.id = id;                                 //이렇게도 쓸수있지만 이건 하수!
	   //this.pwd = pwd;                                
   	   //this.email = email;                              
	   this(id,pwd,email,0); //다른 생성자 호출
   }
   //instance변수의 setter, getter 생성방법
   //alt + shift + s => r
   public void setId(String id) {
	   this.id=id;
   }
   public String getId() {
	   return id;
   }
   public void setPwd(String pwd) {
	   this.pwd =pwd;
   }
   public String getPwd() {
	   return pwd;
   }
   public void setEmail(String email) {
	   this.email =email;
   }
   public String getEmail() {
	   return email;
   }
   public void setLevel(int level) {
	   this.level = level;
   }
   public int getLevel() {
	   return level;
   }
   
}
