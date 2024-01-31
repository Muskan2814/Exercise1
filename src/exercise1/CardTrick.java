package exercise1;
import java.util.Random;
import java.util.Scanner;


/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
         Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(10) + 1); // Values from 1 to 10
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit index from 0 to 3
            hand[i] = card;
        }
        
        // Ask the user for Card value and suit
        System.out.print("Enter the card value of your guess: ");
        int userValue = scanner.nextInt();

        System.out.print("Enter the suit : ");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex - 1]; // Adjust for 0-based array

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search for a match in the hand
        boolean matchFound = false;
        for (Card card : hand) {
            if (card.equals(userCard)) {
                matchFound = true;
                break;
            }
        }



        
        
          

        

          // Check if the guess is successful
        if (matchFound) {
            printInfo();
        } else {
            System.out.println("Sorry, no match found. Better luck next time!");
        }
    }


    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Muskan.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("I want to a software programmer");
        System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("I love Dancing,Traveling and listening music");
        System.out.println();
        
    
    }

}
