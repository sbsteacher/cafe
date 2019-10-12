package com.doheum.cafe;

public abstract class CoffeeParent implements ICoffee {

	private MenuItem mi;

	public CoffeeParent(MenuItem mi) {
		this.mi = mi;
	}
	
	@Override
	public String getCoffeeName() {		
		return mi.getMenuName();
	}
}
