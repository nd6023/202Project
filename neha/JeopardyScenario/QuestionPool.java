import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class QuestionPool here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionPool extends Game
{
    /**
     * Act - do whatever the QuestionPool wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private ArrayList questions = new ArrayList();
    
    public QuestionPool(){
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public ArrayList getQuestions(){
        return questions;
    }
}
