/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of deck for a Game. HINT, you might want to
 * subclass this more than once. The group of deck has a maximum size attribute which is flexible
 * for reuse.
 *
 * @author dancye
 */
public class DeckOfCards extends Card {

    private final int decksize = 52;
    //The group of deck, stored in an ArrayList
    public ArrayList<Card> deck;
//    public Card[] deck = new Card[decksize];
    private int size;//the size of the grouping

    /**
     *
     * @param suit
     * @param rank
     * @param size
     */
    public DeckOfCards(Suit suit, Rank rank, int size) {
        super(suit, rank);
        this.size = size;
    }

    /**
     * A method that will get the group of deck as an ArrayList
     *
     * @return the group of deck.
     */
    public ArrayList<Card> cards() {
        return deck;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    /**
     * @return the size of the group of deck
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of deck
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

    public ArrayList<Card> generateDeck() {
        deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }//end outter for
        shuffle();
        return deck;

    }//end method

    //We need this method to deal out cards to one player and remove it from the desk
    //In the GameController class we need to create the ArrayLists for each PlayerHand
    //and pass that ArrayList into this method where it will add to that ArrayList and remove cards
    //from the shuffledDeck and return the players ArrayList Hand
    public ArrayList<Card> Deal(int totalPlayers) {
        ArrayList<Card> remainedCardsInDeck = generateDeck();

        ArrayList<Card> eachPlayerHand;
        
        if (totalPlayers < 4)
            eachPlayerHand = new ArrayList<>(7);
        else
            eachPlayerHand = new ArrayList<>(5);
//            for (int i = 0; i < 7; i++) {;
//                
//            }

        for (int i = 0; i < totalPlayers; i++) {
            
        }
        

//        for (int i = 0; i < totalPlayers; i++) {
//            Card[] "Player"+i + "Hand" = new Card[handSize];
//            int index = (int) (Math.random() * shuffledDeck.size());
//            for (int j = 0; j < handSize; j++) {
//                shuffledDeck.get(index) = playersHands[j];
//            }
//
//        }

        //if the totalPlayers in the game is 2 or 3 they're dealt seven cards            
        return eachPlayerHand;
    }
}
