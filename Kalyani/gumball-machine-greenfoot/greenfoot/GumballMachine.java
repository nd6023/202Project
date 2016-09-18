import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @Kalyani
 * @1.0
 */
public class GumballMachine extends Actor
{
    
    private Boolean isCoinInserted = false;
    private Boolean isCrankTurned = false;
    private World world = getWorld();
    private Message message;
        
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }
    
    public GreenfootImage setText(String msg)
    {
        GreenfootImage gi;
        gi= new GreenfootImage(100,50);
        gi.setColor(java.awt.Color.YELLOW);
        gi.fill();
        gi.setColor(java.awt.Color.BLACK);
        gi.drawString(msg,0,25);
        return gi;
    }
    
    public Message setMessage(Message message, String str, int X, int Y)
    {
        Message msg = new Message();
        if(message!=null)
        {
            msg = message;
        }
        if (str!=null && !str.isEmpty())
        {
            msg.setImage(setText(str));
        }
        World world = getWorld();
        world.addObject(msg,X,Y);
        return msg;
    }
    
      public void act() 
    {
      inspectCoin();
      if(isCoinInserted)
      findPicker();
     }
    
    public void findPicker()
    {
        int mouseX, mouseY;
        if(!isCrankTurned && Greenfoot.mousePressed(this)){
            if(isCoinInserted){
                message.getImage().clear();
            }
        isCrankTurned = true;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mouseX=mouse.getX();
        mouseY=mouse.getY();
        Message m = new Message();
        m.setImage(setText("Crank Turned!"));
        World world= getWorld();
        if(m.getWorld() != null)
        {
            world.removeObject( m ) ;
        }
        world.addObject(m, mouseX, mouseY ) ;
        Alien alien = new Inspector();
        Picker picker;
        switch(alien.findRandomPicker())
        {
            case 0: picker = new RandomPicker(); setMessage(null,"Random Picker",500,350); setMessage(picker.pickball(),null,200,400);break;
            case 1: picker = new GreenPicker(); setMessage(null,"Green Picker",500,350); setMessage(picker.pickball(),null,200,400);break;
        }
    }
    }
    
    public void inspectCoin()
    {
        Actor coin;
        coin = getOneIntersectingObject(Coin.class);
        Alien alien = new Inspector();
        Picker picker;
        if ( coin!= null)
        {
            if(coin instanceof FakeQuarter){
                message=setMessage(null,"Fake Quarter!",getX(),getY());
            }
            else if(coin instanceof Quarter){
                isCoinInserted=true;
                message=setMessage(null,"Have Coin!",getX(),getY());
            }
            else{
                message=setMessage(null,"Only Quarters accepted!",getX(),getY());
            }
            World world = getWorld();
            world.removeObject(coin);
        }     
     
    }
}
