import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gumball here.
 * 
 * @Kalyani
 * @1.0
 */
public class Gumball extends Actor
{

    public Gumball()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ; 
    }

    public void act() 
    {
    }
    
    public Message setGbImage()
    {
        return null;
    }
    
    public Message giveball( int lottery)
    {
        Gumball gumball = new Gumball();
        switch(lottery)
        {
            case 1: int num = Greenfoot.getRandomNumber(2);
            switch(num)
            { 
                case 0: gumball = new RedGumball(); break;
                case 1: gumball = new BlueGumball(); break;
            }
            break;
            case 2: gumball = new GreenGumball(); break;
        }
        GreenfootImage ig = gumball.getImage();
        Message message = new Message();
        message.setImage(ig);
        return message;
    }
}
