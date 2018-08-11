import java.util.Scanner;
abstract class Shape
{
void moveTo(String x, float y)
{
System.out.println("Area of "+x+" is "+y);
}
abstract void area(); 
}

class Circle extends Shape
{
float A_circle;
int r;
Circle()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter radius: ");
r=s.nextInt();
}
void area()
{
A_circle=(float) (3.14*r*r);
}
}

class Rectangle extends Shape
{
float A_rect;
int l,b;
Rectangle()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter length &breadth: ");
l=s.nextInt();
b=s.nextInt();
}
void area()
{
A_rect=(float) (l*b);
}
}

public class Lab10_2
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
Circle c=new Circle();
c.area();
r.area();
c.moveTo("Circle",c.A_circle);
r.moveTo("Rectangle",r.A_rect);
}
}