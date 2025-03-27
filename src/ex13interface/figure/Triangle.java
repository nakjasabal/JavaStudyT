package ex13interface.figure;

/*
삼각형을 표현한 클래스로 사각형과 동일한 형태로 정의되어있다. 
단, 넓이를 구하는 방식만 다르므로 오버라이딩 한 메서드에서 0.5를 추가로
곱해준다. */
public class Triangle extends FigureData 
		implements IFigure, IDrawable{

	public Triangle(int width, int height) {
		super(width, height);
	}
	@Override
	public void draw(String figureName) {
		System.out.println(figureName +"을(를) 그려봅니다");
	}	
	@Override
	public void area(String figureName) {
		System.out.println(figureName +"의 면적은(밑변*높이*0.5):"
				+ (width*height*0.5));
	}
}
