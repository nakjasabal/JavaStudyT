package ex13interface.figure;

/*
가로(밑변), 세로(높이)를 멤버로 정의한 클래스로 삼각형, 사각형
클래스에서 상속하여 사용한다. */
public class FigureData {
	int width, height;
	public FigureData(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
