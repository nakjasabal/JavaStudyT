package ex04controlstatement;

public class QuPyramid03 {

    public static void main(String[] args) {

        int num = 5;

        //행을 반복하는 부분
        for(int i=0 ; i<num ; i++) {
            //공백을 출력하는 부분(반비례)
        	for(int j=1 ; j<=num-i ; j++) {
                System.out.print(" ");
            }
        	// *를 출력하는 부분(정비례. 2씩 증가)
            for(int k=0 ; k<i*2+1 ; k++) {
                System.out.print("*");
            }
            //줄바꿈 처리
            System.out.println();
        }
    }
}
