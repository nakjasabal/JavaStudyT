package ex15usefulclass;

import java.util.Random;

public class E07Random {

	public static void main(String[] args) {
		
		/*
		Random 클래스는 인스턴스 생성시 전달되는 인수를 기반으로
		난수를 생성한다. 이것을 Seed(씨앗)라고 표현한다. 만약
		동일한 Seed를 사용하면 항상 동일한 패턴의 난수가 생성되는데
		이를 가짜난수(Pseudo-random number)라고 한다. */
		System.out.println("# 가짜난수 : 같은 패턴의 난수만 생성됨");
		Random random1 = new Random(31);
		for (int i = 0; i < 10; i++) {
			System.out.print(random1.nextInt(100)+" ");
		}
		
		/*
		Random클래스의 nextInt(N) 메서드
		: 0 ~ N-1 까지의 난수를 생성한다. */
		System.out.println("\n# 난수생성1 : 씨드없음");
		Random random2 = new Random();
		for (int i = 0; i < 10; i++) {			
			System.out.print(random2.nextInt(100)+" ");
		}			

		/*
		씨드를 부여하려면 setSeed메서드를 사용한다. 이때 현재시간을
		밀리세컨즈 단위로 반환하는 메서드를 사용하면 편리하다. 시간
		은 계속 흘러가므로 항상 새로운 씨드를 부여할 수 있다. */
		System.out.println("\n# 난수생성2 : 변화하는 시간으로 씨드지정");
		Random random3 = new Random();
		random3.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10; i++) {			
			System.out.print(random3.nextInt(100)+" ");
		}		
		
		/*
		nextInt()에 인수가 없는 경우에는 음수,양수가 혼용되어
		난수가 생성된다. 이 경우 Math.abs()를 통해 양수로 변환 
		후 사용하면 된다. */
		System.out.println("\n# 난수생성3 : nextInt() 인수없음");
		Random random4 = new Random();
		for (int i = 0; i < 10; i++) {			
			System.out.print(random4.nextInt()+" ");
		}
	}
}
