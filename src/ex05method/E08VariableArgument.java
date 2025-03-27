package ex05method;
 
/*
가변인자(Variable Argument)
: 메서드 오버로딩을 대체할 수 있는 문법으로 하나의 메서드로 여러가지
호출형식을 대체할 수 있다. 
형식]
	메서드명(자료형 ... 매개변수명){
		실행문장;
	}
	-필요에 따라 매개변수를 가변적으로 조정할 수 있는 문법 
	-매개변수를 2개이상 받을 수 있어야 하므로 배열로 반환
	-단, 자료형은 모두 동일해야 한다. 
*/
public class E08VariableArgument {
 
//	static int getTotal(int param) {
//		int total = 0;
//		total += param;
//		return total;
//	}
//	static int getTotal(int param1, int param2) {
//		int total = 0;
//		total += (param1+param2);
//		return total;
//	}
//	static int getTotal(int param1, int param2, int param3) {
//		int total = 0;
//		total += (param1+param2+param3);
//		return total;
//	}
	 
	/*
	...을 통해 매개변수 param이 2개 이상의 인수를 받을 수 있는것을
	명시한다. 또한 메서드 내에서는 배열로 반환되어 이를 통해 반복문으로
	접근할 수 있다. */
	static int getTotal(int ... param) {
		int total = 0;
		//"배열명.length"를 통해 배열의 크기를 얻어올 수 있다. 
		for(int i=0 ; i<param.length ; i++) {
			//각 원소의 값을 누적해서 더해준다. 
			total += param[i];
		}
		return total;
	}

	public static void main(String[] args) {
		
		System.out.println("getTotal(args1)호출:"+
				getTotal(10));	
		System.out.println("getTotal(args1,args2)호출:"+
				getTotal(10,20));
		System.out.println("getTotal(args1,args2,args3)호출:"+
				getTotal(10,20,30));
		System.out.println("getTotal(매개변수6개)호출:"+
				getTotal(10,20,30,40,50,60));
		
		/* 매개변수의 타입이 double이 포함되어 있으므로 호출할
		수 없다. 만약 아래와 같이 실수를 모두 처리하려면 가변인자의
		타입을 double로 선언하면 된다. */
		//System.out.println("잘못된 호출:"+ getTotal(10, 20.3));
		 
	}
}





