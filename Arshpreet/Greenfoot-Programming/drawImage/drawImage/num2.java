import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;

/**
 * Write a description of class num2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class num2 extends Numbers
{int num2=Greenfoot.getRandomNumber(100);
  
    public num2()
    {   GreenfootImage pic = new GreenfootImage(30,30);
        pic.setFont(new java.awt.Font("Forte",Font.PLAIN, 25));
        pic.drawString(Integer.toString(num2),2,20);
        setImage(pic);
        /*int x= getX();
        int y= getY();*/
    }
    /**
     * Act - do whatever the num2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
