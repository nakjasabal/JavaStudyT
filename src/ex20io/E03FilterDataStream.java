package ex20io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class E03FilterDataStream {
	
	public static void main(String[] args) {
		
		//필터스트림을 통해 정수를 저장할 바이너리 파일의 경로선언 
		String src = "src/ex20io/FilterdataStream.bin";

		try {
			//파일생성을 위한 출력스트림 생성 
			OutputStream out = new FileOutputStream(src);
			//파일스트림의 내용을 조합할 필터스트림 생성 
			DataOutputStream filterOut = new DataOutputStream(out);
			//즉 2개의 스트림을 통해 인스턴스를 생성한다. 
			
			/*
			앞에서 생성한 출력스트림에 필터스트림까지 추가로 연결한
			후 write()를 통해 숫자데이터를 전송하여 저장한다. 
			해당 데이터를 바이트단위로 분리해서 4byte 혹은 8byte
			를 전송하게된다. */
			filterOut.writeInt(123);
			filterOut.writeDouble(12.34);
			filterOut.writeInt(456);
			filterOut.writeDouble(56.78);
			
			/****** 여기까지 실행하면 bin파일 생성됨 ******/
			
			/*
			파일의 내용을 읽어오기 위해 입력스트림과 필터입력스트림
			을 연결한다. 필터스트림을 통해 byte단위가 아니라 int,
			double과 같은 기본자료형의 단위로 데이터를 읽어올 수
			있게된다. */
			DataInputStream filterIn =
				new DataInputStream(new FileInputStream(src));

			//정수 혹은 실수를 읽어온다. 
			int num1 = filterIn.readInt();
			double dNum1 = filterIn.readDouble();
			int num2 = filterIn.readInt();
			double dNum2 = filterIn.readDouble();

			//읽어온 내용 출력 
			System.out.println("num1="+ num1);
			System.out.println("dNum1="+ dNum1);
			System.out.println("num2="+ num2);
			System.out.println("dNum2="+ dNum2);
			
			//모든 작업을 완료하면 스트림을 소멸시킨다. 
			if(filterOut!=null) filterOut.close();
			if(filterIn!=null) filterIn.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("해당파일없음");
		}
		catch(IOException e) {
			System.out.println("IO오류발생");
		}
	}
}