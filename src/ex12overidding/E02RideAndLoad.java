package ex12overidding;

/*
상속관계에서 오버로딩 vs 오버라이딩
오버로딩 : 메서드명은 같지만 매개변수의 타입, 갯수, 순서가 다른 경우를
	말한다. 즉, 서로 다른 메서드이므로 상속받은 하위클래스에는 오버로딩
	된 모든 메서드가 포함된다. 
오버라이딩 : 메서드명, 매개변수, 반환형까지 모두 동일한 메서드를 상속관계
	에 있는 하위클래스에서 재정의 한것을 말한다. 
	이 경우 하위클래스에서 정의한 메서드가 상위클래스의 메서드를 가리게
	되므로, 항상 최하위 클래스의 메서드가 호출된다. 즉 오버라이딩된
	메서드는 참조변수의 타입에 영향을 받지 않는다. 
 */
class A {
	public void rideMethod() {
		System.out.println("A의 rideMethod");
	}
	public void loadMethod() {
		System.out.println("A의 loadMethod");
	}
}
class B extends A {
	@Override
	public void rideMethod() {
		System.out.println("B의 rideMethod");
	}
	public void loadMethod(int num) {
		System.out.println("B의 loadMethod");
	}
}
class C extends B {
	/*
	ride메서드는 오버라이딩 정의된 메서드로 상위클래스에서 정의된
	멤버메서드와 반환형, 메서드명, 매개변수의 갯수 및 타입이 모두
	동일하다. 즉 똑같은 메서드이다. */
	@Override
	public void rideMethod() {
		System.out.println("C의 rideMethod");
	} 
	/*
	load메서드는 오버로딩으로 정의했으므로 메서드명만 동일할뿐 매개변수의
	타입, 갯수 등이 다르다. 따라서 서로 다른 메서드이다. */
	public void loadMethod(double num) {
		System.out.println("C의 loadMethod");
	}
	/*
	따라서 C클래스로 인스턴스를 생성하면 오버라이딩된 메서드는 모두 
	가려지므로 1개만 남게되고, 오버로딩된 메서드는 3개 모두 존재하게 
	된다. 따라서 C인스턴스에는 4개의 메서드가 존재한다. */
}
public class E02RideAndLoad {

	public static void main(String[] args) {

		/*
		부모타입의 참조변수로 자식인스턴스를 참조할 수 있으므로 아래 
		문장은 모두 성립된다. */
		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
		/*
		참조변수에 상관없이 항상 최하위에 오버라이딩 된 메서드가 호출된다.
		즉 아래에서는 모두 C클래스에 정의된 rideMethod가 호출된 결과가
		출력된다. 
		'오버라이딩'은 참조변수의 영향을 받지않는다. */
		System.out.println("오버라이딩 처리된 메소드");
		ref1.rideMethod(); 
		ref2.rideMethod(); 
		ref3.rideMethod(); 

		System.out.println("오버로딩 처리된 메소드");
		/*
		C타입의 참조변수를 통해서 인스턴스를 참조하면 모든 영역에
		접근할 수 있다. 따라서 아래 3개의 문장은 모두 실행된다. */
		ref3.loadMethod(); 
		ref3.loadMethod(1);  
		ref3.loadMethod(1.1);
		
		//B타입으로는 접근범위가 B클래스까지로 제한된다. 
		ref2.loadMethod();
		ref2.loadMethod(1); 
		//ref2.loadMethod(1.1); 
		
		//A타입으로는 A클래스까지만 접근된다. 
		ref1.loadMethod();  
		//ref1.loadMethod(1); 
		//ref1.loadMethod(1.1);	 
	}
}











