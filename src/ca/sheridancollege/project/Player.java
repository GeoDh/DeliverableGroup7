/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public abstract class Player {
    protected String playerID; //the unique ID for this player
    
    public Player(String playerID){
        this.playerID = playerID;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * 
     * @param playerID 
     */
    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    
    public abstract void play();
    
}
