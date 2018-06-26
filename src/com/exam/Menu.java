package com.exam;

public class Menu {

	int meal;
	String name;
	int money;
	int kcal;
	int i;
	
	public Menu(int i, String name, int money) {
		this.i=i;
		this.name=name;
		this.money=money;
	}

	public void Menu(int meal,String name,int money,int kcal){
		this.meal=meal;
		this.name=name;
		this.money=money;
		this.kcal=kcal;
		
	}

	public int getMeal() {
		return meal;
	}

	public void setMeal(int meal) {
		this.meal = meal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
}
