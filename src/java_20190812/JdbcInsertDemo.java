package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	public static void main(String[] args) {
		try {                                         //jdbc 추가한후 있는지 build path하기.
			Class.forName("org.mariadb.jdbc.Driver"); //패키지명과 클래스명이 맞는지 확인 한번 해보기.(refernece liberaries에서)
		    System.out.println("Driver Load Success");
		} catch (ClassNotFoundException e) {
            System.out.println("Driver Load Fail..");			
		} 
		Connection con = null;
		PreparedStatement pstmt = null;	
		try {
			//DriverManager.getConnection(url,사용자,비밀번호) url에서 3306은 앞에 mysql있어서 써도 되고 안써도 됨.
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kic?autoReconnect=true","kic12","kic12"); 
			System.out.println("Connection success");
			StringBuffer sql = new StringBuffer();
			sql.append("insert into member(num, name, addr) ");
			sql.append("values(?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString()); //PreparedStatement가 String이라서 sql.toString()해야하는것.
			pstmt.setInt(1, 12);
			pstmt.setString(2, "주커버그");
			pstmt.setString(3, "이스라엘");
			//sql문 전송
			//executeUpdate() => insert, update, delete문일 때 사용
			//반환값은 갱신된 행의 수를 반환한다.
			int resultCount  = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : "+resultCount);		
			

		} catch (SQLException e) {
			
		}
	}

}
