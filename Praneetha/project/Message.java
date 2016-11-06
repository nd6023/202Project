import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{    GreenfootImage gi;
    /**
     * Act - do whatever the message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Message()
    {
        gi=new GreenfootImage(100,50);
        setImage(gi);
    }
    public void setText(String msg)
    {
        gi.clear();
        gi.setColor(java.awt.Color.YELLOW);
        gi.fill();
        gi.setColor(java.awt.Color.BLACK);
        gi.drawString(msg,0,25);
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            World world=getWorld();
            world.removeObject(this);
        } 
    }    
}
