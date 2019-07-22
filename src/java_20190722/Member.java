package java_20190722;

public class Member {
    private String name;
    private String zipcode;
    private String addr1;
    private String addr2;
    private String ssn1;
    private String ssn2;
    private int age;
    private String regdate;
 
    //name => setter, getter 메서드
    //name에 대한 getter메서드 => 인스턴스 name정보를 가져올 수 있는 메서드
    public String getName() {  
    	return name;
    }
    //name에 대한 setter메서드 => 인스턴스 name정보를 변경할 수 있는 메서드
    public void setName(String name) { //name과 name 이름이 같으니깐 구별하기위해 앞에 this.을 붙여줌.
           this.name = name;
    }
    public String getZipcode() {
    	return zipcode;
    }
    public void setZipcode(String zipcode) {
    	this.zipcode = zipcode;
    }
    public String getAddr1() {
    	return addr1;
    }
    public void setAddr1(String addr1) {
    	this.addr1 = addr1;
    }
    public String getAddr2() {
    	return addr2;
    }
    public void setAddr2(String addr2) {
    	this.addr2 = addr2;
    }
    public String getSsn1() {
    	return ssn1;
    }
    public void setSsn1(String ssn1) {
    	this.ssn1 =ssn1;
    }
    public String getSsn2() {
    	return ssn2;
    }
    public void setSsn2(String ssn2) {
    	this.ssn2 = ssn2;
    }
    public int getAge() {
    	return age;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public String getRegdate() {
    	return regdate;
    }
    public void setRegdate(String regdate) {
    	this.regdate =regdate;
    }

    
}




