package ex09package.study.area;

//원의 넓이를 계산하는 클래스 
public class Circle {
	//멤버변수 : 반지름
	double rad;
	//멤버상수 : 원주율 
	final double PI;
	//생성자 메서드 
	public Circle(double rad){
		//멤버 변수와 상수를 초기화 
		this.rad = rad;
		PI = 3.14159;
	}
	//넓이 계산
	public double getArea(){
		return PI * rad * rad;
	}	
}



