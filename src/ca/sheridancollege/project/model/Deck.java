
package ca.sheridancollege.project.model;

import ca.sheridancollege.project.model.Card.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class Deck{

    private ArrayList<Card> cards; //The group of deck, stored in an ArrayList
    public int size;
    
    public Deck(int size) {
        this.size = size;
        cards = new ArrayList<>(size);
    }
    
    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public void deal(Player[] players, int handSize){
        for(Player player: players){
            for (int i = 0; i < handSize; i++) {
            player.getPlayerHand().add(getCards().get(i));
            getCards().remove(i);
        }
        }
        
        
    }
    
    public void draw(Player player){
        ArrayList<Card> hand = player.getPlayerHand();
        Card drawnCard = getCards().get(0);
        
        hand.add(drawnCard);
        getCards().remove(drawnCard);
        
        System.out.printf("%s picked up the %s of %s", player.getPlayerName(),
                drawnCard.getValue().showValue(), drawnCard.getSuit().showSuit());
    }
    
    public void shuffle() {
        Collections.shuffle(getCards());
    }
    
    public void generateCards(){
        for (Suit suit : Suit.values()){
            for (Value value : Value.values()){
                getCards().add(new Card(suit, value));
            }
        }
    }

    
}
