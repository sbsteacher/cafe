package com.doheum.cafe;

import java.util.Scanner;

public class Customer {
	private Scanner scan = new Scanner(System.in);
	
	public MenuItem order(MenuTable mt) {
		mt.showMenus();		
		System.out.print("메뉴를 선택해 주세요: ");
		int selectedMenuIdx = scan.nextInt();				
		return mt.pickMenu(selectedMenuIdx);
	}
	
	public MenuItem orderWhile(MenuTable mt) {
		MenuItem mi = null;
		while(true) {
			mi = order(mt);
			if(mi == null) {
				System.out.println("잘못된 선택입니다.");			
			} else {
				break;
			}
		}
		return mi;
	}
	
	
	//커피 주소값 받고 "커피명을 마신다" 라고 나오는 메소드를 만든다.
	public void drinkCoffee(ICoffee coffee) {
		System.out.printf("%s을(를) 마신다.\n", coffee.getCoffeeName());
	}
	
	public void closeScanner() {
		this.scan.close();
	}
	
}






