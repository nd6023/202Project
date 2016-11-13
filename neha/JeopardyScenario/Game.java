import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends Actor
{
    
    QuestionPool questionPool = new QuestionPool();
    AnswerPool answerPool = new AnswerPool(); 
    
    /**
     * Act - do whatever the Game wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    pubilc Game(){
    	questionPool = populateQuestionPool();
    	answerPool = populateAnswerPool();
    }
    
    ArrayList resultList = new ArrayList();
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void runGame(){
        questionPool.getQuestions();
        answerPool.getAnswers();
        //Now start the game here.
        
        //Random sequence shows the game here.
        
    }
}
