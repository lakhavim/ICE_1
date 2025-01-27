/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;



/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Modifier: VIMAL LAKHANI (Student ID: 991745909)
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
                c.setValue((int)(Math.random() * 13) + 1); // Random value (1-13)
                c.setSuit(Card.SUITS[(int)(Math.random() * 4)]); // Random suit (0-3)
                magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Enter your card value (1-13): ");
                    int userValue = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.println("Enter your card suit (Hearts, Diamonds, Spades, Clubs): ");
                    String userSuit = scanner.nextLine();

                    Card userCard = new Card();
                    userCard.setValue(userValue);
                    userCard.setSuit(userSuit);

        //Then report the result here
        
           boolean cardFound = false;

            for (Card c : magicHand) {
                if (c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                    cardFound = true;
                    break;
                }
            }

            if (cardFound) {
                System.out.println("Your card is in the magic hand!");
            } else {
                System.out.println("Your card is not in the magic hand.");
            }

        // add one luckcard hard code 2,clubs
    }
    
}
