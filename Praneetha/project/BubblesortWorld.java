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
        super(800, 600, 1); 
        prepare();
    }
    public void prepare()
    {
        addObject(new Emptyarray(),370,156);
        addObject(new Stepbutton(),207,306);
        addObject(new Resetbutton(),476,306);
        addObject(new Ipointer(),120,95);
        addObject(new Obj1(46),120,156);
        addObject(new Obj2(35),170,156);
        addObject(new Obj3(67),220,156);
        addObject(new Obj4(24),270,156);
        addObject(new Obj5(36),320,156);
        addObject(new Obj6(97),370,156);
        addObject(new Obj7(7),420,156);
        addObject(new Obj8(56),470,156);
        addObject(new Obj9(72),520,156);
        addObject(new Obj10(14),570,156);
        addObject(new Obj11(27),620,156);
    }
    
   
}
