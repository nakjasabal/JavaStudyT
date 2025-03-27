package ex03operator;

public class E03BeekyoOperator {
	/*
	비교연산자 : 두개의 변수를 서로 비교하여 값이 크거나 같은지를
		판단하는 연산자 
		! : 부정연산자로 다른지를 판단(Not)
		== : 같은지를 판단 
	 */
	public static void main(String[] args) {
				
		int num1=10, num2=20;		
		 
		/*
		num1이 클때 true를 반환하므로, 조건식은 false.
		따라서 else 구문이 실행된다. 
		 */
		if(num1 > num2) {
			System.out.println("num1이 더 큽니다.");
		}
		else {
			System.out.println("num2가 더 큽니다.");
		}
		
		/*
		num1과 num2가 다를때 true를 반환. 따라서 if문의 블럭이
		실행된다. */
		if(num1!=num2) {
			System.out.println("num1과 num2는 다르다.");
		}
		else {
			System.out.println("num1과 num2는 같다.");			
		}
		
		//두 변수가 같은지를 비교 
		if(num1==num2) {
			System.out.println("num1과 num2는 같음.");
		}
		else {
			System.out.println("num1과 num2는 다름.");
		}		
	}
}
