/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of deck for a Game. HINT, you might want to
 * subclass this more than once. The group of deck has a maximum size attribute which is flexible
 * for reuse.
 *
 * @author dancye
 */
public class GroupOfCards{

    // Initialize data fields
    protected ArrayList<Card> cards; //The group of deck, stored in an ArrayList
    protected int size; //the size of the grouping

    public GroupOfCards(int size){
        this.size = size;
        this.cards = new ArrayList<>(size);
    }

    /**
     * A method that will get the group of deck as an ArrayList
     *
     * @return the group of deck.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public void generateCards(){
        
    }
}
