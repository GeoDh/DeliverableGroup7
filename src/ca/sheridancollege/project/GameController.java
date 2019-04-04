package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * Our main view class
 *
 * @author Sean
 */
public class GameController extends DeckOfCards {

    public static void main(String[] args) {

//        ArrayList<Player> players = new ArrayList<>();
//        ArrayList<Card> deck = new ArrayList<>();
        DeckOfCards deck = new DeckOfCards(Suit.HEART, Rank.JACK, 52);
//        deck.generateDeck();

        for (Card card : deck.generateDeck()) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
    }

    public GameController(Suit suit, Rank rank, int size) {
        super(suit, rank, size);
    }
}
