package ex19thread;

//2개의 쓰레드가 공유객체로 사용할 클래스 
class SumMulti2 {
	//멤버변수와 생성자 정의 
	int num;
	public SumMulti2() {
		num=0;
	}
	
	/*
	쓰레드의 동기화 방법1
	: 동기화 메서드를 사용한다. 메서드 전체를 동기화하는 방법이다.
	*/ 
//	synchronized public void addNum(int n) {
//		num += n;
//	} 

	
	/* 동기화 방법2 
	: 동기화 블럭을 사용한다. 동기화가 필요한 코드에만 동기화하는
	방법이다. 해당프로그램에서는 실행코드가 1줄밖에 없으므로 동기화
	방법에 대한 성능차이가 없다. 하지만 실행코드가 많은 경우 메서드
	전체를 동기화 하는것보다 필요한 코드만 동기화하는 '동기화블럭'이
	훨씬 더 좋은 성능을 보이게된다. */
	public void addNum(int n) {
		synchronized(this) {
			num += n;			
		}
	}
		
	public int getNum() {
		return num;
	}
}
//쓰레드로 정의한 클래스
class MultiAdderThread2 extends Thread {
	//앞에서 정의한 공유객체를 멤버변수로 선언한다. 
	SumMulti2 sumInst; 
	int start, end;
	//생성자 메서드에서 멤버변수 초기화 
	public MultiAdderThread2(SumMulti2 sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	/* 쓰레드를 통해 반복적으로 공유객체인 sumInst의 addNum()을
	호출한다. 이 경우 동기화 처리가 되지않아 동시에 접근되는 경우가
	발생하게 되어 잘못된 결과가 출력된다. */
	public void run() {
		for(int i=start ; i<=end ; i++) {
			sumInst.addNum(i);
		}
	}
}

public class Ex05Sync2Method
{
	public static void main(String[] args)
	{
		/* 하나의 객체를 두개의 쓰레드가 공유해서 사용하는 형태로
		동작시킨다. 각각의 쓰레드가 5000번씩 반복해서 호출하게된다.*/
		SumMulti2 s = new SumMulti2();
		MultiAdderThread2 mat1 = 
				new MultiAdderThread2(s, 1, 5000);
		MultiAdderThread2 mat2 = 
				new MultiAdderThread2(s, 5001, 10000);
		mat1.start();
		mat2.start();
		try {
			mat1.join();
			mat2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~10000까지의합:"+s.getNum());
	}
}


