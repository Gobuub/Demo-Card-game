package Game;

import java.util.ArrayList;

public class Main_Z_hack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card m = new Card(1,1,3);
		Card n = new Card(2,0,2);
		Card o = new Card(0,2,4);
		Card p = new Card(3,0,3);
		Card q = new Card(2,2,6);
		Card r = new Card(0,2,4);
		Card s = new Card(1,1,3);
		Card t = new Card(3,0,3);
		Card u = new Card(3,0,3);
		Card v = new Card(2,2,6);
		
		ArrayList<Card> p1_hand = new ArrayList<>();
		Player p1 = new Player(0,0, p1_hand);
		p1_hand.add(new Card(1,0,0));
		p1_hand.add(new Card(0,1,0));
		p1_hand.add(new Card(1,0,0));
		p1_hand.add(new Card(1,0,0));
		p1_hand.add(new Card(0,1,0));
		p1_hand.add(new Card(1,0,0));

		ArrayList<Card> p2_hand = new ArrayList<>();
		Player p2 = new Player(0,0, p2_hand);
		p2_hand.add(new Card(0,1,0));
		p2_hand.add(new Card(0,1,0));
		p2_hand.add(new Card(1,0,0));
		p2_hand.add(new Card(1,0,0));
		p2_hand.add(new Card(1,0,0));
		p2_hand.add(new Card(1,0,0));
		
		ArrayList<Card> cardShop = new ArrayList<>();
		
		cardShop.add(m);
		cardShop.add(n);
		cardShop.add(o);
		cardShop.add(p);
		cardShop.add(q);
		cardShop.add(r);
		cardShop.add(s);
		cardShop.add(t);
		cardShop.add(u);
		cardShop.add(v);
		
		int p1_slots = p1.getPlayerSlots();
		int p2_slots = p2.getPlayerSlots();
		int turno = 1;
		boolean continueGame = true;
		
		while(continueGame == true)	{
			if (p1_slots>21 || p2_slots>21){
				continueGame = false;
			}
			else{
				int p1_money = 0;
				int p2_money = 0;
				System.out.println("----- !!Turno "+ turno + " del jugador 1¡¡¡ -----\n");
				System.out.println("Slots del jugador 1: "+ p1_slots);
				int i = 0;
				for (i=0; i<3; i++) {
					int addmoney = p1_hand.get(i).money;
					//System.out.println("Añadimos " + addmoney + " monedas.");
					int addslots = p1_hand.get(i).slots; 
					//System.out.println("Añadimos " + addslots + " slots.");
					int addprice = p1_hand.get(i).price;
					
					//System.out.println("Carta jugada: \n Money: " + addmoney + ", Slots: " + addslots + ", Price: " + addprice);
				
					
					p1_money += addmoney;
					//System.out.println("Dinero del jugador " + p1_money);
					p1_slots += addslots;
					//System.out.println("Slots del jugador " + p1_slots);
					//int card_num = i+1;
					
					//System.out.println("Cartas jugadas por el jugador " + card_num);
					
					p1_hand.add(new Card(addmoney, addslots, addprice));
					
					
					//System.out.println("Cartas en mano del jugador " + p1_hand.size());
				}
				
			
				int j=0;
				for (j=0; j<3; j++) {
					//int addmoney = p1_hand.get(0).money;
					//System.out.println("Añadimos " + addmoney + " monedas.");
					//int addslots = p1_hand.get(0).slots; 
					//System.out.println("Añadimos " + addslots + " slots.");
					//int addprice = p1_hand.get(0).price;
					
					//System.out.println("Carta borrada: \n Money: " + addmoney + ", Slots: " + addslots + ", Price: " + addprice);
					p1_hand.remove(0);
					//System.out.println("Cartas en mano del jugador " + p1_hand.size());
				}
				
				int x = 0;
				
				for (x=0; x<cardShop.size(); x++) {
					int cardprice = cardShop.get(x).getPrice();
					
					int cardslots = cardShop.get(x).getSlots();
					
					int cardmoney = cardShop.get(x).getMoney();
					
					
					
					
					if (p1_money == cardprice) {
						
						System.out.println("El jugador puede comprar la carta");
						//System.out.println("	Monedas de la carta: "+cardmoney);
						//System.out.println("	Slots de la carta: "+cardslots);
						//System.out.println("	Precio de la carta " + cardprice);
						
						
						p1_hand.add(new Card(cardmoney, cardslots, cardprice));
						System.out.println("Carta comprada: \n Money: " + cardmoney + ", Slots: " + cardslots + ", Price: " + cardprice);
						//System.out.println("Cartas en mano del jugador " + p1_hand.size());
						cardShop.remove(x);
						//System.out.println("Dinero del jugador para comprar " + p1_money);
						p1_money -= cardprice;
						//System.out.println("Dinero del jugador " + p1_money);
						
					}
					else {
						
						if (p1_money > cardprice) {
							
							System.out.println("El jugador puede comprar la carta");
							p1_hand.add(new Card(cardmoney, cardslots, cardprice));
							System.out.println("Carta comprada: \n Money: " + cardmoney + ", Slots: " + cardslots + ", Price: " + cardprice);
							cardShop.remove(x);
							p1_money -= cardprice;
							//System.out.println("Dinero del jugador despues de comprar " + p1_money);
						}
					}
				}
				
				//System.out.println("Cartas en tienda: " + cardShop.size());
				System.out.println("Cartas jugador 1 despues de jugar: " + p1_hand.size());
				//System.out.println("Monedas jugador 1 despues de jugar carta  " + p1_money);
				//System.out.println("Slots jugador 1 despues de jugar carta  " + p1_slots);
				
				x = 0;
				for (x=0; x<p1_hand.size(); x++) {
					System.out.println("Money: " + p1_hand.get(x).money + ", Slots: " + p1_hand.get(x).slots + ", Price:" + p1_hand.get(x).price);
				}
				
				System.out.println("----- !!Turno "+ turno + " del jugador 2¡¡¡ -----\n");
				System.out.println("Slots del jugador 2: "+ p2_slots);
				
				
				
				i = 0;
				for (i=0; i<3; i++) {
					int addmoney = p2_hand.get(i).money;
					//System.out.println("Añadimos " + addmoney + " monedas.");
					int addslots = p2_hand.get(i).slots; 
					//System.out.println("Añadimos " + addslots + " slots.");
					int addprice = p2_hand.get(i).price;
				
					
					p2_money += addmoney;
					//System.out.println("Dinero del jugador " + p2_money);
					p2_slots += addslots;
					//System.out.println("Slots del jugador " + p2_slots);
					
					//System.out.println("Carta jugada: \n Money: " + addmoney + ", Slots: " + addslots + ", Price: " + addprice);
					
					//int card_num = i+1;
					
					//System.out.println("Cartas jugadas por el jugador " + card_num);
					
					p2_hand.add(new Card(addmoney, addslots, addprice));
					
					//System.out.println("Cartas en mano del jugador " + p2_hand.size());
					
				}
				j=0;
				for (j=0; j<3; j++) {
					//int addmoney = p2_hand.get(0).money;
					//System.out.println("Añadimos " + addmoney + " monedas.");
					//int addslots = p2_hand.get(0).slots; 
					//System.out.println("Añadimos " + addslots + " slots.");
					//int addprice = p2_hand.get(0).price;
					p2_hand.remove(0);
					//System.out.println("Cartas en mano del jugador " + p2_hand.size());
					
					//System.out.println("Carta borrada: \n Money: " + addmoney + ", Slots: " + addslots + ", Price: " + addprice);
				}
				
				x = 0;
				
				for (x=0; x<cardShop.size(); x++) {
					int cardprice = cardShop.get(x).getPrice();
					int cardslots = cardShop.get(x).getSlots();
					int cardmoney = cardShop.get(x).getMoney();
					
					
					
					if (p2_money == cardprice) {
						
						System.out.println("El jugador puede comprar la carta");
						//System.out.println("Precio de la carta " + cardprice);
						
						p2_hand.add(new Card(cardmoney, cardslots, cardprice));
						System.out.println("Carta comprada: \n Money: " + cardmoney + ", Slots: " + cardslots + ", Price: " + cardprice);
						//System.out.println("Cartas en mano del jugador " + p2_hand.size());
						cardShop.remove(x);
						//System.out.println("Dinero del jugador para comprar " + p2_money);
						p2_money -= cardprice;
						//System.out.println("Dinero del jugador después de comprar " + p2_money);
						
					}
					else {
						
						if (p2_money > cardprice) {
							
							System.out.println("El jugador puede comprar la carta");
							p2_hand.add(new Card(cardmoney, cardslots, cardprice));
							System.out.println("Carta comprada: \n Money: " + cardmoney + ", Slots: " + cardslots + ", Price: " + cardprice);
							cardShop.remove(x);
							p2_money -= cardprice;
							//System.out.println("Dinero del jugador despues de comprar " + p2_money);
						}
					}
				}
				
				
				//System.out.println("Cartas en tienda: " + cardShop.size());
				System.out.println("Cartas jugador 2 despues de jugar: " + p2_hand.size());
				//System.out.println("Monedas jugador 2 despues de jugar carta  " + p2_money);
				//System.out.println("Slots jugador 2 despues de jugar carta  " + p2_slots);
				
				x = 0;
				for (x=0; x<p2_hand.size(); x++) {
					System.out.println("Money: " + p2_hand.get(x).money + ", Slots: " + p2_hand.get(x).slots + ", Price:" + p2_hand.get(x).price);
				}
				
				turno ++;
			}
		}
	
		if (p1_slots > p2_slots) {
			System.out.println("\n----- !!!Gana el jugador 1!!! -----\n");
			System.out.println("Slots del jugador 1: "+ p1_slots);
		}
		else if (p1_slots < p2_slots){
			System.out.println("\n----- !!!Gana el jugador 2!!! -----\n");
			System.out.println("Slots del jugador 2: "+ p2_slots);
		}
		else {
			System.out.println("\n----- !!!Empate!!! -----\n");
			System.out.println("Slots del jugador 1: "+ p1_slots);
			System.out.println("Slots del jugador 2: "+ p2_slots);
		}
		
		int x = 0;
		System.out.println("\nCartas en mano del jugador 1 al finalizar juego: " + p1_hand.size());
		for (x=0; x<p1_hand.size(); x++) {
			System.out.println("Money: " + p1_hand.get(x).money + ", Slots: " + p1_hand.get(x).slots + ", Price:" + p1_hand.get(x).price);
		}
		
		x = 0;
		System.out.println("\nCartas en mano del jugador 2 al finalizar juego: " + p2_hand.size());
		for (x=0; x<p2_hand.size(); x++) {
			System.out.println("Money: " + p2_hand.get(x).money + ", Slots: " + p2_hand.get(x).slots + ", Price:" + p2_hand.get(x).price);
		}
		
		x = 0;
		System.out.println("\nCartas en tienda al finalizar juego: " + cardShop.size());
		for (x=0; x<cardShop.size(); x++) {
			
			System.out.println("Money: " + cardShop.get(x).money + ", Slots: " + cardShop.get(x).slots + ", Price:" + cardShop.get(x).price);
			
		}

	}

}

