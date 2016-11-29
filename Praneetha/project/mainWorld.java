import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{

    /**
     * Constructor for objects of class MainWorld.
     * 
     */
    public MainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
        prepare();
    }
    public void prepare()
    {
        addObject(new Label("Welcome to Sorting world",40,489,370),475,200);
        addObject(new bubble(),200,350);
          addObject(new merge(),650,350);
            addObject(new quick(),200,475);
              addObject(new insertion(),650,475);
                addObject(new selection(),415,600);
    }
    
}
