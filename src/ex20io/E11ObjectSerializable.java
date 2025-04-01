package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
직렬화
: Circle 클래스를 입출력의 대상으로 파일로 저장하기 위해서는 
Serializable 인터페이스를 구현하여 정의한다. 인스턴스가 파일의
형태로 저장되는 것을 "직렬화"라고 한다. 만약 상속이 되는 경우라면
부모쪽만 implements 하면된다. */
class Circle implements Serializable {
	//원의 좌표와 반지름을 멤버변수로 정의 
	int xPos, yPos;
	double radian;
	public Circle(int x, int y, double r) {
		xPos = x;
		yPos = y;
		radian = r;
	}
	//원의 정보를 출력하기 위한 멤버메서드
	public void showCircleInfo() {
		System.out.printf("좌표[%d,%d]", xPos, yPos);
		System.out.println("반지름:"+ radian);
	}
}
 
public class E11ObjectSerializable {

	public static void main(String[] args) {

		try {
			//인스턴스를 파일로 저장하기 위해 출력스트림 생성 
			ObjectOutputStream out =
				new ObjectOutputStream(
					new FileOutputStream("src/ex20io/circle.obj")
				);
			//Circle 인스턴스 생성 후 파일에 저장 
			out.writeObject(new Circle(1,1,2.4));
			out.writeObject(new Circle(2,2,4.8));
			/*
			java에서 제공하는 기본클래스는 별도의 처리없이 직렬화 할 수 
			있다. */
			out.writeObject(new String("String타입의 "
					+ "오브젝트"));
			//스트림 소멸 
			out.close();
			
			/*
			인스턴스의 복원(역직렬화)를 위한 스트림을 생성하고 
			readObject를 통해 복원한다. */
			ObjectInputStream in =
				new ObjectInputStream(
					new FileInputStream("src/ex20io/circle.obj")
				);
			/*
			저장시 Object기반으로 저장되므로 복원시에는 원래의 
			자료형으로 다운캐스팅(강제형변환) 해야한다. */
			Circle c1 = (Circle)in.readObject();
			Circle c2 = (Circle)in.readObject();
			String message = (String)in.readObject();
			in.close();
			
			/*
			개발자가 직접 정의한 클래스는 멤버메서드를 통해 정보를 
			출력할 수 있다. */
			c1.showCircleInfo();
			c2.showCircleInfo();
			/*
			기본클래스는 이미 toString이 오버라이딩 되어있으므로
			즉시 출력할 수 있다. */
			System.out.println("String오브젝트:"+ message);
		}
		catch(ClassNotFoundException e) {
			System.out.println("[예외]클래스없음");
		}
		catch(FileNotFoundException e) {
			System.out.println("[예외]파일없음");
		}
		catch(IOException e) {
			System.out.println("[Exception]뭔가없음");
		}
	}
}
