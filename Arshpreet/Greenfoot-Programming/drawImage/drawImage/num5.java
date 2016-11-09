import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font; 

/**
 * Write a description of class num5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class num5 extends Numbers
{int num5=Greenfoot.getRandomNumber(100);
  
    public num5()
    {   GreenfootImage pic = new GreenfootImage(30,30);
        pic.setFont(new java.awt.Font("Forte",Font.PLAIN, 25));
        pic.drawString(Integer.toString(num5),2,20);
        setImage(pic);
    }
    /**
     * Act - do whatever the num5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
