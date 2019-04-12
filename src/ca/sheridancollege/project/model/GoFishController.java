package ca.sheridancollege.project.model;

import java.util.ArrayList;


/**
 *
 * @author Henson Mak
 * Date: 2019.04.10
 */
public class GoFishController{
    
    private final GoFish goFish;

    public GoFishController() {
        goFish = new GoFish();
        
    }
    
    /**
     * 
     * @param gameName
     * @param totalPlayers 
     */
    public void createGame(String gameName, int totalPlayers){
        goFish.setGameName(gameName);
        goFish.setTotalPlayers(totalPlayers);
        goFish.setPlayers(new Player[totalPlayers]);
    }
    
    /**
     * 
     * @param playerID
     * @param playerName 
     */
    public void addPlayers(int playerID, String playerName){
        goFish.getPlayers()[playerID] = new Player(playerName);
    }
    
    /**
     * 
     * @param player 
     */
    public void addBook(Player player){
        ArrayList<Card> hand = player.getPlayerHand();
        
        for(Card card: hand){
            
        }
    }
    
    /**
     * 
     * @return 
     */
    public int handsize(){
        int totalPlayers = goFish.getTotalPlayers();
        
        if(totalPlayers <= 3)
            return 7;
        else
            return 5;
    }
    
    public void declareWinner(){
        Player[] players = goFish.getPlayers();
        Player mostBooks = players[0];
        
        for (Player player : players) {
            if (player.getBook() > mostBooks.getBook()) {
                mostBooks = player;
            }
        }
        
        goFish.setWinner(mostBooks);
    }
    
    public void displayPlayer(){
        Player[] players = goFish.getPlayers();

        for (Player player : players) {
            System.out.println(player.toString());
        }
    }
    
    public void displayPlayer(int i){
        Player[] players = goFish.getPlayers();

        System.out.println(players[i].toString());
    }
    
    
}
