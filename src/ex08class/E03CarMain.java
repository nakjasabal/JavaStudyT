package ex08class;

/*
이 예제에서는 Human클래스를 별도의 파일로 작성하였다. 동일한 패키지에
정의되었다면 컴파일러는 해당 클래스를 찾아 즉시 인스턴스로 만들수있다. 
만약 다른 패키지에 선언된 클래스라면 반드시 import 선언을 해야한다. */
class Car {
	//멤버변수 : 모델명, 소유주 
	String carModel;
	Human owner;
	/*
	소유주를 표현한 멤버변수는 Human 타입으로 정의한다. 우리가 직접
	작성한 클래스는 객체를 표현하기 위해 생성하지만, Java에서는 
	하나의 자료형으로 사용된다. 즉 객체를 추상화 한 또 하나의 자료형을
	생성하는것이 class를 만드는 목적이라 할수있다. */
	
	/*
	초기화 메서드1 : 매개변수가 없는 형태로 항상 고정된 값으로만 
		인스턴스를 초기화할 수 있다. 따라서 확장성이 없는 형태이다. */
	void initialize() {
		carModel = "람보르기니";
		owner = new Human();
		owner.name = "스티브로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	/*
	초기화 메서드2 : 위와 동일한 이름의 메서드로 오버로딩에 의해
		정의되어있다. 초기화를 진행하는 역할은 동일하나, 매개변수를 통해
		다양한 값으로 초기화할 수 있다. */
	void initialize(String model, int year, String name, int age, int energy) {
		carModel = model;	
		/*
		자동차 소유주를 표현한 Human타입의 멤버변수는 아직 인스턴스를
		생성하지 않은 상태이므로, 초기화를 위해 인스턴스를 생성한 후
		초기화를 진행하고 있다. */
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	//"운전"을 표현한 멤버메서드 
	void drive() {
		/*
		owner는 인스턴스 이므로 이름을 출력하기 위해 변수명.name
		과 같이 기술한다. */
		System.out.println(owner.name +"이(가) "+ 
				carModel +"을 운전한다.");
	}
	//객체의 현재상태를 출력
	void showCarInfo() {
		System.out.println("[차량정보]");
		//모델명은 Car의 멤버변수이므로 즉시 사용할 수 있다. 
		System.out.printf("모델명:%s\n", carModel);
		/*
		소유주는 owner 인스턴스에 정의된 멤버메서드를 호출하여 
		상태를 출력할 수 있다. */
		owner.showState();
	}
}////end of Car Class

public class E03CarMain {

	public static void main(String[] args) {
		
		/*
		자동차객체1 생성 : 매개변수가 없는 초기화 메서드를 호출하므로
			'람보르기니'로 초기화된다. */
		Car car1 = new Car();
		car1.initialize();
		car1.showCarInfo();

		/*
		자동차객체2 생성 : 초기화 메서드를 호출하는 대신 멤버변수에 
			직접 접근하여 인스턴스를 초기화한다. 이 경우 인스턴를 
			생성할때마다 동일한 코드를 작성해야 하므로 비효율적이다. 
			따라서 이 방법은 사용하지 않는것이 좋다. */
		Car car2 = new Car();
		car2.carModel = "밴틀리";
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		car2.showCarInfo();
		
		/*
		자동차객체3 생성 : 매개변수가 있는 초기화 메서드를 사용해서
		 인스턴스를 초기화한다. 이 경우 매개변수를 통해 다양한 값을
		 전달할 수 있으므로 가장 효율적인 코드라 할 수 있다. 
		 */
		Car car3 = new Car(); 
		car3.initialize("스포츠카", 2012, "성유겸", 8, 10);
		car3.showCarInfo();	
		
		/*
		인스턴스 생성만 하고 초기화하지 않은 상태로 출력을 시도하므로
		예외가 발생된다. */
		Car car4 = new Car(); 		
		car4.showCarInfo();	
	}
}
