import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    IPlayerState playerState;
    
    public Player(){
        
        playerState = new NotStartedState();
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    void beginsPlaying(){}
}
