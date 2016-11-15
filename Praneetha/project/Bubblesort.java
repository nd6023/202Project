
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bubblesort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bubblesort extends Actor
{   int[] values={46,35,67,24};
     int y3=156;
    public void act() 
    {     boolean clicking=true;;
        int temp;
      int length = values.length- 1;
          for(int i=0; i < values.length-1; i++){
 
            for(int j=1; j < values.length-i; j++){
                if(values[j-1] > values[j]){
                    temp=values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                }
            
           int y2=y3+30;
      BubblesortWorld world=(BubblesortWorld)getWorld();
      String s=values[0]+"    "+values[1]+"    "+values[2]+"    "+values[3];
      System.out.println(s);
    Label label=new Label(s);
     Emptyarray emp=new Emptyarray();
     getWorld().addObject(emp,348,y2);
      y3=y2;
      world.addObject(label,348,y2);
     
          
    }
}
       // return value
     
  }
}
