package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//Dao(Data Access Object)
public class MemberDao {
	/*
	 * static { try { Class.forName("org.mariadb.jdbc.Driver"); //여기에 넣으면 아주 굳. }
	 * catch (ClassNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
	// 1.singleton 코딩
	private static MemberDao single;

	private MemberDao() { // 여기에 넣어도 괜춘.but, 개념은 있구나 정도.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static MemberDao getInstance() {
		if (single == null) {
			single = new MemberDao();
		}
	
		return single;
	}

	// Dto : Data Transfer Object
	public boolean insert(MemberDto m) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;  //만약에 0으로 잡으면 밑에 인덱스는 ++index로 세개 다 써주면 된다.

		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic?user=kic12&password=kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("insert into member(num, name, addr ) " );
			sql.append("values(?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(index++, m.getNum());  //index++ 집어넣고 증가시킨다. 
			pstmt.setString(index++, m.getName());
			pstmt.setString(index, m.getAddr()); //그래서 마지막은 증가된 값이기때문에 넣으면 된다.
			
			pstmt.executeUpdate();
			isSuccess =  true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
		return isSuccess;
	}
}
