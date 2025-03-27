package ex07string;

import java.util.Scanner;

/*
문제1] 파일명 : QuValidateId.java
사용자로 부터 아이디를 입력받은 후 다음 조건에 만족하는지 확인할 수 있는 
프로그램을 작성하시오.
-아이디는 8~12자 사이로만 사용할 수 있다. (length() 메서드 활용)
-영문과 숫자로만 입력할 수 있다. (charAt() 메서드 활용)
-특수기호, 공백, 그 외 모든 문자는 입력할 수 없다. 
위 조건에 만족하면 true, 만족하지 않으면 false를 반환한다. 
메서드명 : boolean idValidate(String inputId)
힌트 : (idChar>='a' && idChar<='z') 이와 같은 조건을 사용하면 된당^^*
 */
public class QuValidateId {

	public static void main(String[] args) {
		
		// 사용자로 부터 아이디를 입력받는다. 
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 입력하세요:");
		String id = scanner.nextLine();		
		
		/* 만약 String을 Javascript처럼 배열처럼 만들고 싶다면
		toCharArray() 메서드를 사용하면 된다. 해당 메서드는 String
		을 char타입의 배열로 변환해준다. */
		char[] charArr = id.toCharArray();
		for(int i=0 ; i<charArr.length ; i++) {
			System.out.print(charArr[i]+"-");
		}
		
		//아이디를 인수로 전달한 후 사용여부에 따라 boolean값을 반환받는다.
		boolean isOk = idValidate(id);
		if(isOk==true)
			System.out.println("사용 가능한 아이디입니다.");
		else
			System.out.println("사용할 수 없습니다. 다시 입력해주세요.");
	}	
	static boolean idValidate(String inputId) {
		
		//아이디 유효성 검증 확인용 변수
		boolean idOk = true;

		//아이디의 길이가 8~12인지 검증
		if(inputId.length()>=8 && inputId.length()<=12) {			
			//입력한 아이디의 길이만큼 반복해서...
			for(int i=0 ; i<inputId.length() ; i++) {
				
				//각 문자가 영문 또는 숫자인지 확인한다. 
				char idChr = inputId.charAt(i);
				//System.out.printf("인덱스%d:%c\n", i, idChr);
				
				//아이디가 영문 또는 숫자가 아닌경우 false로 변경해준다.
				if( !((idChr>='0' && idChr<='9') 
						|| (idChr>='a' && idChr<='z') 
						|| (idChr>='A' && idChr<='Z')) ) {
					System.out.println(idChr+"=>허용안됨");
					idOk = false;
					//문자열에서 허용되지 않는 문자를 찾았다면 뒷 부분은 검사할 필요가 
					//없으므로 즉시 반복문(for)을 탈출한다. 
					break;
				}
			}
		}
		else {
			//아이디의 길이가 잘못되었다면 false로 변경한다. 
			idOk = false;
		}
		
		return idOk;
	}

}
