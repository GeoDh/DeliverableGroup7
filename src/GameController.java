
import ca.sheridancollege.project.Card;
import ca.sheridancollege.project.DeckOfCards;

/**
 * Our main view class
 *
 * @author Sean
 */
public class GameController extends DeckOfCards {

    public static void main(String[] args) {

//        ArrayList<Player> players = new ArrayList<>();
//        ArrayList<Card> cards = new ArrayList<>();

        DeckOfCards ch = new DeckOfCards(Suit.HEART, Rank.JACK, 52);
        ch.generateDeck();
        for (Card c : ch.cards) {
            System.out.println(c.getRank() + " of " + c.getSuit());
        }

    }

    public GameController(Suit suit, Rank rank, int size) {
        super(suit, rank, size);
    }
}
