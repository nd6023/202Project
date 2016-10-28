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
        addObject(new Obj1(),120,156);
        addObject(new Obj2(),170,156);
        addObject(new Obj3(),220,156);
        addObject(new Obj4(),270,156);
        addObject(new Obj5(),320,156);
        addObject(new Obj6(),370,156);
        addObject(new Obj7(),420,156);
        addObject(new Obj8(),470,156);
        addObject(new Obj9(),520,156);
        addObject(new Obj10(),570,156);
        addObject(new Obj11(),620,156);
    }
    
   
}
