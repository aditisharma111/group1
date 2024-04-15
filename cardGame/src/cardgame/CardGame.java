/*hi this is aditi
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgame;

import cardgame.Card.Suit;
import cardgame.Card.Value;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Card[] hand = CardHandGenerator.generateHand(10)
              Scanner input = new Scanner(scanner.in)
        for(Card card:hand)
        {
            System.out.println(card.getValue() + "  of " + card.getSuit());
        }//end of for
        
        System.out.println("enter a guess card" );
        
        System.out.println("Enter a value between 1 to 13");
        int valueuser =input.nextInt();
        System.out.println("Enter a suit between 0 to 3");
        int suituser =input.nextInt();
        
        Card userGuess= new Card(Card.Value.values()[valueuser],Card.Suit.values()[suituser]);
        
        //check if it matche
        boolean match=false;
        for(Card card:hand){
            if(card.getValue()==userGuess.getValue() && 
               (card.getSuit().equals(userGuess.getSuit())))
            {
                match=true;
                break;
            }
        }//end of for
                
        System.out.println("Did you guess it ?" +match);
    }//end of main
    }