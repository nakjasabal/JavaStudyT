package ex07string;

public class E01StringBasic {

	public static void main(String[] args) {
		
		/*
		기본자료형의 경우 비교연산자 ==을 통해 값에 대한 비교를 한다. 
		변수에 값이 할당되어 있으므로 아래와 같이 비교할 수 있다. */
		int num1=10, num2=20;
		String numResult = (num1==num2) ? 
				"데이터가같다" : "데이터가다르다";
		System.out.println("비교결과:"+ numResult);
	 
		/*
		String 클래스의 인스턴스 생성 방법
		: new를 이용한다. new를 통해 문자열 인스턴스를 생성하면 
		동일한 문자열이라도 항상 새로운 메모리를 할당한다. */
		String str1 = new String("Hello JAVA");
		String str2 = new String("Hello JAVA");
		
		/*
		str1, str2는 String 인스턴스의 참조값을 저장하고 있으므로
		아래의 비교는 참조값(주소)에 대한 비교를 하게된다. 2개의 
		인스턴스는 각각 생성되므로 다르다는 결과가 나온다. */
		if(str1==str2) {
			System.out.println("str1과 str2는 참조주소 같음");
		}
		else {
			System.out.println("str1과 str2는 참조주소 다름");
		}
		
		/*
		equals() 메서드 : Object클래스에서 제공하는 메서드로 
			실제 저장된 문자열을 비교하도록 정의되어있다. 즉 아래는
			인스턴스에 저장된 실제 문자열에 대한 비교가 이루어진다. 
		 */
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 동일하다");
		}
		else {
			System.out.println("두 문자열은 다르다");
		}
		
		/*
		String 인스턴스 생성방법2 
		: 더블쿼테이션을 사용한다. 이 경우 내용이 동일하다면 같은
		주소를 사용한다. 즉 새로운 메모리를 할당하지 않는다. 따라서
		String 인스턴스는 방법2를 주로 사용한다. */
		String str3 = "자바개발자";
		String str4 = "자바개발자";
		
		//내용이 동일하므로 true가 출력됨 
		System.out.println("equals()메소드로 문자열비교:"+
				str3.equals(str4));
		
		//하나의 메모리를 공유하므로 같다는 결과가 출력됨 
		if(str3==str4) {
			System.out.println("주소가 같다");
		}
		else {
			System.out.println("주소가 다르다");
		}
		
		System.out.println("The end..!!");	
	}
}



