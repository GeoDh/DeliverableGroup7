/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Sean
 */
package ca.sheridancollege.project.model;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */

public class Player {
    protected String playerID; //the unique ID for this player
    protected String playerName;
    protected final PlayerHand playerHand;
    
    public Player(String playerID, String playerName, PlayerHand playerHand){
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerHand = playerHand;
    }
    
    public String getPlayerID() {
        return playerID;
    }
    
    public String getPlayerName(){
        return playerName;
    }
    
    public void askPlayer(PlayerHand otherPlayer, Card card){
        for(Card card : otherPlayer){
            
        }
    }
    
}
