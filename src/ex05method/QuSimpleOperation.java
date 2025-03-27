package ex05method;

import java.util.Scanner;

/*
문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 
main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타(인자)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
*/
public class QuSimpleOperation {

	//반환값은 없고 매개변수가 있는 형태의 메서드
	static void arithmetic(int n1, int n2) {
		System.out.printf("덧셈:%d+%d=%d%n", n1, n2, (n1+n2));
		System.out.printf("뺄셈:%d-%d=%d%n", n1, n2, (n1-n2));
		System.out.printf("곱셈:%d*%d=%d%n", n1, n2, (n1*n2));
		System.out.printf("나눗셈(몫):%d/%d=%d%n", n1, n2, (n1/n2));
		//%기호를 출력하기 위해서 %%와 같이 사용해야 한다. 
		System.out.printf("나눗셈(나머지):%d %% %d=%d%n", n1, n2, (n1%n2));
		
		/////////////////////////////////////////
		///
		System.out.println("덧셈"+ (n1+n2));
		System.out.println("뺄셈"+ (n1-n2));
		System.out.println("곱셈"+ (n1*n2));
		System.out.println("나눗셈"+ (n1/n2));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수1을입력:");
		int num1 = scanner.nextInt();
		System.out.print("정수2을입력:");
		int num2 = scanner.nextInt();
		arithmetic(num1, num2);
	}

}



