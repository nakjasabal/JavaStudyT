package ex21jdbc.crud;

import java.sql.SQLException;

public class SQLdelete extends MyConnection {
	
	public SQLdelete(String user, String pass) {
		super(user, pass);
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		try {
			stmt = con.createStatement();			
			query = "DELETE FROM member "
					+ " WHERE id='commit1'";
			result = stmt.executeUpdate(query);			
			System.out.println(result +"행 삭제됨");
			
			//////////////////////////////////////////////////////////
			
			query = "DELETE FROM member WHERE id=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, inputValue("삭제할아이디"));
			System.out.println(psmt.executeUpdate()+"행 삭제됨");
		}
		catch (SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SQLdelete("education", "1234").dbExecute();
	}
}
