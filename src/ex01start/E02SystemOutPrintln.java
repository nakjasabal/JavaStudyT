package ex01start;

/*
println() : 내용을 출력한 후 자동으로 줄바꿈 처리한다. 
print() : 출력후 줄바꿈 처리를 하지않는다. 만약 줄바꿈이 필요하면
	\n을 추가해야한다. 
printf() : 출력내용을 서식에 맞춰 출력한다. 또한 자체적인 
	줄바꿈 기능이 없으므로 \n 혹은 %n을 사용해야한다. 
	변수를 출력하는 서식문자에는 %d, %f 등이 있다. 
	단, 줄바꾼을 위한 %n은 printf() 에서만 사용할 수 있다. 
 */
public class E02SystemOutPrintln {

	public static void main(String[] args) {
		
		//정수형 변수를 선언한 후 100으로 초기화한다. 
		int num1 = 100;
		
		//문자열과 정수형 변수를 +기호를 통해 연결한 후 출력 
		System.out.println("num1="+ num1);
		System.out.print("num1="+ num1 +"\n");
		System.out.printf("num1=%d %d %n", num1, 100);
		
		//정수, 실수를 단순히 출력 
		System.out.println(7);
		System.out.println(3.14);
		
		/*
	 	print() 문에서의 +기호의 역할
	 	1.숫자(정수 혹은 실수)끼리는 실제 덧셈연산을 한다.
	 	2.문자열, 숫자 등 서로 성격이 다른 데이터끼리는 단순 
	 		연결하는 기능만 제공한다. 
		 */
		//둘다 정수 혹은 실수이므로 덧셈의 결과를 출력 
		System.out.println(3 + 5); 
		System.out.println(3.5 + 5.1); 
		
		/*
		숫자(정수 혹은 실수)와 문자열 혹은 문자열과 문자열인 경우에
		는 단순 연결되어 출력 
		 */
		System.out.println("3+5="+ 8);
		System.out.println(3.15 +"는 실수입니다.");
		System.out.println("3+5" + " 의 연산결과는 8입니다.");		
 
		//정수형 변수와 문자열의 조합이므로 연결되어 출력됨 
		System.out.println("num1 은 "+ num1 +" 입니다.");
	}

}



