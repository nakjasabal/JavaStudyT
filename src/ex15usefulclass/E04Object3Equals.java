package ex15usefulclass;

import java.util.Objects;

class MyClass {	
	int data;
	public MyClass(int data) {
		this.data = data;
	}
	//인스턴스가 가진 데이터를 String으로 반환해준다.  
	@Override
	public String toString() {
		//정수를 String으로 변경해서 반환한다. 
		return String.valueOf(data);
		//이런 방법도 있다. 
		//return ""+data;
	}
	/*
	MyClass 인스턴스간의 내용 비교를 위해 equals()를 오버라이딩하여
	재정의 한다. 인스턴스가 가진 멤버변수의 값에 대한 비교를 통해 동일
	여부를 판단한다. equals() 메서드의 매개변수 타입은 모든 인스턴스를
	대상으로 하므로 Object형으로 정의되어 있다. */
//	@Override
//	public boolean equals(Object obj) {
//		/*
//		매개변수로 전달된 인스턴스를 Object로 받으면 업캐스팅이 되므로
//		다운캐스팅 이후에 비교를 해야한다. 
//		이때 전달된 인스턴스가 MyClass형이 아니라면 비교의 대상이 
//		될 수 없으므로 상속관계 확인을 위해 instanceof 연산자를
//		사용한다. */
//		if(obj instanceof MyClass) {
//			/*
//			매개변수가 MyClas 타입이 맞다면 비교를 위해 다운캐스팅한다.
//			그렇지 않으면 부모타입으로는 자식 멤버에 접근할 수 없으므로
//			멤버변수에 대한 비교가 불가능한다. */
//			MyClass mc = (MyClass)obj;
//			//멤버변수의 값을 비교하여 boolean을 반환한다. 
//			if(mc.data == this.data) {
//				System.out.println("MyClass-멤버동일함");
//				return true;  
//			}
//			else {
//				System.out.println("MyClass-멤버다름");
//				return false;  
//			}
//		}
//		else {
//			/*
//			매개변수로 전달된 인스턴스가 MyClass 타입이 아니라면
//			비교의 대상이 될수없으므로 false를 반환한다. */
//			System.out.println("MyClass객체아님");
//			return false;
//		}
//	}
}

public class E04Object3Equals {

	public static void main(String[] args) {

		//2개의 동일한 인스턴스 생성 
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);

		System.out.println("[두 객체를 비교연산자를 통해 비교]");
		//참조값에 대한 비교이므로 '다르다'는 결과가 출력됨 
		if(mc1==mc2) {
			System.out.println("인스턴스 참조값(주소값)이 같다");
		}
		else {
			System.out.println("인스턴스 참조값(주소값)이 다르다");//[O]
		}
		
		/*
		인스턴스의 내용을 비교하므로 같다고 출력된다. 
		단, 오버라이딩 해놓은 equals()를 삭제한 후 비교하면 다르다는
		결과가 나오게 된다. 즉 우리가 직접 정의한 클래스라면 반드시
		오버라이딩이 필요하다. */
		System.out.println("[두 객체를 equals()메소드로 비교]");		
		System.out.println(mc1.equals(mc2) 
				? "같다" : "다르다");//[같다]
		
		/*
		print를 통해 출력하면 자동으로 toString이 호출되므로 아래의
		출력결과는 둘다 동일하다. */
		System.out.println("[두 객체의 toString()메소드 호출]");
		System.out.println("mc1.toString()=>"+ mc1.toString());
		System.out.println("mc2=>"+ mc2);
		
	}
}
