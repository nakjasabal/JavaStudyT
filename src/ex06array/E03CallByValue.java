package ex06array;

/*
Call by value(값에 의한 호출)
: 메서드 호출과 관련된 개념으로 매개변수를 통해 값을 전달할때 메모리의
'복사'를 통해 값이 전달된다. 
그래서 다른 지역의 메서드에서 값의 변경이 있더라도 호출한 메서드의 값에는
전혀 영향을 미치지 않는다. 
메모리적 관점에서 보면 스택영역만 사용하는 케이스로 main과 호출된 
메서드는 서로 다른 지역이므로 서로에게 전혀 영향을 미치지 않는것이
특징이다. 
 */
public class E03CallByValue {

	public static void main(String[] args) {
		
		//main 지역에서 최초로 변수를 생성 
		int first=100, second=200;
		//출력결과1 : 100, 200
		System.out.println("[main메소드안-호출전]"+
				"first="+first+", second="+second);
		//메서드 호출시 인수로 값을 전달 
		callByValue(first, second);
		
		/*
		매개변수로 전달된 값은 복사되어 다른 지역의 메서드 내에서만
		변경되므로 main메서드에서는 초기값이 그대로 유지된다.  */
		System.out.println("[main메소드안-호출후]"+
				"first="+first+", second="+second); 
	}
	
	/*
	매개변수로 전달된 값은 복사되어 해당 지역의 메서드에서 사용할 수
	있게된다. */
	public static void callByValue(int fNum, int sNum) {
		/*
		Swap(스왑) : 두개의 변수가 할당받은 값을 서로 교환하는 것을
			말한다. 교환시에는 임시변수(temp)가 하나 추가로 필요하다.*/
		int temp;
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		
		/*
		해당 메서드 내에서는 값의 교환이 완료되었으므로 
		출력결과는 200, 100이 된다. */
		System.out.println("[callByValue메소드안]"
				+ "first="+fNum+",second="+sNum);
		//해당 메서드가 종료되면 호출한 지점으로 돌아간다. 
	}
}
