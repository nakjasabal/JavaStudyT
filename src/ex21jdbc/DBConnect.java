package ex21jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	/*
	JDBC 프로그래밍 절차
	1.오라클용 JDBC 드라이버를 메모리에 로드
	: new를 사용하지 않고 클래스명으로 직접 인스턴스를 생성한 후
	메모리에 로드하는 forName() 이라는 정적메서드를 사용. 
	
	2.오라클 연결을 위해 커넥션URL, 계정의 아이디, 패스워드를
	준비한다. 
	커넥션URL =>
		jdbc:oracle:thin:@오라클의IP주소:포트번호:SID명
		※서버환경에 따라 ip, 포트, sid는 변경될 수 있다.
	
	3.DriverManager 클래스의 정적메서드인 getConnection()을
	통해 DB에 연결을 시도하고, 연결에 성공하면 Connection 인스턴스
	를 반환한다. 
	
	4. 우리는 반환된 Connection인스턴스를 통해 데이터베이스 
	작업을 처리할 수 있다. 
	 */
	public static void main(String[] args) {
		 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "education";
			String pass = "1234";
			
			Connection con = 
					DriverManager.getConnection(url,id,pass);
			if(con!=null) {
				System.out.println("Oracle 연결성공");
			}
			else {
				System.out.println("Oracle 연결실패");
			}
		}
		catch(Exception e) {
			System.out.println("Oracle 연결시 예외발생");
			e.printStackTrace();
		}
	}

}
