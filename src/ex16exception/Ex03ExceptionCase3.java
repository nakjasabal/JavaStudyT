package ex16exception;

import java.io.IOException;
/*
예외처리방법3
: 예외가 발생한 지점에서는 무시하기 위해 예외던지기를 한다. 대신 
해당 메서드를 호출한 지점에서 예외 인스턴스를 받은 후 try~catch로
처리한다. */
public class Ex03ExceptionCase3 {

	static void compileFunc() throws IOException {		 
		System.out.print("하나의 문자를 입력하세요:");
		int userChar = System.in.read();
		System.out.println("입력된 문자는 :"+(char)userChar);
	}
	
	public static void main(String[] args) {
		try {
			compileFunc();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("끝~~~");
	}
}
