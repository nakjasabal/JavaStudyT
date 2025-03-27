package ex05method;

import java.util.Scanner;

public class E03MethodType02_2 {
	
	//반환타입이 String이므로 문자열의 결과를 반환한다. 
	static String getHakjum() {
		//사용자로부터 점수를 입력받음 
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수:");	
		int kor = scanner.nextInt();
		System.out.print("영어점수:");
		int eng = scanner.nextInt();
		System.out.print("수학점수:");
		int math = scanner.nextInt();
		//평균값 계산. 실수형의 결과를 얻기위해 3.0으로 나눈다. 
		double avg = (kor + eng + math) / 3.0;
		String hakjum = "";
		//학점의 구간 결정을 위해 10으로 나눈 몫을 구함. 
		int result = (int)avg / 10;
		//학점 판단 
		switch(result) {
		case 10: case 9:
			hakjum = "A학점";break;
		case 8:
			hakjum = "B학점";break;
		case 7:
			hakjum = "C학점";break;
		case 6:
			hakjum = "D학점";break;
		default:
			hakjum = "F학점";
		}
		/*
		결과값을 return해서 호출한 지점으로 전달한다. 이때 메서드는 
		메모리에서 소멸된다. */
		return hakjum;
	}

	public static void main(String[] args) {		
		/*
		시나리오] 사용자로부터 국,영,수 점수를 입력받아 평균을 구한후 학점을
		반환하는 메소드를 정의하시오.
		 */
		//호출1 : print()의 일부로 메서드를 호출 
		System.out.println("너의 학점은 "+ getHakjum() 
				+" 이얌~!");
		
		//호출2 : 변수의 우측항에서 호출하여 반환값을 할당 
		String h = getHakjum();
		System.out.printf("당신의 학점은 %s 입니다.", h);
	}////end of main

}////end of class