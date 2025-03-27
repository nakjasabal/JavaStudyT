package ex11static;

/*
싱글톤 디자인패턴 
: 클래스를 설계하는 디자인패턴의 하나로써 하나의 인스턴스 즉 하나의 
메모리를 할당한 후 이를 프로그램 전체에서 공유해서 사용할때 쓰는 패턴

작성방법
1.생성자의 접근지정자를 private으로 선언
2.클래스 외부에서는 생성자에 접근할 수 없으므로 new를 통해 인스턴스
	생성을 할 수 없다. 
3.클래스 내부에 멤버변수를 static으로 선언하여 인스턴스를 미리 생성해
	놓는다. 
4.getInstance()라는 유틸리티 메서드를 통해 참조값을 반환받아 사용한다. 
5.이 방법을 통해 인스턴스를 생성하면 메모리에 딱 하나만 만들어지게 되므로
	메모리를 절약할 수 있다. 
 */

//일반적인 클래스 정의 
class NoSingleTone {
	int instVar;
	/*
	생성자는 거의 대부분 public으로 선언한다. 만약 public으로
	선언하지 않으면 클래스 외부 혹은 다른 패키지에서는 호출할 수 없기
	때문에 new 를통해 인스턴스 생성 자체가 불가능하기 때문이다. */
	public NoSingleTone() {}
}

//싱글톤 패턴이 적용된 클래스 정의 
class SingleTone {
	//일반적인 멤버변수 선언 
	int shareVar;
	/*
	정의한 클래스와 동일한 타입으로 선언된 정적 멤버변수로 JVM(자바가상
	머신)에 의해 프로그램이 시작될때 미리 Method영역에 로드되어 사용할
	준비를 마치게된다. */
	private static SingleTone single = new SingleTone();
	
	/*
	생성자를 private으로 선언하면 클래스 외부에서는 호출할 수 없으므로 
	new를 통해 인스턴스 생성을 할 수 없다. */
	private SingleTone() {}
	
	/*
	정적메서드로 선언된 getInstance()를 통해 해당 인스턴스의 참조값을
	외부로 반환한다. 이런 메서드를 "유틸리티 메서드"라고 한다. */
	public static SingleTone getInstance() {
		return single;
	}	
	
	//멤버변수 출력용 메서드 
	void print() {
		System.out.println(
			String.format("shareVar=%d", shareVar));
	}
}
public class E03SingleToneDesignPattern {
	
	public static void main(String[] args) {	
		
		/*
		일반적인 방식의 인스턴스 생성이므로, new로 생성할때마다 새로운
		참조값을 할당받게된다. */
		NoSingleTone nst1 = new NoSingleTone();
		//멤버변수는 각 인스턴스 내부에 개별적으로 존재한다. 
		nst1.instVar = 100;
		System.out.println("nst1="+ nst1);
		
		NoSingleTone nst2 = new NoSingleTone();
		nst2.instVar = 200;
		System.out.println("nst2="+ nst2);
		
		/*
		생성자가 private이므로 새로운 인스턴스를 생성할 수 없다. 
		"not visible" 즉 보이지 않는다는 에러가 발생한다. */
		//SingleTone st1 = new SingleTone();//에러발생 
	 
		/*
		정적메서드이므로 클래스명을 통해 직접 호출할 수 있다. 해당
		메서드 호출을 통해 싱글톤 인스턴스의 참조값을 얻어올 수 있다. */
		//여기에서 얻어오는 참조값과 ...
		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar = 100;
		st2.print();
		//여기에서 얻어오는 참조값은 둘 다 동일하다. 
		SingleTone st3 = SingleTone.getInstance();
		st3.shareVar = 200;
		st3.print(); 
		
		//싱글톤 인스턴스이므로 동일한 참조값이 출력된다. 
		System.out.println(String.format("st2의주소:%s", st2));
		System.out.println(String.format("st3의주소:%s", st3));
		
		/*
		결국 동일한 인스턴스를 사용한 것이므로 마지막에 할당된 값이
		출력된다. */
		System.out.println(String.format("st2의 shareVar:%d", 
				st2.shareVar));//200
		System.out.println(String.format("st3의 shareVar:%d", 
				st3.shareVar));//200
	}
}




