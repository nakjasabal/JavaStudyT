package ex08class;

class FruitSeller2{
	/*
	두번째 버전에서는 멤버변수의 초깃값을 제거한다. 이 경우 멤버상수는
	에러가 발생하므로 final을 제거하여 일반적인 멤버변수로 변경한다.
	변수는 소문자를 사용하므로 이 부분도 변경해준다. */
	int numOfApple;
	int myMoney;
	int apple_price;
	
	/*
	초기화 메서드를 선언하여 인스턴스 생성 후 다양한 형태로 초기화 
	할 수 있다. */
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	} 
	 
	public int saleApple(int money) {
		//Java는 대소문자를 구분하므로 이 부분을 소문자로 변경 
		int num = money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

class FruitBuyer2{
	//초깃값 제거 
	int myMoney; 
	int numOfApple;
	
	//멤버변수 초기화를 위한 초기화메서드 추가 
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class E06FruitSalesMain2 {
	
	public static void main(String[] args) {
		//판매자1 : 사과 100개, 단가 1,000원
		FruitSeller2 seller1 = new FruitSeller2();		
		seller1.initMembers(0, 100, 1000);
		//판매자2 : 사과 80개, 단가 500원
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500);
		//구매자 : 보유금액 10,000원
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//각각의 판매자에게 5000원씩 지불한 후 사과 구매 
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();//5개를 판매한다. 
		seller2.showSaleResult();//10개를 판매한다. 		
		//10000원을 내고 15개를 구매한다. 
		buyer.showBuyResult();
	}
}




