import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @Kalyani 
 * @1.0
 */
public class Alien extends Actor
{
    Message m = new Message();
    public Alien()
    {
        GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 
    }
    public void setMessage ( String msg )
    {
        int mouseX, mouseY;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mouseX=mouse.getX();
        mouseY=mouse.getY();
        World world= getWorld();
        if(m.getWorld() != null)
        {
            world.removeObject( m ) ;
        }
        world.addObject(m, mouseX, mouseY ) ;
        m.setText( msg ) ;
    }
    
    public void act()
    {
    }
    
    public void pick() 
    {
               World world=getWorld();
    }  
    
    public int findRandomPicker(){
        return 0;
    }
}
