package quiz;

public class QuUpgradeGugudan {
	
	public static void main(String[] args) {
		
		int result;
		//2~9까지 반복(단)
		for (int x = 2; x < 10; x++) {
			//제일 처음 1을 곱하는 부분은 예외적으로 기술해준다. 
			result = x * 1;
			System.out.printf("%d x 1 = %d\n", x, result);

			//2~9까지 반복(수)
			for (int y = 2; y < 10; y++) {
				result = x;
				System.out.printf("%d", x);
				//해당 단과 수에 맞게 거듭제곱을 계산한다. 
				for (int z = 2; z <= y; z++) {
					/*
					가령
					3이라면 2*2*2
					4라면 2*2*2*2 와 같이 처리된다. 
					 */
					//계산의 결과는 result에 저장한다. 
					result *= x;
					System.out.printf(" X %d", x);
				} 
				//거듭제곱의 결과를 출력한다. 
				System.out.printf(" = %d", result);
				System.out.println();
			}
			System.out.println();
		}
	}
}
