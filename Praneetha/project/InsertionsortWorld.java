import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quicksortWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsertionsortWorld extends World
{

    /**
     * Constructor for objects of class quicksortWorld.
     * 
     */
    public InsertionsortWorld()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    public void prepare()
    {
        addObject(new Emptyarray(),350,156);
        addObject(new InsertionSortStepbutton(),80,150);
        addObject(new InsertionSortResetbutton(),80,250);
         addObject(new Home(),100,350);
        addObject(new Ipointer(),270,115);
        addObject(new Current(),270,95);
        addObject(new Obj(46),270,156);
        addObject(new Obj(92),320,156);
        addObject(new Obj(65),370,156);
        addObject(new Obj(24),420,156);
       
    }
    
}
