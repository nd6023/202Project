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
  
    
    public Label(String s,int x)
    { 
        GreenfootImage img1=new GreenfootImage(250,30);
        img1.setFont(new java.awt.Font("Comic Sans MS",Font.PLAIN, x));
        img1.drawString(s,2,20);
        setImage(img1);
        
    }
    
    public Label(String s,int x,int x1,int y1)
    { 
        GreenfootImage img1=new GreenfootImage(x1,y1);
        img1.setFont(new java.awt.Font("Comic Sans MS",Font.PLAIN, x));
        img1.drawString(s,2,200);
        setImage(img1);
        
    }
}
