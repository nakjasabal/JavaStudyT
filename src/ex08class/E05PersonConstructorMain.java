package ex08class;

public class E05PersonConstructorMain {

	public static void main(String[] args) {

		//기본생성자를 통해 인스턴스 생성 
		PersonConstructor person1 = 
				new PersonConstructor();
		System.out.println("[멤버변수 초기화용 메소드 호출전]");
		person1.showPersonInfo();
		System.out.println("[멤버변수 초기화용 메소드 호출후]");
		//기존 생성한 person1을 초기화 메서드를 통해 값 변경 
		person1.initialize("홍길동", 20, "논현동");
		person1.showPersonInfo();
		
		/*
		인스턴스 생성시 초기화 메서드를 사용하면 생성과 초기화를 별도로
		진행해야한다. 하지만 생성자를 사용하면 생성과 초기화를 동시에
		진행할 수 있으므로 편리하다. */
		
		/*
		오버로딩으로 정의된 각각의 생성자를 통해 인스턴스 생성 및 
		초기화를 동시에 진행한다. */
		System.out.println("[이름만 전달한 값으로 초기화하기]");
		PersonConstructor person2 = 
				new PersonConstructor("박길동");
		person2.showPersonInfo();

		System.out.println("[이름과 나이만 전달한 값으로 초기화하기]");
		PersonConstructor person3 = 
				new PersonConstructor("최길동", 40);
		person3.showPersonInfo();

		System.out.println("[모든 매개변수를 전달한 값으로 초기화하기]");
		PersonConstructor person4 = 
				new PersonConstructor("박길동", 50, "가산동");
		person4.showPersonInfo();
	}
}


