/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to
 * subclass this more than once. The group of cards has a maximum size attribute which is flexible
 * for reuse.
 *
 * @author dancye
 */
public class DeckOfCards extends Card {

    private int decksize = 52;
    //The group of cards, stored in an ArrayList
    public ArrayList<Card> cards;
//    public Card[] cards = new Card[decksize];
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
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> cards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

    public void generateDeck() {
        cards = new ArrayList<Card>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
//                cards[countCards] = (new Card(suit, rank) {});
                cards.add(new Card(suit, rank));
            }
        }//end outter for
        shuffle();
    }//end method

}//end class

