package ex05method;

import java.util.Scanner;

/*
문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 
메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.
 */
public class QuCircleCalculator {
	
	//원의넓이 : 3.14 * 반지름 * 반지름
	static double circleArea(double r) {
		return (3.14 * r * r);
	}
	
	//원의둘레 : 2 * 3.14 * 반지름
	static double circleRound(double r) {
		double result = 2 * 3.14 * r;
		return result;		
	}
	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름을 입력하세요:");
		//원의 넓이는 PI(3.14)를 곱해야 하므로 반지름도 double형인것이 좋다.
		double rad = scanner.nextDouble();
		
		//넓이 출력
		System.out.println("원의넓이1(5.5)="+ circleArea(rad));
		System.out.printf("원의넓이2(5.5)=%.3f\n", circleArea(rad));
		
		//둘레 출력
		double returnVal = circleRound(rad);
		System.out.println("원의둘레(5.5)="+ returnVal);
	}
}





