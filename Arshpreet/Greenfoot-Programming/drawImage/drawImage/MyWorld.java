import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
       
        addObject(new num1(),120,156);
        addObject(new num2(),170,156);
        addObject(new num3(),220,156);
        addObject(new num4(),270,156);
        addObject(new num5(),320,156);
        addObject(new num6(),370,156);
        addObject(new num7(),420,156);
        addObject(new num8(),470,156);
        addObject(new num9(),520,156);
        addObject(new num10(),570,156);
        //addObject(new rectangle(),120,120);
        
       
    }
}
