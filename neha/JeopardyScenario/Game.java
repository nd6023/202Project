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
    boolean forever = true;
    String[] gameSequence = new String[6];
    
    
    
    /**
     * Act - do whatever the Game wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    pubilc Game(){
    	questionPool = populateQuestionPool();
    	answerPool = populateAnswerPool();
    	for(int i=0; i<gameSequence.length; i++){
    	    //Giving it a random sequence for now.
    	    gameSequence[i] = i+1;
    	}
    }
    
    ArrayList resultList = new ArrayList();
    
    public void act() 
    {
        // Add your action code here.
        while(forever){
            
            String getUserInput = readOption();
            boolean checkTrue = checkCorrectStep(getUserInput);
        
        
        }
        
    }    
    
    public void runGame(String[] inputSeq){
        if(inputSeq.length() ! = gameSequence){
            return;
        }
        else {
            
            for(int i=0; i<inputSeq.length()){
                if(inputSeq[i]== gameSequence[i])
                continue;
                else {
                    //Its not sorted yet, arrange again!
                }
            }
            
        }
    }
    
    public void runGame(){
        questionPool.getQuestions();
        answerPool.getAnswers();
        //Now start the game here.
        
        //Random sequence shows the game here.
        
    }
    
    public boolean checkCorrectStep(String userInput){
        return false;
    }
}
