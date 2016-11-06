import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stepbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stepbutton extends Button
{ Bubblesort bubblesort=new Bubblesort();
    /**
     * Act - do whatever the Stepbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        if(Greenfoot.mousePressed(this))
        {
          
          bubblesort.act();
        
        }// Add your action code here.
    }    
}
