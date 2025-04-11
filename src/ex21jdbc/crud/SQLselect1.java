package ex21jdbc.crud;

import java.sql.SQLException;

public class SQLselect1 extends MyConnection {
	
	public SQLselect1(String user, String pass) {
		super(user, pass);
	}
	
	String query;
	int result;
	
	/*
	쿼리문 실행시 사용하는 두가지 함수
	executeUpdate()
		: insert, update, delete 쿼리문을 실행할 때 사용. 
		쿼리실행 후 반환값은 정수로, 적용된 행의 갯수가 반환된다. 
	executeQuery() 
		: select 쿼리문을 실행한다. 반환값은 조회할 레코드이므로 
		ResultSet 인스턴스가 반환된다. Java에서 반환받은 후 
		while문으로 갯수만큼 반복하여 인출한다. 
	 */
	@Override
	public void dbExecute() {
		try {
			stmt = con.createStatement();
			//레코드 전체를 조회하는 select 쿼리문 작성 
			String query = "SELECT id, pass, name, regidate,"
				+ " to_char(regidate, 'yyyy.mm.dd hh24:mi') d1 "
				+ " FROM member";
			//쿼리문을 실행한 후 결과는 ResultSet으로 반환 
			rs = stmt.executeQuery(query);
			//반복 인출
			while(rs.next()) {
				//인출시 인덱스와 컬럼명 2가지로 표현 가능 
				String id = rs.getString(1);//id컬럼
				String pw = rs.getString("pass");
				String name = rs.getString("name");				
				
				/* 오라클의 date타입을 getDate()로 인출하면
				0000-00-00 형식으로 출력된다. 또한 자료형이 Date
				이므로 java.sql패키지의 클래스를 사용해야한다. */
				java.sql.Date regidate = rs.getDate("regidate");
				
				/* 날짜를 getString()으로 인출하면 시간까지 포함되어
				출력된다. 0000-00-00 00:00:00 형식이므로, 적당한
				크기로 잘라야한다면 substring()을 사용하면 된다. */
				String regidate2 = rs.getString("regidate");
				String regidate3 = rs.getString("regidate")
										.substring(0,13);
				
				/* 오라클의 변환함수를 통해 포매팅한 후 문자형식으로 출력한다.
				쿼리문에 별칭을 사용한 경우 getString()에서 그대로 사용할
				수 있다. */
				String regidate4 = rs.getString("d1");

				System.out.printf("%s %s %s %s %s %s %s\n",
						id, pw, name, regidate, 
						regidate2, regidate3, regidate4);
			}
		}
		catch (SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SQLselect1("education", "1234").dbExecute();
	}
}
