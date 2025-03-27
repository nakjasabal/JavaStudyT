package ex08class;

class Triangle {
	/* 개발자가 생성자를 별도로 선언하지 않으면 
	디폴트 생성자는 자동으로 생성된다. 디폴트 생성자는 아래와 같이
	매개변수도 없고 실행부도 없는 형태이다. */
	//public Triangle() {}
	
	//멤버변수
	int bottom;//밑변
	int height;//높이
	
	//초기화 메서드 : 멤버변수를 초기화 한다. 
	void init(int bot, int height) {
		//매개변수와 멤버변수명이 다르면 this가 없어도 된다. 
		bottom = bot;
		//만약 이름이 같다면 멤버변수를 가리키는 this를 추가한다. 
		this.height = height;
	}
	
	//삼각형의 넓이(밑변 * 높이 * 1/2)
	/* 삼각형의 넓이는 0.5를 곱하는 연산, 즉 실수의 결과가 나올
	확율이 높으므로 반환타입은 double로 하는것이 좋다. */
	double getArea() {
		return bottom * height * 0.5;
	}
	
	//밑변과 높이를 설정하는 멤버 메서드 
	void setBottom(int bottom) {
		this.bottom = bottom;
	}
	void setHeight(int height) {
		this.height = height;
	}
}

public class QuTriangle {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}


}
