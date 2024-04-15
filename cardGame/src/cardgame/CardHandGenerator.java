package cardgame;

import java.util.Random;

public class CardHandGenerator {

	
	public static Card[] generateHand(int numOfcards) {
            
        Card[] hand = new Card[numOfcards];
        Random random =new Random();
       
        for(int i=0;i<hand.length;i++){
            Card.Value value =Card.Value.values()[random.nextInt(13)+1];
            
            Card.Suit suit = Card.Suit.values()[random.nextInt(4)];
            
            Card card=new Card(value,suit);
            hand[i]=card;
         
        }   //end of for
	return hand;	
        }
	
}
