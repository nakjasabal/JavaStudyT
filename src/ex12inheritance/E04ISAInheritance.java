package ex12inheritance;

/*
Is-A관계
: X is a Y -> X는 Y의 일종이다로 표현가능한 관계
-노트북은 컴퓨터의 일종이다.
-휴대폰은 전화기의 일종이다. 
이와 같이 Is-A관계가 성립하는 객체를 상속으로 표현하기에 적합하다.
따라서 실제 업무에서도 유사한 기능의 클래스들을 상속으로 묶어서 정의
하는것이 좋다. 
 */

//컴퓨터 : 기본적인 컴퓨팅 환경을 제공하여 입력된 내용을 계산한다. 
class Computer{
	//멤버변수 : 소유주 
	String owner; 
	
	//디폴트생성자 
	//public Computer() {}
	/*
	매개변수가 있는 인자생성자 추가. 이 경우 디폴트 생성자는 추가되지
	않는다. */
	public Computer(String name) {
		owner = name;
	}
	/*
	private 접근지정자로 선언된 멤버메서드는 외부클래스 혹은 
	상속받은 클래스에서 접근이 불가능하므로, public으로 선언된
	메서드를 통해 간접적으로 호출해야한다. */
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력한 ");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다.");
	} 
	/*
	private으로 선언된 멤버메서드를 외부에서 호출할 수 있도록 
	public으로 지정하여 선언한 메서드. 2개의 업무를 하나로 묶었으므로
	"캡슐화" 되었다고 볼수있다. */
	public void calculateFunc() {
		keyboardTouch();//입력한 후
		calculate();//계산을 수행한다. 
	}
}
/*
컴퓨터를 상속한 노트북
: 컴퓨터가 가진 기본 계산기능에 휴대성을 확장하여 정의한다. 휴대하기
위해서 베터리가 필요하므로 멤버변수로 확장하였다. */
class NotebookComputer extends Computer {
	int battery;  
	
	//생성자
	public NotebookComputer(String name, int initCharge) {
		/*
		부모클래스의 생성자를 호출하는 super()는 생략할 수 있지만,
		앞에 다른 문장이 먼저 기술되면 에러가 발생된다. 항상 부모의 
		생성자를 최우선으로 호출해야한다. */
		super(name);
		battery = initCharge;
	}
	//충전을 표현 
	public void charging() {
		battery += 5;
	}
	//휴대하면서 컴퓨터를 사용 
	public void movingCal() {
		//사용전 배터리를 확인한 후 사용여부를 판단
		if(battery < 1) {
			/*
			방전된 상태라면 사용이 불가하므로 return을 통해 해당
			메서드의 실행을 중지한다. */
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		
		System.out.print("이동하면서 ");
		/*
		아래 2개의 메서드는 private으로 선언되었으므로 상속받은
		자식클래스에서도 접근할 수 없어 에러가 발생한다. 이 경우
		public으로 선언된 메서드를 통해 간접 호출해야한다. */
		//keyboardTouch(); 	//에러
		//calculate();		//발생
		calculateFunc();
		
		//배터리를 1 차감한다. 
		battery -= 1;  
	}
}
/*
테블릿 : 컴퓨터의 기본 계산기능과, 휴대이용 그리고 전용펜으로 
	드로잉 할수있는 기능까지 추가된 컴퓨터를 표현 */
class TabletNotebook extends NotebookComputer{
	//테블릿 사용을 위한 펜을 표현 
	String registPencil;  
	//생성자 
	public TabletNotebook(String name, int initCharge,
			String pen) {
		super(name, initCharge);
		registPencil = pen;
	}
	//테블릿 사용을 위한 베터리 체크 및 등록된 펜인지 확인 
	public void write(String penInfo) {
		//베터리가 충분한지 확인 
		if(battery<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		/*
		등록된 펜인지 문자열 비교를 통해 확인 
		A.compareTo(B) 는 일치하는 경우 0을 반환한다. */
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		/*
		부모클래스에 정의된 메서드를 호출한다. 상속받은 자식 클래스
		에서는 이와같이 부모의 멤버메서드를 호출하여 자신의 기능처럼
		사용할 수 있다. 단 접근이 가능한 지정자로 선언되어야 한다. 
		super는 생략할 수 있다. */
		super.movingCal();
		System.out.println("스크린에 펜으로 그림을 그린다.");
		battery -= 1;
	}
}

public class E04ISAInheritance {
	
	public static void main(String[] args) {

		//노트북 인스턴스 생성
		NotebookComputer noteBook = 
				new NotebookComputer("공유", 5);
		//테블릿 인스턴스 생성 
		TabletNotebook tablet = 
				new TabletNotebook("이동욱", 5, "ISE-1234");

		System.out.println("==노트북컴퓨터사용==");	
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();//배터리가 1씩 차감되므로 여기까지 사용가능	
		noteBook.movingCal();//배터리가 모두 소모되어 사용불가
		noteBook.movingCal();
		noteBook.movingCal();

		System.out.println("==ISE-1234 펜으로 테블릿사용==");
		tablet.write("ISE-1234"); //사용가능

		System.out.println("==XYZ-9876 펜으로 테블릿사용==");
		tablet.write("XYZ-9876"); //사용불가
	}
}


