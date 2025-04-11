package ex21jdbc.crud;

/*
인터페이스에 선언되는 
  모든 변수는 public static final이 추가되어 '정적상수'가 된다.
  모든 메서드는 public abstract가 추가되어 '추상메서드'가 된다. 
 */
public interface IConnect {
	//멤버상수 : 오라클드라이버, 커넥션URL 선언 
	String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	//멤버메서드 
	void dbExecute();//쿼리문 실행
	void dbClose();//DB 자원 반납
	//사용자로부터 입력을 받기 위해 정의 
	String inputValue(String title);
}



