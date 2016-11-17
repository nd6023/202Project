import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
/**
 * Write a description of class Stepbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSortStepbutton extends Button
{ int[] values={46,35,67,24};
    /**
     * Act - do whatever the Stepbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 int y3=156;
   
    public void act()
    
    {  
       int clicked=0;
      
        if(Greenfoot.mouseClicked(this))
        { 
        sort(values);
       
         }
}
 public void sort(int[] values)
   {     int temp;
      int length = values.length- 1;
          for(int i=0; i < values.length-1; i++){
 
            for(int j=1; j < values.length-i; j++){
                if(values[j-1] > values[j]){
                    temp=values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                } 
            int y2=y3+65;
           String s=values[0]+"     "+values[1]+"     "+values[2]+"     "+values[3];
           getWorld().addObject(new Emptyarray(),348,y2);
           y3=y2;
           getWorld().addObject(new Label(s),370,y2);
        
     // return values;    
    }
}
  getWorld().addObject(new Label("sorting done"),350,70); 
//  return  values;
}
}