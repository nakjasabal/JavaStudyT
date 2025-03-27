package ex02variable;

public class E04StringType {

	public static void main(String[] args) {
		/*
		String클래스 : 참조형 변수로써 기본자료형이 아닌 클래스로
			문자열을 저장하고, 조작하는 기능을 가지고있다. 
			Java에서는 문자열을 표현할때 "으로 감싸주면되고 연결시에는
			+ 기호를 사용한다. 
		 */	 
		int number;
		number = 99;
		
		/*
		클래스를 통해 생성한 참조형 변수와 기본자료형 변수 사이에서는
		형변환이 불가능하다. 서로 사용하는 메모리 공간이 다르기 때문.
		-기본자료형 : Stack(스택) 영역을 사용
		-클래스(참조형)변수 : Heap(힙) 영역을 사용 
		 */
		//아래 2개의 문장은 모두 에러가 발생됨 
//		int stringNumber1 = (int)"100"; 
//		String stringNumber2 = (String)100;
		 
		//String + int => 단순 연결되어 출력됨 
		String strNumber = "100";
		System.out.println(strNumber + number);
		
		//String은 클래스이므로 new를 사용해서 변수를 생성함 
		String newString = new String("new 키워드 사용");
		System.out.println(newString);

		//String변수는 주로 더블쿼테이션을 통해 생성함 
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";	
		System.out.println(stringBasic +" "+ plusString);
		
		/*
		문자열+정수 : 우선순위가 없다면 문자열과 숫자가 연결된 상태로
			출력된다. 단 산술연산의 결과를 출력하고 싶다면 아래와같이
			소괄호로 묶어 우선순위에 대한 변화를 주면된다. */
		int kor=100, eng=99, math=98;
		//1009998 형태로 출력
		System.out.println("총점:"+kor+eng+math);
		//덧셈 연산의 결과로 297 출력 
		System.out.println("총점:"+(kor+eng+math));
	}

}
