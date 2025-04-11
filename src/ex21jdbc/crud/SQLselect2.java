package ex21jdbc.crud;

import java.sql.SQLException;

public class SQLselect2 extends MyConnection {
	
	public SQLselect2(String user, String pass) {
		super(user, pass);
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		try {
			while(true) {
				/*
				Prepared 인터페이스를 통해 인파라미터를 설정하면 문자
				인 경우 자동으로 싱글쿼테이션을 추가하게 되므로 || 
				연산자를 추가해서 쿼리문을 작성해야한다. */
				String sql = "SELECT * FROM member "
//					+ " WHERE name LIKE '%?%'";//부적합한 열 인덱스 에러  
					+ " WHERE name LIKE '%'||?||'%'";				
				psmt = con.prepareStatement(sql);
				psmt.setString(1, inputValue("찾는이름"));
				rs = psmt.executeQuery();
				while(rs.next()) {
					String id = rs.getString(1);
					String pass = rs.getString(2);
					String name = rs.getString(3);
					/* 날짜를 문자형으로 추출하면 시간까지 출력되므로 날짜
					부분만 잘라서 출력한다. */
					String regidate = rs.getString(4).substring(0, 10);

					System.out.printf("%s %s %s %s\n", id, pass, name, regidate);
				}
			}
		}
		catch (SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SQLselect2("education", "1234").dbExecute();
	}
}
