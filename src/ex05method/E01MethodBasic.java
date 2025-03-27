package ex05method;

import java.util.Scanner;

/*
메서드의 규칙
-Java에서 main메서드는 public static void로 선언한다. 
-static으로 선언된 메서드는 static으로 선언된 메서드만 호출할 수 있다. 
-메서드 호출 후 반환값은 호출한 위치로 반환된다. 이때 메서드는 메모리에서
	소멸된다. 
-반환값이 없는 void형 메서드도 실행이 완료되면 호출한 위치로 실행의 
	흐름이 돌아온다. 
 */
public class E01MethodBasic 
{

	/*
	메서드1 : 반환값O, 매개변수O
	=> 매개변수로 2개의 정수를 전달받아 합의 결과를 반환한다. 
	반환값은 호출한 지점으로 반환된다. 
	 */
	public static int simpleFunc(int a, int b) 
	{
		int sum = a + b;
		return sum; 
	}
	
	/*
	메서드2 : 반환값X, 매개변수X 
	=> 전달받는 값 없이 이름을 입력받은 후 namePrint() 메서드를
	호출한다. 이와같이 반환값이 없는 경우에는 반드시 void를 명시해야
	한다. 
	 */
	public static void menuPrint() 
	{
		System.out.println("당신의 이름은 무엇인가요?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		namePrint(name);
	}
	/*
	메서드3 : 반환값X, 매개변수O
	=> 문자열을 인수로 전달받아 단순히 출력한다. 반환값이 없는 경우
	실행이 종료되면 호출했던 지점으로 실행의 흐름이 이동된다. 
	 */
	public static void namePrint(String n) 
	{		
		System.out.println("제 이름은 "+ n +" 입니다.");
	}
	
	//main메서드는 Java에서 출발점(Entry point)의 역할을 한다. 
	public static void main(String[] args) 
	{
		/*
		메서드를 호출할때는 메서드의 원형을 그대로 기술한다. 
		매개변수가 있다면 그 갯수만큼 포함해야한다. 매개변수의 갯수가
		다르거나 타입이 틀리면 에러가 발생된다. */
		int result = simpleFunc(1, 2);
		System.out.println("1과2를 전달한 결과:"+ result);
		System.out.println("10과20를 전달한 결과:"+ 
				simpleFunc(10, 20));
		
		menuPrint();
	} 
}


