package ex20io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class E08StringWriter {

	public static void main(String[] args) {
		
		try {
			/*
			문자열을 저장하기 위한 출력스트림 생성. 문자열의 입력은
			버퍼에 따라 성능의 차이가 크기때문에 버퍼 필터 스트림을
			추가로 연결해서 인스턴스를 생성한다. */
			BufferedWriter out = new BufferedWriter(
				new FileWriter("src/ex20io/string.txt")
			);
			/*
			write를 통해 문자열을 저장하고, 줄바꿈은 newLine을
			통해 처리한다. OS별로 개행문자가 다르기 때문에 이 메서
			드를 통해 줄바꿈 처리를 해야한다. */
			out.write("나는 Java를 공부한다.");
			out.newLine();
			out.write("수료후 꼭 취업하겠다.");
			out.newLine();
			//스트림 종료 
			out.close();
			System.out.println("입력완료");
		}
		catch(FileNotFoundException e) {
			System.out.println("파일없음");
		}
		catch(IOException e) {
			System.out.println("IO오류");
		}
	}
}
