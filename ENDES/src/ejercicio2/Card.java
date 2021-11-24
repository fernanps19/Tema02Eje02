package ejercicio2;

public class Card {
	//creo las cadenas suit y value
	public String suit;
	public String value;
	
	//creo el metodo carta que recibe dos cadenas suit y value
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	// creo el metodo toString para juntar en una sola cadena las dos cadenas anteriores
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}