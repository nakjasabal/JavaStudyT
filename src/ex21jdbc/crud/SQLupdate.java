package ex21jdbc.crud;

import java.sql.SQLException;

public class SQLupdate extends MyConnection {
	
	public SQLupdate(String user, String pass) {
		super(user, pass);
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		try {
			//Statement 인스턴스 생성(쿼리문과는 별도 생성)
			stmt = con.createStatement();
			//update 쿼리문 작성 
			query = "UPDATE member SET "
					+ "		pass='0412',"
					+ "		name='성유겸',"
					+ "		regidate=sysdate "
					+ " WHERE id='test2' ";
			//쿼리문을 인수로 전달하여 실행. 적용된 행의 갯수 반환. 
			result = stmt.executeUpdate(query);
			System.out.println("[stmt]"+ result +"행 업데이트 됨");
			
			//////////////////////////////////////////////////try {
			
			//인파라미터가 있는 쿼리문 작성 
			query = "UPDATE member "
					+ " SET name=?, pass=? "
					+ " WHERE id=?";
			//작성된 쿼리문을 기반으로 Prepared 인스턴스 생성 
			psmt = con.prepareStatement(query);
			//exit를 입력하기전까지 무한히 반복 실행 
			while(true) {
				//입력값을 통해 인파라미터 설정 
				psmt.setString(3, inputValue("수정할 아이디"));
				psmt.setString(1, inputValue("이름"));
				psmt.setString(2, inputValue("패스워드"));
				//Prepared 인스턴스를 통해 쿼리문 실행 
				result = psmt.executeUpdate();
				System.out.println("[psmt]"+ result +"행 업데이트됨");
			}
		}
		catch (SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SQLupdate("education", "1234").dbExecute();
	}
}
