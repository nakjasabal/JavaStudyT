package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
finally절
: 예외발생과 상관없이 try문으로 진입했을때 반드시 실행해야 할 코드가
있는경우 기술하는 블럭이다. 단, 필수사항은 아니므로 필요한 경우에만
작성하면된다. 
 */
public class Ex05Finally {
	
	/*
	런타임 예외가 발생되는 메서드로 예외가 발생되면 호출한 
	지점으로 예외던지기를 한다. 즉 예외를 무시한다. */
	static void runtime() throws NumberFormatException {
		Integer.parseInt("백");
	}

	static void tryCatchFinally() {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요:");
		int age = -1;
		try {
			//'10살'과 같이 입력하면 예외가 발생됨 
			age = scan.nextInt(); 
			System.out.println("당신은 5년후 "+ (age+5) +"살 입니다.");
			/*
			앞에서 정상적인 값을 입력하더라도 return이 실행된다.
			일반적으로 return은 메서드의 종료를 의미하지만 
			finally절이 있다면 해당 구문이 실행된 후 종료된다. */
			return; 
		}
		catch(InputMismatchException e) {
			System.out.println("나이는 숫자만 쓰세요");
		}
		finally {
			/*
			try절에서 예외발생과 상관없이 혹은 return을 만나더라도
			항상 finally절은 실행된다. */
			System.out.println("항상 실행되는 finally절 입니다.");
			
			/*
			해당 명령은 프로그램 실행 자체를 종료한다. 즉 콘솔창의
			터미네이트 버튼을 누르는것과 동일하게 동작한다. 
			따라서 try절에서 해당 명령을 만나게되면 finally절은
			실행되지 않는다. */
			//System.exit(0);
		}
	}
	public static void main(String[] args) {
		
		/*
		이와 같은 예외는 발생된 지점에서 예외던지기를 하는것은 가능
		하지만, 반드시 예외처리 해야만 프로그램이 종료되지 않는다. 
		즉 예외객체에 따라 무시할 수 있는것도 있지만, 이처럼
		반드시 예외처리를 해야하는것도 존재한다.
		만약 main에서 throws로 기술하면 프로그램은 비정상적으로
		종료된다. */
		try {
			runtime();
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}

		tryCatchFinally();
		
		/*
		프로그램 내에서 예외가 발생되었지만 예외처리를 통해 실행의
		흐름이 끝까지 이어지므로 해당 문장이 실행된다. 하지만
		exit(0)가 중간에 실행되면 이 부분은 실행될 수 없다. */
		System.out.println("메인메소드 끝");
	}
}


