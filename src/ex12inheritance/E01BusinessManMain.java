package ex12inheritance;

/*
2개의 클래스가 상속관계에 있을때 가장 기본이 되는 코드는 아래와 같다. 
디폴트 생성자는 자동으로 삽입되고, 자식쪽에 super()도 자동으로 삽입
될 수 있으므로 생략 가능한 코드가 존재한다. 
class AA{
	public AA() {} //생략가능
}
class BB extends AA {
	public BB() { //생략가능
		super(); //생략가능 
	}
}
*/

/*
상속(Inheritance)
: 기존에 정의된 클래스에 메서드와 변수를 추가하여 새로운 클래스를
정의하는것을 말한다. 부모클래스를 자식클래스가 상속할때 extends
를 사용한다. */

//부모(상위)클래스 : 사람의 일반적인 형태를 추상화 
class Man{
	//멤버변수는 private이므로 클래스 내부에서만 접근 가능 
	private String name;
	
	//생성자는 오버로딩으로 2개를 정의 
	public Man() {
		System.out.println("Man클래스 디폴트 생성자 호출됨");
	}
	//각 생성자는 print()를 통해 호출여부를 확인할 수 있다. 
	public Man(String name) {
		this.name = name;
		System.out.println("Man 클래스 인자 생성자 호출됨");
	}
	//멤버메서드
	public void tellYourName() {
		//private 멤버라도 동일 클래스 내에서는 접근 가능 
		System.out.println("내 이름은 "+ name +" 입니다.");
	}
}

//자식(하위)클래스 : Man 클래스를 상속받아 회사원을 추상화 
class BusinessMan extends Man {
	//멤버변수 : 회사명, 직급 
	private String company;
	private String position;
	
	//생성자 : 멤버변수는 2개지만 매개변수는 3개로 선언 
	public BusinessMan(String name, String company, String position) {
		/*
		상속받은 자식클래스는 부모클래스의 생성자를 호출하여 부모인스턴스
		가 메모리에 먼저 생성되도록 해야한다. super()는 부모클래스의 
		생성자를 호출해준다. 만약 super()를 기술하지 않으면 컴파일러에
		의해 자동으로 삽입되어 디폴트 생성자를 호출하게된다. */

		//부모클래스의 매개변수 1개인 생성자 호출(메모리에 먼저 생성됨) 
		super(name);
		//남은 2개를 통해 자식쪽의 멤버변수를 초기화한다. 
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan 생성자 호출");
	}
	
	public void tellYourInfo() {
		//자식 클래스의 멤버이므로 접근할 수 있다. 
		System.out.println("회사명은 "+ company +" 입니다.");
		System.out.println("직급은 "+ position +" 입니다.");
		/*
		부모클래스의 멤버변수 name은 private으로 선언되었으므로 
		상속받은 자식클래스에 접근할 수 없다. private멤버는 무조건
		자신의 클래스 내부에서만 접근할 수 있다. */
		//System.out.println("이름은 "+ name +" 입니다.");
		/*
		직접 접근이 안되므로 public으로 선언된 메서드를 통해 간접적으로
		접근해야한다. */
		tellYourName();
	}
}

public class E01BusinessManMain{
	
	public static void main(String[] args) {
		//자식클래스를 통해 2개의 인스턴스를 생성한다. 
		BusinessMan man1 = new BusinessMan("김천국","NAVER", "팀장");
		BusinessMan man2 = new BusinessMan("이낙원","DAUM", "부장");
		
		//회사정보, 이름까지 출력
		man1.tellYourInfo();
		//이름만 출력 
		man1.tellYourName(); 
		
		man2.tellYourInfo();
		man2.tellYourName();
	}
}

