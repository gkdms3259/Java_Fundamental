package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
		int index = 1; // 만약에 0으로 잡으면 밑에 인덱스는 ++index로 세개 다 써주면 된다.

		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic?user=kic12&password=kic12");

			StringBuffer sql = new StringBuffer();
			sql.append("insert into member(num, name, addr ) ");
			sql.append("values(?,?,?)");

			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(index++, m.getNum()); // index++ 집어넣고 증가시킨다.
			pstmt.setString(index++, m.getName());
			pstmt.setString(index, m.getAddr()); // 그래서 마지막은 증가된 값이기때문에 넣으면 된다.

			pstmt.executeUpdate();
			isSuccess = true;

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

	public boolean update(MemberDto m) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic", "kic12", "kic12");
			// 바인딩 변수(?)는 반드시 컬럼 값에만 설정할 수 있다.
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ? , addr = ? ");
			sql.append("WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(index++, m.getName());
			pstmt.setString(index++, m.getAddr());
			pstmt.setInt(index, m.getNum());

			pstmt.executeUpdate();
			isSuccess = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return isSuccess;
	}
	public boolean delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic", "kic12", "kic12");
			StringBuffer sql = new StringBuffer();
			sql.append("delete from member ");
			sql.append("where num = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(index, num);
			
			pstmt.executeUpdate();
			isSuccess = true;
			
		} catch (Exception e) {
           e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return isSuccess;
	}
	
	
	//select는 다르니깐 꼭 외워두기~!!!!!!!!!//
	public ArrayList<MemberDto> select(){ 
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		int index = 1;
	     try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic", "kic12", "kic12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			
			
			pstmt = con.prepareStatement(sql.toString()); 
			//바인딩 변수(?) 없어서 여기는 이부분이 패스  ex)pstmt.setInt(index, num); 이런거.
			rs = pstmt.executeQuery();  //select는 다르다!!!!
			while(rs.next()) {
				index = 1; //한번 반복때는 ㄱㅊ, 두번째부터는 숫자가 4,5,6 이런식으로 되기때문에 그러면 안되니깐 다시 1로 돌아가게끔 선언해준다.
				int num = rs.getInt(index++);
				String name = rs.getString(index++);
				String addr = rs.getString(index);
				list.add(new MemberDto(num, name, addr)); //가져와야 하는것이 3개나 되니깐 하나의 객체인것처럼 묶어서 넣어준다.
	                                                      //하나의 행으로 가져와야 하기 때문에 하나의 객체로 묶어서 가져와야			
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		}finally {
			try {
				if(rs != null) rs.close();
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		return list;
	}
	
	
	
	
}
