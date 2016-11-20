import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quicksortWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class quicksortWorld extends World
{

    /**
     * Constructor for objects of class quicksortWorld.
     * 
     */
    public quicksortWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 1500, 1); 
        prepare();
    }
    public void prepare()
    {
       String s="46     92     65     24      10     77      33      9";
        addObject(new Emptyarray2(),450,156);
        addObject(new QuickSortStepbutton(),80,250);
        addObject(new QuickSortResetbutton(),80,350);
        addObject(new Label(s,25,500,200),440,60);  
    }
}
