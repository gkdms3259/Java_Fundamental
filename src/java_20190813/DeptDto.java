package java_20190813;

public class DeptDto {
	private int no; //Dept sql에 적혀있으니깐 굳이 dept를 써주지않아도 된다.Deptno => no
	private String name;
	private String loc;
	public DeptDto(int no,String name, String loc) {
		super();
		this.no = no;
		this.name =name;
		this.loc =loc;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
