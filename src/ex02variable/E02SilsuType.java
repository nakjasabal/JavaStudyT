package ex02variable;

public class E02SilsuType {
	/*
	실수자료형
	-정수형보다는 실수형이 더 큰 자료형이다. 0과 1사이에 무수히 
	많은 실수가 존재하기 때문이다. 
	-따라서 long(정수형)과 float(실수형)을 연산하면 float의 
	결과가 나오게된다. */
	public static void main(String[] args) {
		 
		long long1 = 100;
		float float1 = 200;
		//정수와 실수의 연산은 실수로 자동형변환된다. 
		float result1 = long1 + float1;
		//300.0의 결과가 출력됨 
		System.out.println("long1 + float1 = "+ result1);
		
		/*
		float(실수)와 long(정수)의 연산결과를 long형으로 받고 싶다면
		방법1 : float를 long으로 강제형변환 후 연산한다. 
		방법2 : 계산결과 전체를 long으로 강제형변환한다. */
		long result2 = long1 + (long)float1;
		System.out.println("형변환후 연산="+ result2);
		long result3 = (long)(long1 + float1);
		System.out.println("계산후 형변환="+ result3);
 
		/*
		-실수형의 기본은 double
		-소수점이 있는 데이터를 컴파일러는 무조건 double로 인식
		-단, 소수점이 없는 데이터는 float에 대입할 수 있음 
		-소수점이 있는 데이터를 float에 대입하려면 접미사(F혹은f)를
		붙여야함
		 */
		float f3 = 100;
		//에러발생. 3.14 자체를 double로 인식.
		//float f4 = 3.14; 
		
		//강제형변환 후 대입할 수 있으나 권장하지 않음.
		float f4 = (float)3.14; 
		System.out.println("f4="+ f4);
		
		//접미사를 통해 float형 자료임을 명시함(권장사항)
		float f5 = 3.14F;
		System.out.println("f5="+ f5);
		
		//float형 끼리의 연산은 기본규칙을 따른다. 
		float f6 = f3 + f4;  
		System.out.println("f6="+ f6);
		
		//float보다는 double이 더 크므로 연산결과는 double이된다.
		double d1 = 3.14;
		double d2 = f6 + d1;  
		System.out.println("d2="+ d2);
	}

}
