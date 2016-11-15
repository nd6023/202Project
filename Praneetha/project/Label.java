import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
  
    
    public Label(String s)
    { 
        GreenfootImage img1=new GreenfootImage(250,30);
        img1.setFont(new java.awt.Font("Forte", Font.PLAIN, 25));
        img1.drawString(s,2,20);
        setImage(img1);
        
    }
    
}
