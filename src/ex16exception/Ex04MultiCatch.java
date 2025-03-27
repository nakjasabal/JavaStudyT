package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
예외처리를 할때 필요에 따라 여러개의 catch블럭을 사용할 수 있다. 
이 경우 반드시 자식 예외 클래스부터 catch블럭에 추가해야한다. 
Exception 클래스는 모든 예외를 처리할 수 있으므로 반드시 마지막
블럭에 사용해야한다. 
클래스의 상속구조는 ctrl+t로 확인할 수 있다.  
 */
public class Ex04MultiCatch {

	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		//크기가 3인 정수형 배열 생성 
		int array[] = new int[3];
		try {
			//3개의 문자열을 입력받는다. 
			for(int i=0 ; i<array.length ; i++) {
				System.out.print("array["+ i +"]에 저장할 숫자입력:");
				/*
				입력한 문자열을 정수로 변경한 후 배열에 저장한다. 단
				"1a"와 같이 입력하면 정수로 변경할 수 없으므로 예외가
				발생된다. */
				array[i] = Integer.parseInt(scanner.nextLine());
			}
			/*
			1번 인덱스에 0을 입력하면 연산이 불가능하므로 예외가 발생
			된다. */
			System.out.println("배열에 저장된 두 숫자나누기:"+
					array[0]/array[1]);  
			
			//나이 입력시 문자를 입력하면 예외가 발생된다. 
			System.out.print("나이를 입력하세요:");
			int age = scanner.nextInt();			 
			System.out.println("당신의 나이는:"+ age);
			
			/*
			배열의 크기가 3이므로 인덱스는 2까지만 존재한다. 따라서 
			이 코드도 예외가 발생된다. */
			array[3] = age;
		}		
		catch(ArithmeticException e) {
			System.out.println("산술연산이 불가능 합니다.");
		}
		catch(InputMismatchException e) {
			System.out.println("숫자로만 입력해야 합니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자형태의 문자만 입력가능합니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 초과하였습니다");
		}
		catch(Exception e) {
			/*
			Exception 클래스는 모든 예외클래스의 부모이므로 
			catch절의 마지막에 위치해야한다. 앞부분에 있으면 
			모든 예외를 처리하기 때문에 아래쪽의 블럭이 실행되지
			않기 때문이다. */
			System.out.println("예외가 발생하였습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*
		앞 부분에서 예외가 발생하더라도 예외처리를 했으므로 프로그램
		은 끝까지 실행된 후 정상적으로 종료된다. 실행의 흐름이 
		마지막까지 이어지게 하는것이 "예외처리"의 목적이다. */
		System.out.println("===프로그램 끝===");
	}
}



