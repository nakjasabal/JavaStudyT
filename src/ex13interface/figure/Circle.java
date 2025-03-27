package ex13interface.figure;
 
/*
원은 반지름만 있으면 넓이를 구할 수 있으므로 FigureData 클래스를
상속하지 않는다. */
public class Circle implements IFigure, IDrawable {
	//반지름을 표현한 멤버변수와 생성자 
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	/*
	2개의 인터페이스를 구현했으므로 추상메서드를 반드시 오버라이딩
	해야한다. */
	@Override
	public void draw(String figureName) {
		System.out.println(figureName +"을 그립니다");
	}
	@Override
	public void area(String figureName) {
		/*
		Math.PI : Math클래스의 static 상수로 원주율을 표현한다. 
		 */
		System.out.println(figureName +"의 면적(r*r*PI):"+
				radius*radius*Math.PI);
	}
}




