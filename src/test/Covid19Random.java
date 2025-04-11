package test;

import java.util.Random;

public class Covid19Random {

	static final int RANDOM_COUNT = 100000000;//난수생성횟수
	static final int STUDENT_COUNT = 1;//당첨명수
	
	public static void main(String[] args) {		
		/*
		강신원,박준수,박천,이창우,김영진,
		구양호,신은영,박진경,이한이,김선열,
		김혜림,김동수,김수림,임진석,구선우,
		김해솔,박한수,나영운,박수현
		
		"강신원","박준수","박천","이창우","김영진",
		"구양호","신은영","박진경","이한이","김선열",
		"김혜림","김동수","김수림","임진석","구선우",
		"박한수","나영운","박수현""김선열",
		 */
		String[] kosmo = {				
			"강신원","박준수","박천","이창우","김영진",
			"구양호","신은영","박진경","이한이",
			"김혜림","김동수","김수림","임진석","구선우",
			"박한수","나영운","박수현"
		};
		//난수를 누적해서 저장할 배열
		int[] choice = new int[kosmo.length];
		
		//난수생성을 위한 객체생성 및 씨드설정
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
				
		//일정횟수 반복하면서 난수생성
		for (int i=0 ; i<RANDOM_COUNT ; i++) {			
			int rndNumber = random.nextInt(RANDOM_COUNT);
			//학생수 만큼의 난수생성
			int stuNumber = rndNumber % kosmo.length;
			//System.out.println("comNumber="+stuNumber);
			//생성된 난수를 배열의 인덱스로 사용하여 +1증가
			choice[stuNumber]++;
		}
		
		for (int i=0 ; i<kosmo.length ; i++) {			
			System.out.printf("%s = %d\n", kosmo[i], choice[i]);
			//System.out.printf("%s[%d] = %d\n", kosmo[i], i, choice[i]);
		}
		
		//for (int i=0; i<STUDENT_COUNT; i++) {
			maxFind(choice, kosmo);
		//}		
	}	

	public static void maxFind(int[] choice, String[] kosmo) {
		
		int max=0;
		int maxIndex=-1;
		//배열에서 가장 큰값 찾기
		for (int i=0 ; i<choice.length ; i++) {			
			if(max<choice[i]) {
				max = choice[i];	
				maxIndex = i;
			}
		}
		//최대값을 찾은후 이름을 출력하고 0으로 리셋한다.
		System.out.println("당첨:"+ kosmo[maxIndex]);
		choice[maxIndex] = 0;
	}
}
