package Game;

import java.util.ArrayList;


public class Player{
	public ArrayList<Card> playerHand;
	public int playerMoney;
	public int playerSlots;
	
	public Player(int money, int slots, ArrayList<Card> playerHand) {
		this.playerMoney = money;
		this.playerSlots = slots;
		this.playerHand = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		playerHand.add(card);
	}
	
	public ArrayList<Card> getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(ArrayList<Card> playerHand) {
		this.playerHand = playerHand;
	}

	public int getPlayerMoney() {
		return playerMoney;
	}

	public void setPlayerMoney(int playerMoney) {
		this.playerMoney = playerMoney;
	}

	public int getPlayerSlots() {
		return playerSlots;
	}

	public void setPlayerSlots(int playerSlots) {
		this.playerSlots = playerSlots;
	}



}
