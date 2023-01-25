package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * This is a branch code
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @author Chao Yen Chou Jan 23, 2023
 * Make a change
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random()*13) + 1);
            //card.setValue(insert call to random number generator here)
            // 
            card.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i]=card;
            //System.out.println(card.getSuit() + " " + card.getValue());
        }
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Guess the card value, 1-13");
        int guessValue = scan.nextInt();
        System.out.println("Guess the card suit, Hearts, Diamonds, Spades, or Clubs");
        String guessSuit = scan.next();
        
        for (int i = 0; i < 7; i++){
            if (guessValue == hand[i].getValue()){
                if (guessSuit.equalsIgnoreCase(hand[i].getSuit())){
                    printInfo();
                }
            }
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 25, 2022
     * @author Chao Yen Chou Jan 2023
     */
    
    private static void printInfo() {
        //I'm done!
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Chao Yen Chou, my friends call me Chao");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be prepared for future jobs");
        System.out.println("-- Be a good team player");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Playing Video Games");
        System.out.println("-- Listening to Music");
        System.out.println("-- Planting");

        System.out.println();
        
    
    }

}
