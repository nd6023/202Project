import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @Kalyani 
 * @1.0 
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
    }
    
    public void pick() 
    {
        World world = getWorld();
        Gumball gb = new GreenGumball();
        world.addObject(gb,500,500);
        setMessage(gb.getClass().getName());
    }   
    
    public Message pickball()
    {
        Gumball gumball = new Gumball();
        return gumball.giveball(2);
    }
   
}
