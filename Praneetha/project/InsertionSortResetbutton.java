import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InsertionSortResetbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsertionSortResetbutton extends Button
{
    /**
     * Act - do whatever the InsertionSortResetbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
     //   // Add your action code here.
     if(Greenfoot.mousePressed(this))
     {
        Greenfoot.setWorld(new InsertionsortWorld());
    }
    }       
}
