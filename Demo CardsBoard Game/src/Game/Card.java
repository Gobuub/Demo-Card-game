package Game;

public class Card {
	 
	public int money ;
	public int slots;
	public int price;
	
	public Card (int money, int slots, int price) {
		
		this.money = money;
		this.slots = slots;
		this.price = price;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getSlots() {
		return slots;
	}

	public void setSlots(int slots) {
		this.slots = slots;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
