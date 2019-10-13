package com.doheum.cafe;

import java.util.Scanner;

public class Customer {
	
	public MenuItem order(MenuTable mt) {
		mt.showMenus();
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴를 선택해 주세요: ");
		int selectedMenuIdx = scan.nextInt();
		scan.close();
		return mt.pickMenu(selectedMenuIdx);		
	}
	
	//커피 주소값 받고 "커피명을 마신다" 라고 나오는 메소드를 만든다.
	public void drinkCoffee(ICoffee coffee) {
		System.out.printf("%s을(를) 마신다.\n", coffee.getCoffeeName());
	}
	
}






