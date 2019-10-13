package com.doheum.cafe;

public class Main {

	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		Customer customer = new Customer();
		Barista barista = new Barista();
		MenuItem mi = null;
		while(true) {
			mi = customer.order(mt);
			if(mi == null) {
				System.out.println("잘못된 선택입니다.");			
			} else {
				break;
			}
		}
		customer.closeScanner();
		
		ICoffee coffee = barista.makeCoffee(mi);
		customer.drinkCoffee(coffee);
		
	}

}
