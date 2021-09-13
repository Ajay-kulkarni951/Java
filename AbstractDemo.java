package AbstractDemo.java;

abstract class Area
{
   public float Radius;
   public Area (float no)
   {
       Radius = no;
   }
   public abstract float CalculateArea();  //abstract method

   public void Display()                   //concrete method
   {
       System.out.println("Radius is : "+Radius);
   }
}
class Calculation extends Area
{
    public Calculation(float value)        // : Area(value) in C++
    {
        super(value);                      // call the parent class constructor
    }
    public float CalculateArea()           // concrete method
    {
        return 3.14f * Radius * Radius;
    }
}
public class AbstractDemo
{
    public static void main(String arg[])
    {
        // Area obj = new Area(3.5f); object creation is not allowed for abstract class
        Calculation obj = new Calculation(10.5f);
        float ret = obj.CalculateArea();
        System.out.println("Area of circle is : "+ret);

    }
}
