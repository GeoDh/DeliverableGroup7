package ca.sheridancollege.project.model;

import java.util.ArrayList;

/**
 *
 * @author Sean
 */
public class PlayerHand extends GroupOfCards{
    protected Player player;
    
    public PlayerHand(int size, Player player) {
        super(size);
        this.player = player;
        this.cards = new ArrayList<>(size);
    }
    
    @Override
    public void generateCards(){
        
    }
    

    

}
