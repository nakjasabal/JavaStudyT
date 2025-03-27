package ex16exception;

import java.io.IOException;
/*
예외처리방법2
: 예외가 발생한 지점에서 예외를 직접 처리한다. 개발시 가장 많이
사용되는 방법으로 try~catch문을 통해 예외가 발생되는 지점을 
명시적으로 알 수 있다.  
 */
public class Ex03ExceptionCase2 {

	static void compileFunc() {
		/*
		try문을 사용할때는 관련있는 로직들을 하나로 묶어주는것이
		좋다. 관련있는 로직이 블럭으로 나눠지게 되면 가독성이
		떨어지기 때문이다. */
		try {
			System.out.print("하나의 문자를 입력하세요:");
			int userChar = System.in.read();
			System.out.println("입력된 문자는 :"+(char)userChar);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args) {
		compileFunc();
	}

}
