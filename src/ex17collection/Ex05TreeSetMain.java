package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;
 
/*
TreeSet<T> 컬렉션
: 트리라는 자료구조를 기반으로 한 Set계열의 컬랙션
-set의 기본적인 특성은 동일하다.
-따라서 중복은 허용되지 않는다. 
-단 객체가 정렬되어 저장된다. 정렬의 기준은 개발자가 직접
정의할 수 있다.  
*/

/* 클래스 생성시 정렬의 기준을 만들어주기 위해서는 Comparable<T>
인터페이스를 구현해야 한다. */
class MyString implements Comparable<MyString> {
	String str;
	public MyString(String str) {
		this.str = str;
	}
	//멤버메서드 : 문자열의 길이를 반환한다. 
	public int getLength() {
		return str.length();
	}
	
	/*
	TreeSet<T>에 객체를 저장할때 정렬을 위해 compareTo() 메서드
	를 오버라이딩한다. 
	정렬의 기준은 단순하게 가나다라와 같은 순서가 될수도 있고, 문자열
	의 길이에 따른 정렬이 될수도있다. 
	아래의 코드는 오름차순(작은것->큰것) 정렬일때 사용한다. 
	1과 -1의 위치가 바뀌면 내림차순이 된다.  
	*/
	@Override
	public int compareTo(MyString paramStr) {
//		if(getLength() > paramStr.getLength())
//			return 1;
//		else if(getLength() < paramStr.getLength())
//			return 1;
//		else
//			return 0;
		
		//문자열의 첫 문자를 기준으로 오름차순 정렬
		if(this.str.charAt(0) > paramStr.str.charAt(0))
			return 1;
		else
			return -1;				
	}
	//Object클래스에서 제공하는 메서드를 오버라이딩 
	@Override
	public String toString() {
		return str;
	}
}

public class Ex05TreeSetMain {

	public static void main(String[] args) {
		
		/* Java에서 제공하는 기본클래스인 경우 별도의 오버라이딩을
		하지 않아도 된다. */
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		//set 컬렉션이므로 중복저장은 허용하지 않는다. 
		tree1.add(2);
		//4개가 출력된다. 
		System.out.println("저장된 데이터 수:"+ tree1.size() +"개");
		//오름차순으로 정렬된 상태로 출력된다. 
		Iterator<Integer> itr = tree1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		/**********************************************************/
		//문자열의 길이를 기준으로 오름차순 정렬된다. 
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moon"));
		tree2.add(new MyString("JavaWeb"));

		Iterator<MyString> it = tree2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
