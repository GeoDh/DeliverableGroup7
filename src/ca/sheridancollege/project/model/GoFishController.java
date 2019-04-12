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
        this.goFish = new GoFish();
        
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
    
    public Player[] getThesePlayers(){
        return goFish.getPlayers();
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
   
    public void setHandsize(){
        int totalPlayers = goFish.getTotalPlayers();
        
        if(totalPlayers <= 3)
            goFish.setHandSize(7);
        else
            goFish.setHandSize(5);
    }
    
    public int getThisHandSize(){
        return goFish.getHandSize();
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
    
    public void displayPlayers(){
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
