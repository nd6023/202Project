import greenfoot.*;
import java.awt.Color;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class displayText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class displayText extends Actor
{   private ArrayList<Integer> numbers;
   public displayText()
   {   
       Random rand = new Random(); 
        
        for (int i=0;i<=numbers.size;i++){
                     numbers[i] = rand.nextInt(100)+1;
                
                    }
                  
                 GreenfootImage pic = new GreenfootImage(100, 400);
                 for (int j=0;j<numbers.size;j++)
                 {
                    }
                                 
   }
    /**
     * Act - do whatever the displayText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
