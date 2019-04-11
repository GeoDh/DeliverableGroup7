package ca.sheridancollege.project.model;


/**
 *
 * @author Henson Mak
 * Date: 2019.04.10
 */
public class GoFishController{
    
    private GoFish goFish;

    public GoFishController() {
        goFish = new GoFish();
    }
    
    public void createGame(String gameName, int totalPlayers){
        goFish.setGameName(gameName);
        goFish.setTotalPlayers(totalPlayers);
        goFish.
    }
    
    public void addPlayers(){
        goFish
    }
    
    public int handsize(){
        if(totalPlayers <= 3)
            return 7;
        else
            return 5;
    }
}
