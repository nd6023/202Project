import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A leaf object of the composite (WelcomePicture)
 */
public class FirstImage extends Actor implements IFirstComponent
{
    private String imgName;
    private int x;
    private int y;
    private boolean animationOn = false;
    private World world;
    
    public FirstImage(String imgName, int x, int y, World world)
    {
        this.imgName = imgName;
        this.x = x;
        this.y = y;
        this.world = world;
    }
    
    public void addChildren(IFirstComponent c) {}
    
    public void removeChildren(IFirstComponent c) {}
    
    public void drawComponent()
    {
        this.setImage(imgName);
        world.addObject(this, x, y);
    }
    
    public void translateOut()
    {
        animationOn = true;
    }
    
    public void act()
    {
        if (animationOn) {
            setLocation(getX(), getY()-4);
        }
        if (getY() == 0) world.removeObject(this);
    }
    
    public int getSize()
    {
        return 0;
    }
}
