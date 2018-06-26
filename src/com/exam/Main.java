package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;


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
public class Main {

	public static void main(String[] args) {

		Machine machine = new Machine();
		
		try {
			FileReader fr = new FileReader("menu.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String token[] = line.split(",");
		    int count = Integer.parseInt(token[0]);
			for (int i = 0; i < count; i++) {
				String name = token[(i * 2 + 1)];
				int money = Integer.parseInt(token[(i * 2 + 2)]);
				machine.menus.add(new Menu(i+1,name,money));
			}
			
			machine.On();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
