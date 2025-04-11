package ex21jdbc.crud;

import java.sql.SQLException;

//DB연결을 위한 MyConnection 클래스를 상속하여 정의 
public class SQLinsert extends MyConnection {

	//생성자 : 매개변수로 계정 정보를 받음 
	public SQLinsert(String user, String pass) {
		/*
		부모클래스의 생성자를 호출한다. 이때 DB에 연결된다. */
		super(user, pass);
	}
	
	//멤버변수 
	String query; //쿼리문 작성
	int result; //쿼리 실행 후 결과 반환 
	/*
	이 멤버변수는 생성자에서 초기화되지 않는다. 생성자는 대부분
	멤버변수의 초기화를 목적으로 정의되지만, JDBC프로그래밍에서는
	쿼리문을 실행해야 하므로 인스턴스가 생성된 후 변수를 초기화해야
	한다. */
	
	//insert 쿼리문 실행을 위한 메서드 
	@Override
	public void dbExecute() {
		try {
			/*
			Statement인터페이스 
			: 정적 쿼리문을 실행할때 사용한다. 정적 쿼리문이란 인파라미
			터가 없는 완성된 쿼리문을 말한다. 수정은 개발자가 직접 
			진행해야 한다. */
			stmt = con.createStatement();
			//쿼리문 작성 
			query = "INSERT INTO member VALUES "
				+ " ('test2', '2222', '테스터2', sysdate)";
			//insert의 반환값은 정수로 1이면 성공, 0이면 실패
//			result = stmt.executeUpdate(query);
			System.out.println("[stmt]"+ result +"행 입력됨");
			
			/////////////////////////////////////////////////////////
			//인파라미터가 있는 동적쿼리문 작성 
			query = "INSERT INTO member VALUES "
					+ " (?, ?, ?, sysdate)";
			/*
			preparedStatementd인터페이스
			: 인파라미터가 있는 동적쿼리문 실행할때 사용한다. 인파라미터
			는 ?로 표시하고, 인스턴스 생성 이후 setXX() 메서드를 통해
			설정한다. 인덱스는 1부터 시작한다. */
			psmt = con.prepareStatement(query);
			//쿼리문의 인파라미터를 입력값을 통해 설정함. 
			psmt.setString(1, inputValue("아이디"));
			psmt.setString(2, inputValue("패스워드"));
			psmt.setString(3, inputValue("이름"));
			//쿼리문 실행 및 결과 반환 
			result = psmt.executeUpdate();
			System.out.println("[psmt]"+ result +"행 입력됨");
		}
		catch (SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
	}

	//정의된 클래스의 인스턴스를 생성하여 실행한다. 
	public static void main(String[] args) {
		new SQLinsert("education", "1234").dbExecute();
	}
}




