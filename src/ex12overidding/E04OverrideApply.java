package ex12overidding;

public class E04OverrideApply {

	public static void main(String[] args) {
		
		/*
		err을 사용하면 콘솔에 빨간색으로 표시된다. 주로 디버깅용으로 
		사용하거나 출력문장을 구분할때 사용한다. */
		System.err.println("Child형 참조변수로 Child객체 참조");
		//자식 인스턴스를 자식 참조변수를 통해 참조한다.(동일한 타입)
		DeChild child = 
				new DeChild("율곡이이", 49, "00학번");
		
		/*
		오버라이딩 처리된 메서드이므로 참조변수와 상관없이 항상 
		자식쪽 메서드가 호출된다. 메서드 오버라이딩은 자식쪽에 정의한
		메서드가 부모쪽에 정의된 메서드를 가리게된다. 따라서 오버라이딩된
		메서드를 호출할때는 참조변수의 영향을 받지않는다.  */
		child.excecise();
		child.sleep();
		child.printParent();
		//자식쪽에서 확장한 메서드로 부모에는 정의되어 있지 않다. 
		child.study();
		//부모쪽에 정의된 메서드로 매개변수 없음 
		child.walk();
		//자식쪽에 정의된 메서드로 오버로딩으로 정의됨 
		child.walk(25);
		/*
		정적메서드는 클래스명을 통해 호출한다. static의 기본
		규칙을 따르고, 오버라이딩의 대상이 될수없다. */
		DeChild.staticMethod();

		/////////////////////////////////////////
		System.err.println("Parent형 참조변수로 Child객체 참조");
		/*
		부모타입의 참조변수를 통해 자식 인스턴스를 참조한다. 두 클래스가
		상속관계에 있기때문에 가능하다. (서로 타입이 틀림) */
		DeParent parent = 
				new DeChild("퇴계이황", 35, "99학번");
		
		/*
		오버라이딩 처리된 메서드이므로 참조변수에 상관없이
		자식쪽 메서드가 호출된다. 
		자식 인스턴스가 생성될때 부모쪽의 메서드가 가려지므로
		참조변수의 영향을 전혀 받지 않는다. */
		parent.excecise();
		parent.sleep();
		parent.printParent();
		
		/*
		부모클래스의 참조변수로 자식인스턴스를 참조하면 부모의
		영역까지만 접근할 수 있으므로 자식영역에 정의된 메서드는
		호출할 수 없다. */
		//parent.study(); //에러발생
		parent.walk();
		//parent.walk(20); //에러발생
		
		//정적메서드는 오버라이딩 되지않는다. 클래스명으로 호출한다. 
		DeParent.staticMethod();
	}
}




