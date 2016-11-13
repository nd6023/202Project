import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;

/**
 * Write a description of class num9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class num9 extends Numbers
{int num9=Greenfoot.getRandomNumber(100);
  
    public num9()
    {   GreenfootImage pic = new GreenfootImage(30,30);
        pic.setFont(new java.awt.Font("Forte",Font.PLAIN, 25));
        pic.drawString(Integer.toString(num9),2,20);
        setImage(pic);
    }
    
    /**
     * Act - do whatever the num9 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
