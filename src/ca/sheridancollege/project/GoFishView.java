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
    
    public void run(){
        //Create scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.printf("How many players?: ");
        int totalPlayers = input.nextInt();
        
        
        
        GroupOfCards deck = new Deck(52);
        deck.generateCards();
        deck.shuffle();
        
        for(Card card : deck.getCards()){
            System.out.println(card);
        }
    }
    
    public static void main(String[] args) {
        GoFishView goFish = new GoFishView();
        goFish.run();
    }
}
