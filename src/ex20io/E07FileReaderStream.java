package ex20io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class E07FileReaderStream {

	public static void main(String[] args) {
		
		try { 
			//버퍼로 사용할 크기가 10인 char형 배열 생성 
			char[] cbuf = new char[10];
			int readCnt;
			 
			//txt파일을 대상으로 문자 입력 스트림을 생성 
			Reader in =	new FileReader("src/ex20io/alpha.txt");
			/*
			배열 cbuf의 앞에서부터 최대 10개의 문자를 읽어 저장
			한다. */
			readCnt = in.read(cbuf, 0, 10);
			
			//읽어온 내용을 출력한다. 
			for(int i=0 ; i<readCnt ; i++) {
				System.out.println(cbuf[i]);
			}
			
			//스트림을 닫아준다. 
			in.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일없음");
		}
		catch(IOException e) {
			System.out.println("IO오류발생");
		}
	}
}
