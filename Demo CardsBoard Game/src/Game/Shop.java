package Game;

import java.util.ArrayList;

public class Shop{
	
	public ArrayList<Card> cardsShop;
	
	public Shop(ArrayList<Card> cardshop) {
		this.cardsShop = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		cardsShop.add(card);
	}

	public ArrayList<Card> getCardsShop() {
		return cardsShop;
	}

	public void setCardsShop(ArrayList<Card> cardsShop) {
		this.cardsShop = cardsShop;
	}

	

}
