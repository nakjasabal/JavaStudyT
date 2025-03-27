package ex06array;

public class E07ForEachObject {

	public static void main(String[] args) {
		
		//문자열 배열을 크기3으로 생성 및 초기화 
		String[] strArr = new String[] {
				"자바는 재미있다",
				"자바는 유용하다",
				"그러나 어렵다 ㅜㅜ"
		};
		
		//배열의 크기만큼 자동으로 반복되어 원소를 하나씩 인출
		for(String e : strArr) {
			//인출된 값 출력 
			System.out.println(e);
		}
	}
}
