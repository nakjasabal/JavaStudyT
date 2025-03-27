package ex16exception;

import java.util.Date;

public class Ex02PreDefineException4 {
 
	static Date toDay;	
	public static void main(String[] args)  {	
		
		System.out.println("### NullPointerException ###");
		/*
		null값을 print에서 출력하면 단순히 문자열로 출력된다. */
		System.out.println("toDay="+ toDay);
		
		try {
			/*
			참조변수가 null이라는 것은 참조할 인스턴스가 없다는것을
			의미하기 때문에 이 상태에서 메서드를 호출하면 예외가 
			발생된다. */
			System.out.println(toDay.getTime());
		}
		catch(NullPointerException e) {
			System.out.println("toDay 참조변수는 null입니다.");
			System.out.println("예외메세지:"+ e.getMessage());
		}
		
	}////end of main	
}
