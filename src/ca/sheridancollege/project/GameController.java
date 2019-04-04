package ca.sheridancollege.project;

/**
 * Our main view class
 *
 * @author Sean
 */
public class GameController extends DeckOfCards {

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards(Card.Suit.HEART, Card.Rank.JACK, 52);
        
        
        
        for (Card card : deck.generateDeck()) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
    }

    public GameController(Card.Suit suit, Card.Rank rank, int size) {
        super(suit, rank, size);
    }
}
