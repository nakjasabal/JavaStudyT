package ex13interface;

abstract class A {
	//오버라이딩 목적(추상메서드)
	abstract void overFunc() ;
}
//A를 상속하면 B도 추상메서드를 포함하게 됨.
class B extends A {
	//B를 abstract로 선언하면 인스턴스 생성이 안되므로
	//오버라이딩으로 부모의 추상메서드를 가린다. 
	@Override
	void overFunc() {
		
	}
	//이렇게 하면 B로 인스턴스 생성을 할수있다. 
}
public class Test {
	public static void main(String[] args) {
		//A a = new A();
		B b = new B();
	}
}
