package ex08class;

class FruitSeller3{
	
	int numOfApple;
	int myMoney;	  
	final int APPLE_PRICE;	
	/*
	멤버상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
	일반 멤버메서드에서는 초기화할 수 없다. 또한 초깃값이 없는 상태로 
	선언 자체가 불가능하다. 
	하지만 생성자는 인스턴스 생성시 딱 한번만 호출되고, 마음대로 호출할
	수 없으므로 한번 이상 초기화되지 않음이 보장된다. 
	따라서 '멤버상수'는 '생성자'에서 초기화 할 수 있다. 
	 */
	public FruitSeller3(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	} 
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}
class FruitBuyer3{
	int myMoney; 
	int numOfApple;
	
	//생성자 메서드 정의 
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class E06FruitSalesMain3 {
		
	public static void main(String[] args) {
		/*
		생성자를 사용해서 인스턴스를 생성하면 생성과 동시에 초기화할 
		수 있으므로 초기화 메서드를 사용하는것보다 편리하게 코드를 
		작성할 수 있다. */
		//판매자1 : 사과100개, 단가1000원으로 정의 
		FruitSeller3 seller1 = 
				new FruitSeller3(0, 100, 1000);		
		//판매자2 : 사과80개, 단가500원으로 정의
		FruitSeller3 seller2 = 
				new FruitSeller3(0, 80, 500);		
		//구매자 : 보유금액10000원 
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);

		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//각각의 판매자에게 5000원씩 지불하고 사과를 구매한다. 
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);

		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();//5개를 판매한다. 
		seller2.showSaleResult();//10개를 판매한다. 
		//10000원을 내고 15개를 구매한다. 
		buyer.showBuyResult();
	}
}



