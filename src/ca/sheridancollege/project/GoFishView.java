package ca.sheridancollege.project;

import ca.sheridancollege.project.model.Player;
import ca.sheridancollege.project.model.Card;
import ca.sheridancollege.project.model.Deck;
import ca.sheridancollege.project.model.GoFishController;
import ca.sheridancollege.project.model.GroupOfCards;
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
        GroupOfCards deck = new Deck(52);
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
        
        // Player creation
        for (int i = 0; i < totalPlayers; i++) {
            System.out.printf("Player %d, please enter your name: %n", i+1);
            String playerName = input.next();
            
            controller.addPlayers(i, playerName);
            
        }
        
        controller.displayPlayer();
        
        
        
        
    }
    
    public void playerTurn(){
        
    }
    
    public void gameEnd(){
        
    }
    
    public static void main(String[] args) {
        GoFishView goFish = new GoFishView();
        
        goFish.gameInit();
    }
}
