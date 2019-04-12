/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Sean
 */
package ca.sheridancollege.project.model;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */

public class Player {
    private String playerName;
    private ArrayList<Card> playerHand;
    private int book;
    
    public Player(String playerName){
        this.playerName = playerName;
        playerHand = new ArrayList<>();
    }
    
    public String getPlayerName(){
        return playerName;
    }
    
    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the book
     */
    public int getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(int book) {
        this.book = book;
    }
    
    /**
     * @return the playerHand
     */
    public ArrayList<Card> getPlayerHand() {
        return playerHand;
    }

    /**
     * @param playerHand the playerHand to set
     */
    public void setPlayerHand(ArrayList<Card> playerHand) {
        this.playerHand = playerHand;
    }
    
    public void askPlayer(Player otherPlayer, Card askingCard, Deck deck){
        ArrayList<Card> otherHand = otherPlayer.getPlayerHand();
        
        boolean flag = false;
        for(Card card : otherHand){
            if(card == askingCard){
                this.getPlayerHand().add(card);
                otherHand.remove(card);
                flag = true;
                break;
            }
        }
        
        if(flag){
            System.out.printf("You snagged %s's %s of %s.", otherPlayer.getPlayerName(), 
                    askingCard.getValue().showValue(), askingCard.getSuit().showSuit());
        }else{
            System.out.println("Go Fish!");
            deck.draw(this);
        }
    }

    @Override
    public String toString() {
        String format = "Player Name: %s"
                + "%nHand: %s";
        return String.format(format, playerName, playerHand);
    }
    
    

}
