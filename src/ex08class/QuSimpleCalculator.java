package ex08class;

class CalculatorEx {
	//멤버변수 : 연산의 횟수 카운트 
	int addCount;
	int minCount;
	int mulCount;
	int divCount;
	
	//디폴트 생성자
	public CalculatorEx() {}
	
	//초기화메서드 : 연산의 횟수를 0으로 초기화한다. 
	void init(){
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		divCount = 0;
	}
	
	//덧셈연산
	double add(double n1, double n2){
		//연산횟수 1증가
		addCount++;
		return n1 + n2;
	}
	double min(double n1, double n2){
		//연산횟수 1증가
		minCount++;
		return n1 - n2;
	}
	double mul(double n1, double n2){
		//연산횟수 1증가
		mulCount++;
		return n1 * n2;
	}
	double div(double n1, double n2){
		//연산횟수 1증가
		divCount++;
		return n1 / n2;
	}
	void showOpCount() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n덧셈횟수:"+ addCount);
		sb.append("\n뺄셈횟수:"+ minCount);
		sb.append("\n곱셈횟수:"+ mulCount);
		sb.append("\n나눗셈횟수:"+ divCount);
		System.out.println(sb);
	}
}

public class QuSimpleCalculator {
	
	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1.1 + 2.1 = " +  cal.add(1.1 , 2.1));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}	

}
