package ex17collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Ex08AsList {
	
	//List컬렉션을 매개변수로 받은후 전체를 출력한다. 
	public static void listPrint(String title, 
			List<String> list) {
		System.out.println("# "+ title);
		/* 출력할 객체가 String이므로 별도의 오버라이딩 없이도
		내용을 출력할 수 있다. 만약 우리가 직접 정의한 클래스라면
		toString()을 오버라이딩 해야한다. */
		for(Object ob : list) {
			System.out.print(ob +" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {		
		
		/* String객체배열을 생성과 동시에 초기화한다. 이 경우
		초기데이터를 통해 크기를 유추할 수 있으므로 크기는 선언문장
		에서 생략해야한다. */
		String[] strArr = new String[]{"마린", "파이어뱃", "메딕", "마린"};
		/* 
		Arrays.asList() : 일반적인 배열을 List<E> 컬렉션으로 
		 	변경한 후 반환한다. 단, 값을 참조만 할수있고 입력이나
		 	삭제는 할수없다. 
		*/
		List<String> list = Arrays.asList(strArr);
		listPrint("출력1", list);
		//현재 상태에서는 데이터를 추가할 수 없다. 런타임에러 발생.
		//list.add("탱크");
		
		/* ArrayList<E>의 생성자를 통해 앞의 객체를 복사하면
		데이터를 변경할 수 있다. */
		list = new ArrayList<String>(list);
		//복사한 이후에는 데이터를 추가할 수 있다. 
		boolean isAdd = list.add("탱크");
		System.out.println("add결과:"+ isAdd);
		listPrint("출력2", list);
		
		/*
		이터레이터를 for문을 이용해서 출력한다. 
		for(초기값 ; 조건식 ; 증감식){
			print(next()가 증감식을 대체한다);
		}
		 */
		System.out.println("# 출력3");
		for(Iterator<String> itr = list.iterator() ; 
				itr.hasNext() ; ) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		/*
		Set<E> 컬렉션은 중복을 허용하지 않으므로 List에 저장된
		중복값을 제거할 수 있다. 
		 */
		HashSet<String> set = new HashSet<String>(list);
		list = new ArrayList<String>(set);
		listPrint("출력4(중복제거)", list);
	}
}




