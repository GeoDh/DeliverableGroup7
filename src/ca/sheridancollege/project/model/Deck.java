
package ca.sheridancollege.project.model;

import ca.sheridancollege.project.model.Card.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Deck extends GroupOfCards {

    public Deck(int size) {
        super(size);
        cards = new ArrayList<>(size);
    }
    
    public void draw(PlayerHand playerHand){
        playerHand.cards.add(cards.get(0));
        cards.remove(0);
    }
    
    @Override
    public void generateCards() {
        for (Suit suit : Suit.values()){
            for (Value value : Value.values()){
                cards.add(new Card(suit, value));
            }
        }
    }
}
