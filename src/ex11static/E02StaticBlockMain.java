package ex11static;

/*
static 블럭
: 동일 클래스내 main() 메서드 보다 먼저 실행되는 블럭으로 main()
메서드의 실행코드가 없어도 먼저 실행된다. 또한 생성자보다도 먼저 
실행되는 특징이 있다. */
public class E02StaticBlockMain {
	
	//인스턴스형 멤버 
	int instanceVar;
	void instanceMethod() {}
 
	//정적 멤버 
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
 
	//static 블럭 정의 
	static {
		//블럭내에서 정적변수에 접근할 수 있다. 
		staticVar = 1000;		
 
		/*
		블럭내에서만 사용할 수 있는 변수로써, 블럭내에서는 일반변수를
		생성할 수 있다. */
		int localVar;
		localVar = 1000;
		System.out.println("localVar="+ localVar); 
		
		/*
		static 블럭내에서는 인스턴스형 멤버를 사용할 수 없다. */
		//System.out.println("instanceVar="+ instanceVar);//에러  
		//instanceMethod();//에러 
		
		//정적 멤버는 사용할 수 있다. 
		System.out.println("staticVar="+ staticVar);
		staticMethod();
		
		System.out.println("===static block 끝===");
	}
 
	/*
	생성자 메서드 정의 : 생성자에서는 정적멤버에 접근이 가능하다. 
		일반적인 멤버변수와 동일하다. */
	public E02StaticBlockMain() { 
		staticVar = -1;
		System.out.println("==StaticBlock의 생성자==");
	}
		
	public static void main(String[] args) {
		
		System.out.println("==메인메서드 실행==");
		/*
		static 블럭내에서 선언된 변수는 지역변수이므로 main메서드
		에서는 사용할 수 없다. static 블럭 지역내에서만 사용할 수 
		있다. */
		//System.out.println("localVar="+ localVar);//에러
		
		//new를 통해 인스턴스를 생성한다. 
		new E02StaticBlockMain();
	}
}


