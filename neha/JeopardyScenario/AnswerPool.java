import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; 

/**
 * Write a description of class AnswerPool here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnswerPool extends Game
{
    /**
     * Act - do whatever the AnswerPool wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    ArrayList list = new ArrayList();
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void populateAnswerPool(){
        list.add("Merge Sort");

        list.add("Bubble Sort");
        list.add("Insertion Sort");
        list.add("Selection Sort");
        //list.add("Merge Sort");//Code to popoluate answere pool goes here
    }
}
