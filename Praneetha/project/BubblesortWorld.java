import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BubblesortWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubblesortWorld extends World
{

    /**
     * Constructor for objects of class BubblesortWorld.
     * 
     */
    public BubblesortWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 1500, 1); 
        prepare();
    }
    public void prepare()
    {  String s="46    35    67    24";
        addObject(new Emptyarray(),348,156);
        addObject(new BubbleSortStepbutton(),80,150);
        addObject(new Resetbutton(),80,250);
        addObject(new Label(s,25),370,156);
      
    }
    
   
}
