package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */

import java.util.Random;
import java.util.Scanner;


public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue(random.nextInt(13) + 1); // Generates random value between 1 and 13
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            card.setSuit(random.nextInt(4)); // Generates random suit index between 0 and 3
            hand[i] = card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
                System.out.println("Enter your card value (1-13):");
        int value = scanner.nextInt();
        System.out.println("Enter your card suit (0-3):");
        int suit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit() == userCard.getSuit()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card was found in the hand.");
            userCard.printInfo();
        } else {
            System.out.println("Sorry, your card was not found in the hand.");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        System.out.println("Im done");
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Danielle");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Something to allow me more freedom in my life");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Reading self development");
        System.out.println("-- Listening to music");
        System.out.println("-- Reading/Watching TV");

        System.out.println();
        
    
    }

}
