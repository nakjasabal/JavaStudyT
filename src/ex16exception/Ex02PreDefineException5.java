package ex16exception;

public class Ex02PreDefineException5 {
 
	public static void main(String[] args)  {	
		 
		/*
		숫자를 0으로 나누는 경우 무한대가 되므로 연산이 불가능하다. 
		즉 연산불능 상태가 되었을때 발생하는 예외이다. */
		System.out.println("### ArithmeticException ###");
		int result = 10;
		try {
			result = result / 0;
			System.out.println("결과는:"+ result);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println("예외메세지:"+ e.getMessage());
		}
		
	}////end of main
}
