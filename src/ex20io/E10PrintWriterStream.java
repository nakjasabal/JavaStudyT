package ex20io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E10PrintWriterStream {
	
	public static void main(String[] args) throws IOException {
		
		//입력스트림 없이 출력스트림만 있는 클래스 
		PrintWriter out = new PrintWriter(
				new FileWriter("src/ex20io/printf.txt"));
		
		//앞에서 txt파일쪽으로 생성한 스트림을 통해 내용을 출력
		out.printf("제 나이는 %d살 입니다.", 10);
		out.println("");		
		out.println("저는 기타 치는걸 좋아해요.");
		out.print("노래부를때 행복한거 같아요.");
		
		//스트림 소멸 
		out.close();		
		System.out.println("printf.txt가 생성되었습니다");
	}
}
