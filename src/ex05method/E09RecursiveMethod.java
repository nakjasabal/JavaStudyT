package ex05method;

/*
재귀메서드(Recursive method)
: 하나의 메서드에서 자신을 다시 호출하여 작업을 수행하는 방식으로
정의한다. 마치 반복문과 같은 형태로 동작한다. 순환호출이라고 표현하기도
한다.  
 */
public class E09RecursiveMethod {

	static int factorial(int number) {
		int result;
		if(number==1) {
			//매개변수 값이 1인경우 1을 반환한다. 
			result = 1;
		}
		else {
			//1이 아닌 경우에는 자신의 메서드를 재귀호출한다. 
			result = number * factorial(number-1);
		}
		System.out.println("계산과정:number="+ number
				+", result="+ result);
		return result;
	}

	public static void main(String[] args) {

		System.out.println("재귀함수를 이용한 팩토리얼 구하기");
		System.out.println("4factorial:"+ factorial(4));
		System.out.println("10factorial:"+ factorial(10));
	}
}
