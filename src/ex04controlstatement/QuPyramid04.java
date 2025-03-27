package ex04controlstatement;

public class QuPyramid04 {

    public static void main(String[] args) {

    	//*가 가장많은 부분을 상수로 지정
    	final int MAX_NUM = 5;
    	//전체반복횟수
    	int repeatNum = MAX_NUM * 2 - 1;
    	//감소횟수
    	int descNum = -1;
    	
    	//앞에서 구한 전체반복횟수만큼 반복한다.
    	for(int i=1 ; i<=repeatNum ; i++) {
    		//최대값까지는 증가시킨다. 
    		if(i<=MAX_NUM) {
    			//증가한다.
    			for (int j=1 ; j<=i ; j++) {
    				System.out.print("*");
    			}
    			System.out.println();
    		}
    		else {
    			//그 다음부터는 감소한다.
    			descNum = MAX_NUM - (i-MAX_NUM);
    			for (int j=1 ; j<=descNum ; j++) {
    				System.out.print("*");
    			}
    			System.out.println();
    		}
    	}
    }
}
