package test;

import test.ex09pack.buyer.FruitBuyer3;
import test.ex09pack.seller.FruitSeller3;

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



