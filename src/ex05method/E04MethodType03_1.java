package ex05method;

import java.util.Scanner;

/*
메서드형태3] 매개변수O, 반환값X
: 값을 전달받은 후 연산하고 해당결과를 반환하지 않고 즉시 출력하는 경우
사용한다. 즉 값을 소비하는 형태의 메서드이다. 
 */
public class E04MethodType03_1 {
	
	
	
	
	/*
	시나리오] 사용자가 입력한 2개의 시작값과 끝값사이에 있는
	수를 모두 더하여 출력하는 프로그램을 작성하시오.
		출력결과]
			시작값 : 5
			종료값 : 9
			결과 : 5+6+7+8+9=???
	 */
	public static void main(String[] args) 
	{		 
		//입력값을 받기위해 Scanner 인스턴스 생성 
		Scanner scanner = new Scanner(System.in);		
		System.out.print("시작값:");
		int s = scanner.nextInt();
		System.out.print("종료값:");
		int e = scanner.nextInt();
		
		/*
		반환값이 없는 메서드이므로 단독적으로 호출한다. 
		앞에서 받은 2개의 정수를 인수(Argument)로 전달한다. */
		myWantSum(s, e);
	}
	
	/*
	main() 메서드에서 호출시 전달한 2개의 인수를 매개변수가 
	순서대로 값을 받게된다. 매개변수는 해당 메서드에서 즉시 사용할 수 
	있는 지역변수가 된다. */
	static void myWantSum(int startNum, int endNum) 
	{
		/*
		1에서 10까지의 합을 구하는 수열 프로그램을 시작값과 종료값만
		변수로 변경하여 원하는 구간의 합을 구하는 프로그램으로 
		커스터마이징하여 재정의 하였다. */
		int sum = 0;
		for(int i=startNum ; i<=endNum ; i++) {
			sum += i;
		}
		System.out.printf("%d~%d까지의합은:%d", 
				startNum, endNum, sum);
	}
}
