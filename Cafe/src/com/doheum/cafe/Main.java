package com.doheum.cafe;

public class Main {

	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		Customer customer = new Customer();
		MenuItem mi = customer.order(mt);
	}

}
