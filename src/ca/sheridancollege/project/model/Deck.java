
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
    
//    public void deal(){
//        ArrayList<Card> hand = 
//    }
    
    public void draw(Player player){
        ArrayList<Card> hand = player.getPlayerHand();
        Card drawnCard = cards.get(0);
        
        hand.add(drawnCard);
        cards.remove(drawnCard);
        
        System.out.printf("%s picked up the %s of %s", player.getPlayerName(),
                drawnCard.getValue().showValue(), drawnCard.getSuit().showSuit());
    }
    
    @Override
    public void generateCards(){
        for (Suit suit : Suit.values()){
            for (Value value : Value.values()){
                cards.add(new Card(suit, value));
            }
        }
    }
}
