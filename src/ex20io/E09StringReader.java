package ex20io;

import java.io.BufferedReader;
import java.io.FileReader;

public class E09StringReader {

	public static void main(String[] args) {
		try { 
			//문자열을 읽기위한 입력스트림 생성 
			BufferedReader in = new BufferedReader(
				new FileReader("src/ex20io/string.txt")
			);

			String str;
			while(true) { 
				/*
				개행(줄바꿈)이 등장하기 전까지의 데이터를 한번에
				읽어온다. 즉 한줄씩 읽는다. */
				str = in.readLine();
 
				//더 이상 읽을 내용이 없다면 while루프 탈출 
				if(str==null) {
					break;
				}
				/*
				입력시 newLine을 통해 개행정보가 입력되지만 읽어
				드린 문자열에는 개행정보가 포함되지 않는다. 
				입력시 개행정보는 문자열을 라인별로 구분하는 용도
				로만 사용되기 때문이다. 따라서 출력시 별도로 줄바
				꿈 처리를 해줘야한다. */
				System.out.println(str);
			}

			in.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
