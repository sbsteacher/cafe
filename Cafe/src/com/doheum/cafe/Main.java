package com.doheum.cafe;

public class Main {

	public static void main(String[] args) {
		//1번째 해결 (방이 없으면) money = 10000;
		final int DEFAULT_MONEY = 10000;
		int money;		
				
		if(args.length == 0) {
			money = DEFAULT_MONEY;
		} else {			
			money = CustomUtil.parseStringToInt(args[0], DEFAULT_MONEY);
		}
			
		MenuTable mt = new MenuTable();
		Customer customer = new Customer(money);
		Barista barista = new Barista();
		MenuItem mi = customer.orderWhile(mt);			
		customer.closeScanner();
		if(mi == null) {
			System.out.println("금액이 부족합니다.");
			return;
		}
		ICoffee coffee = barista.makeCoffee(mi);
		customer.drinkCoffee(coffee);
		return;		
	}

}
