import greenfoot.*;
import java.awt.Font;
/**
 * Write a description of class num7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class num7 extends Numbers
{int num7=Greenfoot.getRandomNumber(100);
  
    public num7()
    {   GreenfootImage pic = new GreenfootImage(30,30);
        pic.setFont(new java.awt.Font("Forte",Font.PLAIN, 25));
        pic.drawString(Integer.toString(num7),2,20);
        setImage(pic);
    }
    /**
     * Act - do whatever the num7 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
