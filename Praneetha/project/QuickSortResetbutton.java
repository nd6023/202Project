import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Resetbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSortResetbutton extends Button
{// BubblesortWorld b=new BubblesortWorld();
    /**
     * Act - do whatever the Resetbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     //   // Add your action code here.
     if(Greenfoot.mousePressed(this))
     {
        Greenfoot.setWorld(new quicksortWorld());
    }
    }    
}