import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * A response displayed after each question.
 *
 * @author Kalyani
 * @version 1.0 
 */
public class Response extends Actor implements ActionListener {
    private static final int LINE_LENGTH = 60;
    private static GreenfootImage img;
    private Question question;
    private Type type;
    private Button right;
    private Button wrong;
    private GameManager world;
    /** The type of the response. */
    public enum Type { RIGHT, WRONG, SELF }

    /**
     * Create a new response with required information.
     *
     * @param q The Question for this response.
     * @param t The type of this response.
     */
    public Response(Question q, Type t) {
        setQuestion(question);
        setType(t);
        right = new Button("Right", 1);
        right.setFont(GameManager.SMALL_FONT);
        right.addActionListener(this);
        wrong = new Button("Wrong", 0);
        wrong.setFont(GameManager.SMALL_FONT);
        wrong.addActionListener(this);
    }

    /**
     * Check for the end of the response.
     */
    public void act() {
        if (type != Type.SELF && (Greenfoot.isKeyDown("space")
            || Greenfoot.mouseClicked(this))) {
            world.endQuestion();
        }
    }