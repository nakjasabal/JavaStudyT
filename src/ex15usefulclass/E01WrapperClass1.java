package ex15usefulclass;

/*
Wrapper 클래스 : 기본자료형의 데이터를 인스턴스화 할때 사용하는 클래스로
	Boxing/Unboxing을 통해 기본자료형의 데이터를 인스턴스화 한다. 
	뒤에서 학습할 제네릭 클래스에서 필수적으로 사용된다. */
public class E01WrapperClass1 {

	public static void main(String[] args) {
		
		//일반적인 정수의 연산 
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println("result="+ result);
 
		/*
		JDK 최신버전에서는 디플리케이트 되어 사용되지 않는 생성자라는
		경고 메세지가 출력된다. 구 버전과의 호환성을 위해 남겨져 있는
		상태이다. */
		//정수를 구 버전의 생성자를 이용해서 Boxing처리 
		Integer n10Obj = new Integer(10);
		Integer n20Obj = new Integer(num2);
		//메서드를 통해 Unboxing 후 덧셈 연산을 진행 
		int result2 = n10Obj.intValue() + n20Obj.intValue();
		//결과 30 출력 
		System.out.println("result2="+ result2);

		//진법 변환을 위한 메서드가 기본으로 제공된다. 
		Integer resultObj = new Integer(result2);
		System.out.println("결과값을 byte형 값으로 변경:"+
				resultObj.byteValue());
		System.out.println("결과값을 이진수로 변경:"+
				Integer.toBinaryString(result2));
	 
		/*
		최신버전에서의 코딩형태
		오토박싱/언박싱이 지원되므로 기본자료형 변수를 선언하는것과
		동일하게 코딩할 수 있다. */
		//별도의 형변환이나 처리없이 기본자료형 처럼 선언한다. 
		Integer numObj1 = 100;
		Integer numObj2 = 200;		
		//인스턴스지만 정수처럼 연산이 가능하다. 
		int result3 = numObj1 - numObj2;
		System.out.println("오토언박싱 이후 연산결과:"+ result3);

		//int형의 최대/최소 범위를 가진 상수값 제공
		System.out.println("int형의 최대값:"+ Integer.MAX_VALUE);
		System.out.println("int형의 최소값:"+ Integer.MIN_VALUE);
		//진법 변환을 위한 메서드 제공 
		System.out.println("10을 2진수로:"+ Integer.toBinaryString(10));
		System.out.println("10을 8진수로:"+ Integer.toOctalString(10));
		System.out.println("10을 16진수로:"+ Integer.toHexString(10));
	}
}
