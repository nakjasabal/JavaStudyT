package ex07string;

public class E02StringMethod2 {

	public static void main(String[] args) {
		
		System.out.println("String 클래스의 주요 메소드2");

		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		
		/*
		6] codePointAt(인덱스) : 문자열의 특정 인덱스의 문자를 찾은
			후 아스키코드(혹은 유니코드)를 반환한다. 
		 */
		System.out.println("### 6 ###");
		System.out.println("str1 첫번째 문자의 아스키코드:"+
				str1.codePointAt(0)); //W : 87
		System.out.println("str2 세번째 문자의 아스키코드:"+
				str2.codePointAt(2)); //야 : 50556
		
		/*
		7] endsWith() : 특정 문자열로 끝나면 true를 반환
		8] startsWith() : 시작될때 true를 반환 
		 */
		System.out.println("### 7,8 ###");
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));

		/*
		9]format() : 출력형식을 지정하여 문자열로 반환할때 사용. 
			printf()와 사용법은 동일하고, 주로 웹애플리케이션을 
			제작할때 사용한다. */
		System.out.println("### 9 ###");
		System.out.printf("국어:%d,영어:%d,수학:%d\n",
				81, 92, 100);

		String formatStr = String.format("국어:%d,영어:%d,수학:%d\n",
				81, 92, 100);
		System.out.println(formatStr);

		/*
		10] indexOf() : 문자열에서 특정 문자열의 시작인덱스를 
		 	반환한다. 만약 존재하지 않으면 -1을 반환한다. 
		 	인덱스는 0부터 시작이므로 -1은 해당 문자열이 없다는 의미로
		 	해석할 수 있다. */
		System.out.println("### 10 ###");
		String email1 = "hong@daum.net";		
		System.out.println(str1.indexOf("ava"));//12
		System.out.println(str1.indexOf("J"));//-1
		System.out.println((email1.indexOf("@")!=-1) ?
				"이메일형식맞음" : "이메일형식아님");
	}
}


