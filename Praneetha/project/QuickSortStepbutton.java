import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
/**
 * Write a description of class QuickSortStepbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSortStepbutton extends Button
{
     int[] values={46,35,67,24};
    int i=0;
    int j=values.length-1;
    public void act() 
    {    if(Greenfoot.mouseClicked(this))
        quicksort(getValues(),getI(),getJ());
    } 
    
    public void quicksort(int[] values,int lowerIndex,int higherIndex)
    {  i = lowerIndex;
        j = higherIndex;
      int pivot = values[lowerIndex+(higherIndex-lowerIndex)/2];
        
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (values[i] < pivot) {
                i++;
            }
            while (values[j] > pivot) {
                j--;
            }
            if (i <= j) {
                 System.out.println(Arrays.toString(values));
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
          { System.out.println(Arrays.toString(values));
              quicksort(values,lowerIndex, j);
              
            }   
        if (i < higherIndex)
         {   System.out.println(Arrays.toString(values));
             quicksort(values,i, higherIndex);
            }
    }
     private void exchangeNumbers(int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
    public int[] getValues()
{
    return this.values;
}
public void setValues(int[] value)
{ for(int i=0;i<4;i++)
    this.values[i]=value[i];
   
}
public void setI(int i)
{  if(this.j==3)
    this.i=i+1;
    else
    this.i=i;
   
}
public int getI()
{    
      return i;
  
}
public int getJ()
{      
    return this.j;
   
}
public void setJ(int j)
{  if(this.j==3)
    this.j=1;
   else 
   this.j=j+1;
}
}
