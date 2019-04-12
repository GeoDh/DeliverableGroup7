/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project.model;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public class GoFish{
    private String gameName;
    private int totalPlayers;
    private int totalBooks;
    private Player[] players;
    private Player winner;
    
    /**
     * @return the players
     */
    public Player[] getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(Player[] players) {
        this.players = players;
    }
    
    /**
     * 
     * @return 
     */
    public String getGameName(){
        return gameName;
    }
    
    /**
     * 
     * @param gameName 
     */
    public void setGameName(String gameName){
        this.gameName = gameName;
    }
    
    /**
     * 
     * @return 
     */
    public int getTotalPlayers(){
        return totalPlayers;
    }
    
    /**
     * 
     * @param totalPlayers 
     */
    public void setTotalPlayers(int totalPlayers){
        
    }

    /**
     * @return the winner
     */
    public Player getWinner() {
        return winner;
    }

    /**
     * @param winner the winner to set
     */
    public void setWinner(Player winner) {
        this.winner = winner;
    }
    
    

    
}
