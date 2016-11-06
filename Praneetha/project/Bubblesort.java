import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bubblesort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bubblesort extends Actor
{ Obj1 obj1=new Obj1(46); Obj2 obj2=new Obj2(35); Obj3 obj3=new Obj3(67); Obj4 obj4=new Obj4(24); Obj5 obj5=new Obj5(36); Obj6 obj6=new Obj6(97);
    Obj7 obj7=new Obj7(7); Obj8 obj8=new Obj8(56); Obj9 obj9=new Obj9(72); Obj10 obj10=new Obj10(14); Obj11 obj11=new Obj11(27);
    /**
     * Act - do whatever the Bubblesort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {int[] numbers={obj1.getNumber(),obj2.getNumber(),obj3.getNumber(),obj4.getNumber(),obj5.getNumber(),obj6.getNumber(),obj7.getNumber(),obj8.getNumber(),obj9.getNumber(),obj10.getNumber(),obj11.getNumber()};
    for(int i=0;i<11;i++){
        
    System.out.println(numbers[i]);
    }
    } 
    public void sort(int[] values)
    { boolean swapped;
      int length = values.length- 1;
          do 
         { swapped = false;
        for(int i = 0; i < length; ++i) {
      if (values[i] > values[i+1]) {
        int temp = values[i];
        values[i] = values[i+1];
        values[i+1] = temp;
        swapped = true;
      }
    }
  }while(swapped == true);
  }
}   

