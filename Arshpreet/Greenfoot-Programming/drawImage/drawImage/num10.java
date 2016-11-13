import greenfoot.*;
import java.awt.Font;   // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class num10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class num10 extends Numbers
{int num10=Greenfoot.getRandomNumber(100);
  
    public num10()
    {   GreenfootImage pic = new GreenfootImage(30,30);
        pic.setFont(new java.awt.Font("Forte",Font.PLAIN, 25));
        pic.drawString(Integer.toString(num10),2,20);
        setImage(pic);
    }
    /**
     * Act - do whatever the num10 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
