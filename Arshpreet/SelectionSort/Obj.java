import greenfoot.*;
import java.awt.Font;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obj extends NumberObjects
{
    int number;
    /**
     * Act - do whatever the Obj1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Obj(int number)
    { 
        this.number=number;
        GreenfootImage img1=new GreenfootImage(30,30);
        img1.setFont(new java.awt.Font("Forte", Font.PLAIN, 25));
        img1.drawString(Integer.toString(number),2,20);
        setImage(img1);
 
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    public int getNumber()
    {
        return number;
    }
    public void setNumber(int num)
    {
        this.number=num;
    }
}
