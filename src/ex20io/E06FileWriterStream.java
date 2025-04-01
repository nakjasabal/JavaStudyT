package ex20io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class E06FileWriterStream {
 
	public static void main(String[] args) {
		/*
		Java는 유니코드를 기반으로 문자를 저장한다. 아래는 
		문자스트림을 기반으로 해당 OS의 인코딩방식에 맞춰 문자를
		텍스트파일에 저장한다. */
		try {			 
			char ch1 = 'A';
			char ch2 = 'Z';
		 
			/*
			alpha.txt 파일을 대상으로 문자 출력 스트림을 생성한다.
			만약 파일이 존재하지 않으면 새롭게 생성한다. */
			Writer out = new FileWriter("src/ex20io/alpha.txt");
			
			//문자를 텍스트 파일에 입력한다. 
			out.write(ch1);
			out.write(ch2); 
			
			//스트림을 닫아준다. 
			out.close(); 
		}
		catch(IOException e) {
			System.out.println("문자스트림 작업중 오류발생");
			e.printStackTrace();
		}

		System.out.println("프로그램이 종료되었습니다.");
	}
}