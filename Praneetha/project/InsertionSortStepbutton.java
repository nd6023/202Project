import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class InsertionSortStepbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsertionSortStepbutton extends Button
{
    /**
     * Act - do whatever the InsertionSortStepbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int[] values={46,92,65,24};
   boolean done=false,once=true;
   int i=1,k;
   int j=1; int min=0;
   List<Obj> array;
    int current=1,currentElement;
    public void act() 
    { 
        if(Greenfoot.mouseClicked(this)&&once){ array=getWorld().getObjects(Obj.class); once=false;}
        if(Greenfoot.mouseClicked(this)&&!done)
       {  List<Label> l= getWorld().getObjects(Label.class);
           getWorld().removeObjects(l);
           done=InsertionSort(getValues(),getI(),getJ());
        }
        if(Greenfoot.mouseClicked(this)&&done)
       {    String s="sorting is done";
           getWorld().addObject(new Label(s),450,450);
        }
    } 
    
    public boolean InsertionSort(int values[],int i, int j)
    {  
        if(current==values.length-1)
        {
            return true;
        }
        setCurrent(current);
        
        currentElement=values[i];
        if(currentElement>values[i-1])
        {    String s="element in place";
               getWorld().addObject(new Label(s),450,300);
               return false;
        }
        for( k=i-1;k>=0&&values[k]>currentElement;k++)
        { values[k+1]=values[k];
           //move values by 55 and change poition in array
           moveobject(k,k+1);
         
        }
         values[k+1]=currentElement;
         if(k+1<current)
         { shift(k,current-1);
            }
       return false;     
    }
      public void moveobject(int i,int j)
      {
          Obj ob1,ob2;
          ob1=array.get(i);
          ob2=array.get(j);
          ob1.setLocation(ob2.getX(),ob2.getY());
          array.set(j,ob1);
          
        }
    public int[] getValues()
{
    return this.values;
}
    
    public void setValues(int[] value)
{ for(int i=0;i<4;i++)
    this.values[i]=value[i];
   
}
public void setCurrent(int current)
{  
    this.current=current+1;
  this.i=current+1;
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
{  Jpointer jpoint=(Jpointer)getWorld().getObjects(Jpointer.class).get(0);
                
    if(this.j==4)
  {  Ipointer ipoint=(Ipointer)getWorld().getObjects(Ipointer.class).get(0);
      int x1=ipoint.getX();
      int x2=jpoint.getX();
      jpoint.setLocation(x1+50,115);
      this.j=this.i+1;}
   else 
  { this.j=j+1;
   jpoint.move(55);}}
   public void shift(int i,int j)
   {
       
    }
}
    
    
    

