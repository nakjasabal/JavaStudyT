package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic {
	
	public static void main(String[] args)
			throws IOException {
		 
		/*
		Syntax에러(구문에러)
		: 실행자체가 되지 않는 코드로 오류를 수정해야만 정상적으로
		실행된다. 즉 코드에 문법적인 오류가 발생되었음을 의미한다. */
//		Int number = 10; -> int를 Int로 표기했음
//		if(true);
//		{}
//		else -> if문이 세미콜론으로 종료되어 의미없는 else문이 됨
//		{}
			
		//위 코드를 정상적으로 수정하면 아래와같다. 
		int number = 10;
		if(true) {
			System.out.println("참이다");
		}
		else {
			System.out.println("거짓이다");
		}
		 
		/*
		외부자원을 사용할때 발생되는 예외
		처리방법1] "예외던지기"를 수행한다. 
			main메서드에 throws IOException을 기술하면 해당
			메서드 내에서 발생되는 예외를 무시하겠다는 의미가된다.
		처리방법2] 예외가 발생한 지점을 try~catch문으로 직접
			감싸서 처리한다. 
		 */
		System.out.print("문자하나를 입력하세요:");		
		try {
			int iChar = System.in.read();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}	 		
	}
}
