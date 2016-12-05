import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quicksortWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MergesortWorld extends World
{

    /**
     * Constructor for objects of class quicksortWorld.
     * 
     */
    public MergesortWorld()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    public void prepare()
    {   addObject(new Emptyarray(),350,156);
        addObject(new Emptyarray(),650,156);
        addObject(new Emptyarray2(),500,300);
        addObject(new MergeSortStepbutton(),80,150);
        addObject(new MergeSortResetbutton(),80,250);
         addObject(new Home(),100,350);
        addObject(new Ipointer(),270,115);
        addObject(new Jpointer(),570,115);
        addObject(new Obj(2),270,156);
        addObject(new Obj(7),320,156);
        addObject(new Obj(26),370,156);
        addObject(new Obj(49),420,156);
        addObject(new Obj(3),570,156);
        addObject(new Obj(5),620,156);
        addObject(new Obj(17),670,156);
        addObject(new Obj(22),730,156);
    }
    
}
