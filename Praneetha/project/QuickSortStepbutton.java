import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
/**
 * Write a description of class QuickSortStepbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSortStepbutton extends Button
{  int y3=96,y2,y4,y5=186;
    int x=250,x1,x2=600,x3;
     int[] values={46,92,65,24,10,77,33,9};
    int i=0;
    int j=values.length-1;
    public void act() 
    {    if(Greenfoot.mouseClicked(this))
       { 
           quicksort(getValues(),getI(),getJ()); }
       
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
                setI(i);
            }
            while (values[j] > pivot) {
                setJ(j);
            }
            if (i <= j) {
                 System.out.println(Arrays.toString(values));
                exchangeNumbers(i, j);
                String s=values[0]+"      "+values[1]+"     "+values[2]+"     "+values[3]+"      "+values[4]+"     "+values[5]+"     "+values[6]+"      "+values[7];
                y2=y3+85;
                  y4=y5+85;
                getWorld().addObject(new Emptyarray2(),450,y4);
                y3=y2;
                y5=y4;
                String names=" pivot: "+pivot+" i: "+i+" j: "+j +" values at i and j are swapped";
                getWorld().addObject(new Label(names,20,500,200),500,y2-45);
                getWorld().addObject(new Label(s,25,500,200),450,y2);
                setI(i);
                setJ(j);
          
            }
           
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
          { System.out.println(Arrays.toString(values));
               String s=values[0]+"      "+values[1]+"     "+values[2]+"     "+values[3]+"      "+values[4]+"     "+values[5]+"     "+values[6]+"      "+values[7];
                y2=y3+85; y4=y5+85;
                getWorld().addObject(new Emptyarray2(),450,y4);
                y3=y2;  y5=y4;
               String names=" pivot: "+pivot+" i: "+i+" j: "+j;
                getWorld().addObject(new Label(names,20,500,200),500,y2-45);
                getWorld().addObject(new Label(s,25,500,200),450,y2);
              quicksort(values,lowerIndex, getJ());
               
            }   
        if (i < higherIndex)
         {   System.out.println(Arrays.toString(values));
              String s=values[0]+"      "+values[1]+"     "+values[2]+"     "+values[3]+"      "+values[4]+"     "+values[5]+"     "+values[6]+"      "+values[7];
                y2=y3+85; y4=y5+85;
                getWorld().addObject(new Emptyarray2(),450,y4);
                y3=y2;  y5=y4;
               String names=" pivot: "+pivot+" i: "+i+" j: "+j;
               getWorld().addObject(new Label(names,20,500,200),500,y2-45);
                getWorld().addObject(new Label(s,25,500,200),450,y2);
             quicksort(values,getI(), higherIndex); 
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
{ 
    this.i=i+1;
   
   
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
{  
   this.j=j-1;
}
}
  