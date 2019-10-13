package com.doheum.cafe;

public class Main {

	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		Customer customer = new Customer();
		Barista barista = new Barista();
		
		MenuItem mi = customer.order(mt);
		ICoffee coffee = barista.makeCoffee(mi);	
		
		customer.drinkCoffee(coffee);
	}

}
