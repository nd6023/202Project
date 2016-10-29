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
{   public ArrayList<Integer> nums;
   public displayText()
   {   
      
       nums = new ArrayList<Integer>();
        for (int i = 0; i < 15; i++)
            nums.add(Greenfoot.getRandomNumber(100));
        
                        
                 GreenfootImage pic = new GreenfootImage(100, 400);
                 
                 for (int j=0;j<nums.size();j++)
                 {pic.drawString(nums.get(j)+"\n",75,30+j*20);
                    }
                setImage(pic);   
                                 
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
