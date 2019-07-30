package java_20190730;

public class Member {
	private String id;
	private String name;
	public Member(String id, String name) { //alt + shift + s + o
		super();
		this.id = id;
		this.name = name;
	} //alt + shift + s + r
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override  //alt + shift + s + s
	public String toString() {
		return "아이디 : " + id + ", 이름 : " + name ;
	}
	
 
}
