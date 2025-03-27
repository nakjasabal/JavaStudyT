package ex05method;

/*
Method(메서드)
: 객체지향 프로그래밍에서 행동 또는 동작을 의미한다. 
즉 어떤 하나의 업무를 처리하기 위한 모듈(부속품)이라 정의할 수 있다. 
-메서드는 반드시 class 내부에 정의해야한다. 
-메서드 내부에 또 다른 메서드를 정의할 수 없다. 이 경우 에러가 
	발생된다. 
-반환값이 없다면 void를 명시해야한다. 
-함수명은 변수명과 동일한 규칙으로 작성한다. 

Java에서의 Naming Rule(이름을 지을때의 규칙)
-클래스명 : SimpleClass
	=> 대문자로 시작하는 Camel case
-메서드 혹은 변수명 : simpleFunc
	=> 소문자로 시작하는 변형된 Camel case
-상수명 : SIMPLE_CONST
	=> 전체를 대문자로 기술. 단 연결되는 단어는 _로 구분
-패키지명 : simple.package
 	=> 전체를 소문자로 기술. 연결되는 단어는 .으로 구분 
 */ 


/*
메서드형태1] 매개변수X, 반환값X
	: 둘다 없는 형태의 메서드로 주로 메뉴를 출력하거나 하는 단순한
	기능을 가지게된다. */
public class E02MethodType01 {
	
	//단순한 메뉴 출력 기능으로 정의  
	static void menuPrint() {
		System.out.println("==메뉴를 선택하세욤==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("=====================");
	}
 	
	static void returnError() {
		
		int returnValue = 8;
		System.out.println("[Return문 이전]");
				
		/*
		이와같이 메서드 중간에 return을 기술하면 즉시 종료되므로 
		그 아래의 코드는 실행될 수 없는 상태가된다. 따라서 에러가
		발생된다. 
		이런 경우에는 반드시 조건문과 같이 기술해서 조건부로 실행될 수
		있도록 코딩해야한다. 
		단 메서드의 마지막 부분에 기술하는 경우에는 조건문이 없어도된다.
		 */
//		return;				
		if(returnValue%2==0) {
			System.out.println(returnValue +"는 짝수");
			return;
		}

		System.out.println(returnValue +"는 홀수");
		System.out.println("[return문 이후]");
	}
	
	public static void main(String[] args) {
		//함수의 원형을 통해 호출한다. 
		menuPrint();
		returnError();
	}

}
