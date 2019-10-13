package com.doheum.cafe;

import java.util.*;

public class MenuTable {
	//변수
	//private MenuItem americano;
	//private MenuItem capucino;
	
	//배열 or 컬렉션
	private List<MenuItem> menus = new ArrayList();
	private MenuItem[] menusArray = new MenuItem[4];
	
	public MenuTable() {
		//menusArray[3] = 주소값;				
		MenuItem mi = new MenuItem("아메리카노", 1500);
		menus.add(mi);
		menus.add(new MenuItem("카푸치노", 2000));
		menus.add(new MenuItem("카라멜 마키아또", 2500));
		menus.add(new MenuItem("에스프레소", 2500));		
	}
	
	//메뉴 리스트를 보여준다.
	public void showMenus() {
		System.out.println(" ----  메뉴 ---- ");
		for(int i=0; i<menus.size(); i++) {
			MenuItem mi = menus.get(i);
			System.out.printf("%d. %s\n", (i + 1), mi);
		}		
	}
	
	public MenuItem pickMenu(int selectedMenuIdx) {
		//MenuItem mi = menus.get(selectedMenuIdx - 1);
		//return mi;
		int calcIdx = selectedMenuIdx - 1;
		if(calcIdx >= 0 && calcIdx < menus.size()) {
			return menus.get(calcIdx);
		} 
	
		return null;
	}
}





