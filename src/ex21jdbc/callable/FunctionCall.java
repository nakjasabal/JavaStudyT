package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.crud.MyConnection;
 
public class FunctionCall extends MyConnection {
	//생성자에서는 부모클래스를 통해 DB에 연결한다.  
	public FunctionCall() {
		super("education", "1234");
	}
	
	@Override
	public void dbExecute() {
		try { 
			/*
			CallableStatement 인스턴스 생성을 위해 prepareCall을 호출한다. 
			이때 Oracle에서 작성한 함수를 호출하기 위해 call 키워드를 사용한다. */
			csmt = con.prepareCall("{? = call fillAsterik(?)}");
			/*
			첫번째 파라미터는 함수 실행 후 반환값에 대한 타입을 지정한다. 
			Types 클래스의 정적 상수를 이용해서 지정하면된다 */
			csmt.registerOutParameter(1, Types.VARCHAR);
			/*
			두번째 파라미터는 사용자로부터 입력받은 아이디(문자열)에 대한
			설정을 한다. 여기서 입력받은 값은 오라클로 전달된다. */
			csmt.setString(2, inputValue("아이디"));
			//함수 실행 
			csmt.execute();
			//실행 후 반환값은 첫번째 파라미터로 입력된다. 
			System.out.println("함수의반환값:"+ csmt.getString(1));			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
	}
	
	public static void main(String[] args) {
		new FunctionCall().dbExecute();
	}
}
 










