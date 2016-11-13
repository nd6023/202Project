import greenfoot.*;
import java.awt.Font;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class num1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class num1 extends Numbers
{  int num1=Greenfoot.getRandomNumber(100);
  
    public num1()
    {   GreenfootImage pic = new GreenfootImage(30,30);
        pic.setFont(new java.awt.Font("Forte",Font.PLAIN, 25));
        pic.drawString(Integer.toString(num1),2,20);
        setImage(pic);
        /*int x= getX();
        int y= getY();*/
    }
                 
    /**
     * Act - do whatever the num1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
