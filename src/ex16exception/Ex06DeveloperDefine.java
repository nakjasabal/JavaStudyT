package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
개발자 정의 예외클래스
1.Exception 클래스를 상속한다. 
2.생성자에서 예외발생시 출력할 메세지를 super()를 통해 입력한다. 
3.예외발생 지점에서 if문으로 감지한 후 예외 인스턴스를 생성 및 
	throw한다. 
4.catch절에서 예외 인스턴스를 잡아 처리한다. 
 */
class AgeErrorException extends Exception {
	public AgeErrorException() {
		super("나이 입력이 개잘못 되었어요");
	}
}

public class Ex06DeveloperDefine {

	public static void main(String[] args) {

		System.out.print("나이를 입력하세요 : ");
		try {
			/*
			아래 메서드에서 AgeErrorException 예외 인스턴스를
			throw 하면 여기에서 예외처리한다. 즉 메서드를 호출한
			지점에서 예외처리를 하는 방식이다. */
			int age = readAge();
			System.out.println("당신의 나이는 "+ age +" 입니다.");
		}
		catch(AgeErrorException e) {
			System.out.println("[예외발생]"+ e.getMessage());
		}		
	}
	
	//예외던지기를 하여 호출한 지점으로 예외 인스턴스를 전달한다. 
	public static int readAge() throws AgeErrorException {
		Scanner sc = new Scanner(System.in);
		int inputAge=0;
		try {
			/*
			나이 입력시 문자를 잘못 입력하는 경우에는 Java에서
			미리 정의해 둔 예외처리 클래스를 사용하면 된다.  */
			inputAge = sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		/*
		만약 나이를 음수로 입력하는 경우 JVM이 감지하지 못하므로
		이때는 if문을 통해 판단해야한다. 개발자가 정의한 예외 
		인스턴스를 생성한 후 직접 throw 한다. */
		if(inputAge<0) {
			AgeErrorException ex = new AgeErrorException();
			throw ex;			
		}
		//입력받은 나이를 반환한다. 
		return inputAge;
	}
}




