package ex14innerclass;
/*
익명클래스(Anonymous class)
-이름이 없는 클래스를 말한다. 
-내부클래스처럼 이벤트 기반의 프로그래밍에서 많이 사용된다. 
-부모클래스의 메서드를 오버라이딩 하는것이 목적이다. 
-클래스를 정의하는것이 마치 메서드를 정의하는것과 비슷하다. 
-마지막에 세미콜론을 기술해야한다. 
형식]
	부모클래스 참조변수 = new 부모클래스(){
		익명클래스의 실행부;
		부모클래스의 메서드 오버라이딩();
	};
	※부모클래스를 상속받아 이름없는 자식클래스를 생성하는 개념으로 
	이해하면된다. 상속되기 때문에 오버라이딩이 가능하다. 
	즉 중괄호 안쪽은 "자식"의 영역이다. 
 */
//가수를 표현한 부모클래스 
class Singer {
	String name;
	public Singer(String name) {
		this.name = name;
	}
	/*
	Object 클래스에 정의된 메서드로 객체가 가진 값을 문자열로 반환해
	준다. Java에서 정의하는 모든 클래스는 Object클래스를 상속하므로
	이와같이 오버라이딩 할 수 있다. */
	@Override
	public String toString() {
		return "이름:"+name;
	}
}
//걸그룹을 표현한 자식클래스 
class GirlGroup extends Singer {
	String team;
	public GirlGroup(String name, String team) {
		super(name);
		this.team = team;
	}
	//부모의 toString()을 호출하기 위해 super를 사용한다. 
	@Override
	public String toString() {
		return super.toString()+", 팀명:"+team;
	}
}
/*
인터페이스 정의 : 기능이 없는 추상메서드만 멤버로 정의할 수 있다. 
	또한 메서드 앞에는 public abstract가 생략되어 있다. */
interface ISinger {
	public void dancing();
}
public class E02AnonymousClass {

	public static void main(String[] args) {
		
		//부모클래스를 통해 인스턴스 생성 
		Singer s1 = new Singer("조용필");
		/*
		인스턴스의 참조값을 할당받은 참조변수를 출력한다. 이때 
		오버라이딩한 toString의 반환값이 출력된다. 만약 toString을
		삭제하면 @를 포함한 참조값이 출력되게된다. */
		System.out.println(s1);
		
		//자식클래스를 통해 인스턴스 생성
		Singer s2 = new GirlGroup("츄", "이달의소녀");
		//자식쪽의 toString이 호출되어 팀명까지 출력된다. 
		System.out.println(s2);
		
		/*
		GirlGroup 클래스를 상속받은 익명클래스 정의
		: Singer타입의 변수에 GirlGroup을 상속받은 익명클래스를
		생성해서 그 주소값을 할당한다. 
		개념적으로 new GirlGroup(){};
			=> 익명 extends GirlGroup 과 같다. 
		이름이 없는 인스턴스이므로 부모클래스의 이름을 빌려서 자식의
		영역을 만든다고 생각하면된다. */
		Singer s3 = new GirlGroup("아이린", "레드벨벳") {
			/* 자식에서 확장한 멤버변수. 해당 변수는 익명클래스 내부
			에서만 사용할 수 있다. */
			boolean mic = true;
			@Override
			public String toString() {
				return super.toString()+", 소속사:SM";
			}
		};
		/*
		부모의 참조변로 자식을 참조할 수 있지만, 접근범위가 부모까지로
		제한된다. 따라서 아래와 같이 자식에서 확장한 멤버변수는 
		접근할 수 없어 에러가 발생한다. 
		접근하고 싶다면 다운캐스팅(강제형변환)을 해야하지만 익명클래스는
		이름이 없기때문에 다운캐스팅 자체가 불가능하다.
		따라서 익명클래스에서는 멤버의 확장은 거의 사용하지 않고, 
		대부분 오버라이딩을 목적으로만 활용된다. */
 		//System.out.println(s3.mic); //에러발생됨.
		System.out.println(s3);
		
		/*
		인터페이스를 구현해서 익명클래스를 정의한다. 오버라이딩이 
		주된 목적이므로, 부모클래스에는 추상메서드만 정의되어 있어도
		아무 상관이 없다. */
		ISinger s4 = new ISinger() {
			@Override
			public void dancing() {
				System.out.println("춤추는게 좋아요~~");
			}
		};
		s4.dancing();
	}
}





