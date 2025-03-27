package ex15usefulclass;

/*
equals()메서드
-자바에서 인스턴스의 내용 비교를 위해 비교연산자(==)를 사용하는것은
단순히 참조값에 대한 비교를 하는것이므로, 실제 내용에 대한 비교가
이루어지지 않는다. 
-인스턴스간의 내용 비교를 위해서는 equals() 메서드를 각 클래스에 맞게
오버라이딩하여 사용해야 한다. 
-String과 같은 기본클래스는 별도의 오버라이딩 없이도 내용비교가 가능하다.
 */
class IntNumber {
	int num;
	public IntNumber(int num) {
		this.num = num;
	}
	/*
	equals() 메서드가 어떻게 인스턴스간의 내용을 비교하는지 설명하기
	위한 코드를 기술함. 
	 */
	//비교를 위해 IntNumber타입의 인스턴스를 매개변수로 받은 후
	public boolean myEquals(IntNumber numObj) {
		//매개변수로 받은 인스턴스와 멤버변수의 값을 비교한다. 
		if(this.num==numObj.num) {
			//값이 동일하면 true
			return true;  
		}
		else {
			//다르면 false를 반환한다. 
			return false; 
		}
	}
}
public class E04Object2MyEquals {

	public static void main(String[] args) {
		
		/*
		String 과 같은 기본클래스는 별도의 오버라이딩 없이도 내용
		비교가 가능하다. */
		String str1 = new String("Java개발자");
		String str2 = "Java개발자";	
		if(str1.equals(str2)) {
			System.out.println("같은 문자열 입니다.");//결과출력
		}
		else {
			System.out.println("다른 문자열 입니다.");
		}
		
		//정의한 클래스를 통해 인스턴스를 생성한다. 
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		/*
		개발자가 직접 정의한 myEquals를 통해 인스턴스간의 내용비교를
		한다. 여기서는 다르다고 나온다. */
		if(num1.myEquals(num2)) {
			System.out.println("num1과 num2는 동일한 정수");
		}
		else {
			System.out.println("num1과 num2는 다른 정수");//결과출력
		}
		
		/*
		인스턴스간의 비교를 할때는 단순히 참조변수에 대한 비교를 하면
		안되고, 실제 내용에 대한 비교를 해야한다. 즉 멤버변수끼리 
		비교해서 판단해야한다. */
		if(num1.myEquals(num3)) {
			System.out.println("num1과 num3은 동일한 정수");//결과출력
		}
		else {
			System.out.println("num1과 num3은 다른 정수");
		}
	}
}
