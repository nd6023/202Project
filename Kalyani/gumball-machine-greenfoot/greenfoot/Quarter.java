import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quarter here.
 * 
 * @Kalyani
 * @1.0
 */
public class Quarter extends Coin
{

    public Quarter()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ;           
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
