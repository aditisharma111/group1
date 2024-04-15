package cardgame;

public class Card {

    static class SUIT {

        public SUIT() {
        }
    }
//        public static final String []SUITS={"Hearts","Clubs","Diamonds","Spades"};
      public enum Value {ACE,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,QUEEN,KING,JACK}
        public enum Suit{HEARTS,DIAMONDS,CLUBS,SPADES}
	private Suit suit;
	private Value value;

        public Card(Value value, Suit suit) {
          this.suit = suit;
          this.value = value;
        }
        
	public Suit getSuit() {
		return this.suit;
	}

	/**
	 * 
	 * @param suit
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Value getValue() {
		return this.value;
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(Value value) {
		this.value = value;
	}

}