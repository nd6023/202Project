import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quicksortWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuicksortWorld extends World
{

    /**
     * Constructor for objects of class quicksortWorld.
     * 
     */
    public QuicksortWorld()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    public void prepare()
    {
        addObject(new Emptyarray2(),454,156);
        addObject(new QuickSortStepbutton(),80,150);
        addObject(new QuickSortResetbutton(),80,250);
        addObject(new Home(),100,350);
        addObject(new Pivot(),270,100);
        addObject(new Ipointer(),270,115);
        addObject(new Jpointer(),650,115);
        addObject(new Obj(46),270,156);
        addObject(new Obj(92),320,156);
        addObject(new Obj(65),370,156);
        addObject(new Obj(24),420,156);
        addObject(new Obj(10),470,156);
        addObject(new Obj(77),520,156);
        addObject(new Obj(33),570,156);
        addObject(new Obj(9),620,156);
    }
    
}
