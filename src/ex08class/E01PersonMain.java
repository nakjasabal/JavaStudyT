package ex08class;

/*
추상화(Abstraction) : 현실세계의 사물을 클래스로 형상화하는것을
	뜻한다. Person 클래스는 "사람"의 일반적인 사항을 클래스로
	추상화하고 있다. */

/*
클래스 선언시 class 예약어를 사용한다. 클래스명의 첫글자는 반드시
대문자로 기술해야한다. 또한 public 접근지정자는 하나의 Java 파일에
한번만 사용할 수 있다. public으로 선언되는 클래스는 해당 파일명과 
일치해야한다. 
 */
class Person {	
	/*
	멤버변수 : 클래스에서 주로 속성(데이터)를 표현한다. 사람을 
		추상화한 클래스이므로 이름, 나이 등이 정의되어있다. */
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "영화배우";
	
	/*
	멤버메서드 : 클래스에서 객체의 동작(행위)를 표현한다. 클래스
		외부에서 호출시에는 인스턴스 참조변수를 사용해서 .(닷)으로 
		호출한다. 
		멤버변수는 멤버메서드 내에서 즉시 사용할 수 있다. */
	void eat() {	
		System.out.printf("%s가(이) 식사를 한다\n", name);
	}
	/*
	넓은지역(클래스)에서 생성된 멤버변수는 좁은지역(멤버메서드)에서
	사용할 수 있으므로, 별도의 전달없이 바로 사용이 가능하다. */
	void sleep() {
		System.out.printf("나이가 %d인 %s가(이) 잠자고 있다\n", 
				age, name);
	}
}

public class E01PersonMain {

	public static void main(String[] args) {
		
		/*
		Person 클래스를 통해 인스턴스를 생성한다. 생성시 할당된
		참조값을 반환하고, 좌측항의 참조변수가 그 값을 받게된다. */
		Person person = new Person();
		//여기서는 인스턴스의 참조값이 출력된다. 
		System.out.println("person="+ person);
		
		//인스턴스변수를 통해 멤버메서드를 호출할 수 있다. 
		person.eat();
		person.sleep();
		
		/*
		객체 생성직후 참조변수를 사용하지 않아도, 이와 같이 즉시
		호출할 수 있다. */
		new Person().eat();
		new Person().sleep();
	}
}




