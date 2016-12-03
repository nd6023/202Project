import greenfoot.*;
import java.util.List;

public class SelectionSortStepButton extends Button
{
 int[] values={46,92,65,24};
   boolean done=false;
   int i=0;
   int j=1;
   List<Obj> array;
   
    public void act() 
    {   array=getWorld().getObjects(Obj.class);
        if(Greenfoot.mouseClicked(this)&&!done)
       { 
           done=SelectionSort(getValues(),getI(),getJ());
        }
        if(Greenfoot.mouseClicked(this)&&done)
       {    String s="sorting is done";
           getWorld().addObject(new Label(s),450,450);
        }
    } 
    
    public boolean SelectionSort(int values[],int i, int j)
    {   int min=i;
        if (values[j]<values[min])
        { min=j;
          setJ(j);
           Jpointer jpoint=(Jpointer)getWorld().getObjects(Jpointer.class).get(0);
                jpoint.move(55); 
          return false;     
        }
        if(values[j]>=values[min])
        {
            setJ(j);
          //   Jpointer jpoint=(Jpointer)getWorld().getObjects(Jpointer.class).get(0);
            //    jpoint.move(55); 
                return false;
        }
        if (j==4)
        {   exchangeNumbers(min,i);
            swap (min,i);
            setI(i);
           //  Ipointer ipoint=(Ipointer)getWorld().getObjects(Ipointer.class).get(0);
             //ipoint.move(55); 
          return false;     
        }
          if (i==4)
        { return true;     
        }
        return false;
    }
    
    private void exchangeNumbers(int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        }
    
    
    public void swap(int i,int j)
    { String s= array.get(i).getNumber() +" is swapped with "+ array.get(j).getNumber();
        getWorld().addObject(new Label(s),450,300);
        Obj ob1=array.get(i);
        Obj ob2=array.get(j);
        
      int move1=ob2.getX()-ob1.getX();
              
         ob1.move(move1);
        ob2.move(-move1);
         
         Obj temp=ob1;
         ob1=ob2;
         ob2=temp;
         
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
{  if(this.j==3)
    this.j=1;
   else 
   this.j=j+1;
}
}