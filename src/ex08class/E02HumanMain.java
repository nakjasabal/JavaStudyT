package ex08class;

public class E02HumanMain {

	public static void main(String[] args) {
		
		/*
		1.클래스를 통해 인스턴스 생성. 참조변수(인스턴스형 변수)는
			스택에, 인스턴스는 힙에 생성된다. */
		Human human = new Human();
		
		/*
		2.인스턴스 초기화 : 멤버변수를 통해 .(닷)으로 접근하여 초기값을
			할당한다. */
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;
		
		human.showState();//-> 객체의 초기상태를 확인
		human.eating();
		human.walking();
		human.thinking();
		human.showState();//->멤버메서드 호출 후 객체의 상태 확인
		//에너지가 3으로 출력된다. 
		
		/*
		4.반복문을 통해 멤버메서드를 여러번 호출한다. 시나리오에서
			제시한 조건들이 정확히 구현되었는지 확인한다. */
		for(int i=1 ; i<=20 ; i++) {
			human.walking();
		}
		human.showState();		
		for(int i=1 ; i<=20 ; i++) {
			human.eating();
		}
		human.showState();
	}
}
