import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rectangle extends Actor
{   public rectangle()
    {   GreenfootImage pic= new GreenfootImage(100,110);
        pic.drawRect(20,52,60,50);
        setImage(pic);
        
    }
    /**
     * Act - do whatever the rectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        slow++;
        setLocation(40,50);// Add your action code here.
    }    
}
