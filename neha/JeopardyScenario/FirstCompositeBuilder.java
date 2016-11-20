import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A composite builder for welcome screen which consists of many images.
 */
public class FirstCompositeBuilder
{
    public static IFirstComponent buildFirstScreen(World world)
    {
        FirstPicture order = new FirstPicture(world);
        order.addChild(new FirstImage("firstLogo.png", 400, 200, world));
        order.addChild(new FirstImage("firstPaddle.png", 400, 560, world));
        order.chooseOperation(Operation.INSERTION_SORT);
        order.chooseOperation(Operation.MERGE_SORT);
        //order.chooseOperation(Operation.SELECT_SORT);
        //order.chooseOperation(Operation.BUBBLE_SORT);
        order.addChild(new FirstImage("firstBall.png", 400, 535, world));
        order.addChild(new FirstImage("firstSwipeUp.png", 400, 435, world));
        
        return order;
    }    
}
