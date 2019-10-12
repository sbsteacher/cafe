package com.doheum.cafe;

//메뉴 항목
public class MenuItem {
	private String menuName;
	private int menuPrice;
	
	//생성자를 통해 값을 넣을 수 있도록 만들어주시고 (생성자)
	//생성자 특징 1 - 클래스명이 같다.
	//생성자 특징 2 - 리턴타입이 없다.
	public MenuItem(String menuName, int menuPrice) {
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}
	
	//getter를 통해 값을 외부에 전달할 수 있도록 해주세요.(메소드)
	public String getMenuName() {
		return menuName;
	}
	
	public int getMenuPrice() {
		return menuPrice;
	}
	
	@Override
	public String toString() {
		//return menuName + ", " + menuPrice + "원";
		return String.format("%s (%,d원)", menuName, menuPrice);
	}
	
	
	
	
	
	
	
	
	
	
	
}
