/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;





/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Modifier: VIMAL LAKHANI (Student ID: 991745909)
 * @author srinivsi
 */
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]); // Random suit from SUITS array
            magicHand[i] = c;
            System.out.println("Card " + (i + 1) + ": " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }

       


        // add one luckcard hard code 2,clubs
        Card luckCard = new Card();
        luckCard.setValue(2);
        luckCard.setSuit(Card.SUITS[3]); // 2 corresponds to Clubs in the SUITS array
        System.out.println("The luck card is: " + luckCard.getValue() + " of " + luckCard.getSuit());
        
        // Search magicHand for the luckCard
        boolean luckFound = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckCard.getValue() && c.getSuit().equals(luckCard.getSuit())) {
                luckFound = true;
                break;
            }
        }

        // Report the result
        if (luckFound) {
            System.out.println("The luck card is in the magic hand. You win!");
        } else {
            System.out.println("The luck card is not in the magic hand. Better luck next time!");
        }

    }
    
}
