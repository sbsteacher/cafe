package com.doheum.cafe;

import java.util.Scanner;

public class Customer {
	public void order(MenuTable mt) {
		mt.showMenus();
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴를 선택해 주세요: ");
		int selectedMenuIdx = scan.nextInt();
		
		scan.close();
	}
}
