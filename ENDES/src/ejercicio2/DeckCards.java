package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
		//añado dos arrays con cadenas con los valores de todas las cartas
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		
		ArrayList<Card> deck = new ArrayList<Card>();
		
		/*bucle(i) para leer el array suits y por cada vuelta otro bucle(j) para leer values y crear una 
		carta con el valor de la poicion i con la el valor de la posicion j y las añado a un mazo (deck)*/
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		
		//bucle para barajar el mazo anterior generando valores aleatorios 
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		
		//bucle para leer el mazo y mostras las 5 primeras posiciones del array
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
