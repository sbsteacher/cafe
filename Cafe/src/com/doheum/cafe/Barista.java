package com.doheum.cafe;

public class Barista {
	public ICoffee makeCoffee(MenuItem mi) {
		ICoffee coffee = null;
		switch(mi.getMenuName()) {
		case "아메리카노":
			coffee = new Americano(mi);
			break;
		case "카푸치노":
			coffee = new Capucino(mi);
			break;
		case "카라멜 마키아또":
			coffee = new CaramelMakki(mi);
			break;
		case "에스프레소":
			coffee = new Espresso(mi);
			break;
		}	
				
		return coffee;
	}
}
