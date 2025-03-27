package ex13interface;

import ex13interface.figure.Circle;
import ex13interface.figure.IDrawable;
import ex13interface.figure.IFigure;
import ex13interface.figure.Rectangle;
import ex13interface.figure.Triangle;

public class E05FigureDrawableMain {

	public static void main(String[] args) {
		
		//부모인터페이스의 참조변수로 자식인스턴스를 참조한다. 
		IFigure figure = new Circle(30);
		/*
		오버라이딩 한 메서드는 항상 자식쪽에 정의되니 메서드가 호출되므로
		별도의 형변환없이 사용할 수 있다. */
		figure.area("원");
		/*
		IFigure 인터페이스는 area()만 정의되어 있으므로, draw()를
		호출하려면 캐스팅 해야한다. */
		((Circle)figure).draw("나도 원");
		
		IFigure fig1 = new Rectangle(100, 90);
		fig1.area("사각형");
		((Rectangle)fig1).draw("나도 사각형");

		IDrawable draw = new Triangle(100, 90);
		draw.draw("삼각형");
		((Triangle)draw).area("나도 삼각형");
		
		Circle circle = new Circle(40);
		circle.area("원"); 
		circle.draw("나도 원"); 
	}
}
