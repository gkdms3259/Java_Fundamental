package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		//1.드라이브 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2.Connection 객체 생성
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic?autoReconnect=true", "kic12", "kic12");
			
			StringBuffer sql = new StringBuffer();
			//sql.append("delete from member where num = ?"); //칼럼에 대응대는 부분에 값을 바로 넣지말고 반드시 물음표로 넣어라
			sql.append("delete from member "); //반드시 member 다음에 한칸 띄워주기. //위에것이랑 같은것.
			sql.append("where num = ?");
		
		//3.PreparedStatement 객체 생성
		pstmt = con.prepareStatement(sql.toString());
	    //3-1 바인딩 변수가 있다면 바인딩 변수 설정.
		pstmt.setInt(1,11);
		//4.executeUpdate() 메서드로 SQL(insert, update, delete)문 
		int resultCount = pstmt.executeUpdate();
		System.out.println("삭제된 행의 수 : "+resultCount);
		
       } catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();  //열어놓은것의 역순으로 닫아주면 된다.
 				if(con != null) con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	}
