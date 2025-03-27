package ex06array;

/*
Call by reference(참조에 의한 호출)
: 메서드를 호출할때 참조값을 전달함으로써 서로 다른 지역에서도 동일한
메모리(Heap영역)를 참조할 수 있게하는 호출방식이다. 
메서드의 지역이 다르더라도 참조값을 통해 객체를 참조하게 되므로
A지역에서 값의 변경이 B지역에서도 그대로 참조할 수 있는 장점이 있다. 
참조값만 전달하므로 프로그램의 성능을 올릴 수 있고 메모리도 절약할 수 있다.
 */
public class E04CallByReference {

	public static void main(String[] args) {
		
		//크기가 2인 정수형 배열을 생성한 후 초기화 
		int[] arr = {100, 200};
		System.out.println("[메인메소드]-Swap전 출력");
		//출력1 : 100, 200 
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" "); 
		}
		System.out.println();
		//배열 인스턴스의 참조값을 인수로 전달한다. 
		callByReference(arr);
		
		/*
		지역은 달라도 동일한 메모리를 참조하므로 같은 결과가 출력된다. 
		출력3 : 200, 100 */
		System.out.println("[메인메소드]-Swap이후 출력");		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" "); 
		}
	}
	static void callByReference(int[] ref) {
		/*
		매개변수를 통해 전달받은 배열 인스턴스의 참조값을 통해 0번
		원소와 1번 원소를 서로 교환한다. 이때 배열의 값이 서로 
		바뀌게된다. */	 
		int temp;
		temp = ref[0];
		ref[0] = ref[1];
		ref[1] = temp;
		
		//출력2 : 200, 100
		System.out.println("[callByReference메소드]-Swap이후 출력");
		for(int i=0 ; i<ref.length ; i++) {
			System.out.print(ref[i]+" "); 
		}
		System.out.println(" ");
	}
}


