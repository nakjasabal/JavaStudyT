package ex12inheritance.map;

//부모클래스 : 자식클래스와 다른 패키지에 정의  
public class Korea {
	//멤버변수, 생성자 정의 
	private String name;
	public Korea(String name) {
		this.name = name;
	}
	//4가지의 접근지정자를 통해 멤버메서드 정의 
	public void publicMethod(String loc) {
		/*
		public으로 선언된 멤버메서드는 어디서든 접근이 가능하다. 
		동일패키지, 다른패키지, 외부클래스, 상속 등 모든 영역에서 
		접근할 수 있다. */
		System.out.println(loc +"publicMethod() 호출");
		/*
		default로 선언된 메서드는 패키지가 다른 클래스에서는
		호출할 수 없으므로 해당 메서드를 통해 간접 호출해야한다. */
		defaultMethod("publicMethod->");
	}
	protected void protectedMethod(String loc) {
		/*
		서로 패키지가 다른 2개의 클래스가 상속관계를 가지고 있다면
		접근을 허용한다. 즉 default 접근지정자보다는 넓은 접근범위를
		가진다. */
		System.out.println(loc +"protectedMethod() 호출");
		privateMethod("protectedMethod->");
	}
	void defaultMethod(String loc) {
		/*
		패키지가 동일할때만 접근을 허용한다. 패키지가 다른 경우
		상속관계가 아니라면 public으로 선언해야 접근할 수 있다. */
		System.out.println(loc +"defaultMethod() 호출");
	}
	/*
	동일 클래스 내부에서만 접근을 허용한다. 즉 멤버 이외에는 아무도
	접근할 수 없다. */
	private void privateMethod(String loc) {
		System.out.println(loc +"privateMethod() 호출");
	}
}





