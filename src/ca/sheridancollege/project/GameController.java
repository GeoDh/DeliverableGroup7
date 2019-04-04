package ca.sheridancollege.project;

import java.util.Scanner;

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

        Scanner input = new Scanner(System.in);

        //set initial player size
        int playerSize = 0;

        //set initial deck size
        do {
            System.out.print("How many people are going to play? ");
            try {
                playerSize = input.nextInt();

                if (playerSize <= 1 || playerSize > 5) {
                    throw new UnsupportedPlayerSize();
                }

            } catch (UnsupportedPlayerSize invPlayers) {
                System.out.println("Invalid player size selected. Please try again.");
            }
        } while (playerSize <= 1 || playerSize > 5);

        System.out.println("Total Amount of players is: " + playerSize);
        //Player list
        Player[] players = new Player[playerSize];

        for (int i = 0; i < playerSize; i++) {
            System.out.println("What is player " + (i + 1) + "'s name? ");
            players[i] = new Player(input.next()) {};
        }

        System.out.print("Players: ");
        for (int i = 0; i < playerSize; i++) {
            System.out.print(players[i].getPlayerID() + "  ");
        }

    }

    public GameController(Card.Suit suit, Card.Rank rank, int size) {
        super(suit, rank, size);
    }

}
