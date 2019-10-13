package com.doheum.cafe;

public class Main {

	public static void main(String[] args) {
		//1번째 해결 (방이 없으면) money = 10000;
		int money;		
				
		if(args.length == 0) {
			money = 10000;
		} else {			
			money = CustomUtil.parseStringToInt(args[0], 10000);
		}
		
		//2번째 숫자문자열이 아닌게 있으면 money = 10000;
		//System.out.println("length: " + args.length);
		
				
		
		System.out.println(money);
		
		/*
		MenuTable mt = new MenuTable();
		Customer customer = new Customer(money);
		Barista barista = new Barista();
		MenuItem mi = customer.orderWhile(mt);		
		customer.closeScanner();
		ICoffee coffee = barista.makeCoffee(mi);
		customer.drinkCoffee(coffee);
		return;
		*/
		
	}

}
