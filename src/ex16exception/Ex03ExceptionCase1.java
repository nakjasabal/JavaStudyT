package ex16exception;

import java.io.IOException;

/*
예외처리방법1
: 예외가 발생한 메서드에서 호출했던 지점으로 예외객체를 던지고, 
메인메서드에서도 프로그램 외부로 예외객체를 던진다. 즉 예외를 내부에서
처리하지 않고 무시하겠다는 의미이다. 외부자원 사용시 기본적으로 발생되
는 예외는 이처럼 무시하는게 가능하다. 이를 "예외던지기"라고 한다. 
 */
public class Ex03ExceptionCase1 {

	static void compileFunc() throws IOException {
		System.out.print("하나의 문자를 입력하세요:");
		int userChar = System.in.read();
		System.out.println("입력된 문자는 :"+(char)userChar);
	}	
	
	public static void main(String[] args) throws IOException {
		compileFunc();
	}

}
