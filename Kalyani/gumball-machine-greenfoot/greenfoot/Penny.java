import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penny here.
 * 
 * @Kalyani
 * @1.0
 */
public class Penny extends Coin
{   
    private Boolean isClicked=false;
    public Penny()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;        
    }
    
    public void act() 
    {
        int mouseX, mouseY ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
        } 
    }   
}
