package ca.sheridancollege.project;

import ca.sheridancollege.project.model.Player;
import ca.sheridancollege.project.model.Card;
import ca.sheridancollege.project.model.Deck;
import ca.sheridancollege.project.model.GoFishController;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Our main view class
 *
 * @author Sean
 */
public class GoFishView{
    
    private final GoFishController controller;
    
    public GoFishView(){
        controller = new GoFishController();
    }
    
    public void gameInit(){
        //Create scanner object
        Scanner input = new Scanner(System.in);
        
        // Initialize, generate, and shuffle deck
        Deck deck = new Deck(52);
        deck.generateCards();
        deck.shuffle();
        
        // Declare total amount of players
        System.out.println("How many players?: "
                + "\n2 PLAYERS"
                + "\n3 PLAYERS"
                + "\n4 PLAYERS");
        int totalPlayers = input.nextInt();
        
        // Set important information to create game
        controller.createGame("Go Fish", totalPlayers);   
        controller.setHandsize();
        
        // Player creation
        for (int i = 0; i < totalPlayers; i++) {
            System.out.printf("Player %d, please enter your name: %n", i+1);
            String playerName = input.next();
            
            controller.addPlayers(i, playerName);
            
        }
        
        Player[] players = controller.
        int handSize = controller.getThisHandSize();
        
        deck.deal(players, handSize);
        
        
//        controller.displayPlayers();
        
    }
    
    public void playerTurn(){
        Player winner = controller.get
        while()
        controller.displayPlayer(0);
    }
    
    public void gameEnd(){
        
    }
    
    public static void main(String[] args) {
        GoFishView goFish = new GoFishView();
        goFish.gameInit();
        goFish.playerTurn();
        goFish.gameEnd();
    }
}
