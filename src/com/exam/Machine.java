package com.exam;
/*
請在此【com.exam】這個package下實作所有的程式，完成一題請先 commit (最後再push全部的commits即可)
第一題題目: 在專案根目錄有一個文字檔menu.txt，
記錄這家餐廳的菜單，一行資料如下: 1,大麥克,65,534 各
欄代表 點餐號碼、餐點名稱、售價與熱量(kcal) 
請設計一執行類別，名稱為Main.java，執行後讀取所有菜單後並列出 每
項餐點資訊如下:
1.大麥克
2.雙層吉士牛肉堡
3.麥脆雞原味
4.麥香魚
5.薯條大包
6.可樂
7.冰紅茶
0.結算 
q) 離開(結束程式) 
請輸入餐點: 4 (使用者輸入4) 
請輸入數量: 2 (使用者輸入2) 
目前餐點: (列出目前餐點清單、分隔線後，再列出功能列表)

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Machine {

	int total = 0;
	int number=0;
	List<Menu> menus = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
   
	public void On() {
		int data = -1;
		while (data != 0) {
			for (int i = 0; i < menus.size(); i++) {
				Menu menu = menus.get(i);
				System.out.println(menu.getMeal() + "\t" + menu.getName());
			}
			System.out.print("請輸入餐點:");
			int mea = scanner.nextInt();
			System.out.print("請輸入數量:");
			int num = scanner.nextInt();

			switch (mea) {
			case 1:
				System.out.print("大麥克"+"\t");
				Menu m1 =menus.get(0);
				total =total+(m1.getMoney()*num);
				break;
			case 2:
				System.out.print("雙層吉士牛肉堡"+"\t");
				Menu m2 =menus.get(1);
				total =total+(m2.getMoney()*num);
				break;
			case 3:
				System.out.print("麥脆雞原味"+"\t");
				Menu m3 =menus.get(2);
				total =total+(m3.getMoney()*num);
				break;
			case 4:
				System.out.print("麥香魚"+"\t");
				Menu m4 =menus.get(3);
				total =total+(m4.getMoney()*num);
				break;
			case 5:
				System.out.print("薯條大包"+"\t");
				Menu m5=menus.get(4);
				total =total+(m5.getMoney()*num);
				break;
			case 6:
				System.out.print("可樂"+"\t");
				Menu m6 =menus.get(5);
				total =total+(m6.getMoney()*num);
				break;
			case 7:
				System.out.print("冰紅茶"+"\t");
				Menu m7 =menus.get(6);
				total =total+(m7.getMoney()*num);
				break;
			case 0:
				System.out.print("合計:"+total);
				total=total;
				
				break;
			}
			
			switch (num) {
			case 1:
				System.out.println(1);
				number=number+1;
				break;
			case 2:
				System.out.println(2);
				number=number+2;
				break;
			case 3:
				System.out.println(3);
				number=number+3;
				break;
			case 4:
				System.out.println(4);
				number=number+4;
				break;
			case 5:
				System.out.println(5);
				number=number+5;
				break;
			case 6:
				System.out.println(6);
				number=number+6;
				break;
			case 7:
				System.out.println(7);
				number=number+7;
				break;
			}
		}
	}
}