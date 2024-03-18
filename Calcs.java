import java.util.*;
class Calculations
{
    public int add(int a,int b)
   {
       return a+b;
   }
    public double add(double a,double b)
   {
       return a+b;
   }
}
class Addition extends Calculations
{
    public int add(int a,int b)
    {
        System.out.println("Add method result in sub class");
         return a+b;
    }
    
}
public class Calcs{
public static void main(String []args)
{
    Calculations calc=new Calculations();
    System.out.println(calc.add(20,40));
    System.out.println(calc.add(40.0,10.0));
    Addition addition=new Addition();
    System.out.println(addition.add(10,20));
}
}