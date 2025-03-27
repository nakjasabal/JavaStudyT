package ex08class;

/*
시나리오]
다음에 주어진 조건으로 '사람'을 추상화 하시오.
-속성 : 이름, 나이, 에너지
-행동 : 걷는다, 생각한다, 먹는다, 현재상태표현
-행동의조건
	먹으면 에너지가 2증가
	걸으면 에너지가 1감소
	생각하면 에너지가 2감소
	단, 에너지의 최대/최소값은 0~10으로한다. 
	무한히 먹을수 없고, 에너지는 마이너스가 될수 없기 때문이다. 
 */
public class Human {
	//멤버변수 : 객체의 속성을 표현
	String name;
	//나이의 경우 연산이 필요하지 않다면 String으로 설정해도된다.
	int age; 
	//에너지는 증가 혹은 차감이 필요하므로 반드시 int로 설정해야한다. 
	int energy; 
	
	//멤버메서드 : 객체의 행동을 표현 
	void walking() { //'걷다'를 표현
		/*
		걷는 행동은 에너지를 1 차감시킨다. 만약 에너지를 차감한 결과가
		음수라면 해당 시나리오의 조건에 위배되므로 0으로 고정시키는 
		코드가 조건문으로 포함되어있다. */
		energy--;
		if(energy<0) {
			energy = 0;
			System.out.println("[walk]에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[walk]에너지가 1 감소하였습니다");
		}
	}
	void thinking() {//'생각하다'를 표현 
		//2 차감 후 음수라면 0으로 고정한다. 
		energy -= 2;
		if(energy<0) {
			energy = 0;
			System.out.println("[thinking]에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[thinking]에너지가 2 감소하였습니다");
		}
	}
	void eating() {//'먹다'를 표현
		//2 증가 후 10을 초과하면 10으로 고정한다. 
		energy += 2;
		if(energy>10) {
			energy = 10;
			System.out.println("[eat]에너지는 10이 최대치입니다.");
		}
		else {
			System.out.println("[eat]에너지가 2 증가하였습니다");
		}
	}
	//객체를 현재상태를 출력하는 멤버메서드 
	void showState() {
		System.out.println("===님의 현재상태는===");
		System.out.println("이름:"+ name);
		System.out.println("나이:"+ age);
		System.out.println("에너지:"+ energy);
		System.out.println("=====================");
	}
}
