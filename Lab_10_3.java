import java.util.Scanner;

interface Shape
{
abstract void area();
}

class Circle implements Shape
{
float A_circle;
public void area()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter radius");
int r=s.nextInt();
A_circle=(float) (3.14*r*r);
}
}

class Rect implements Shape
{
float A_rect;
public void area()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter length & breadth");
int l=s.nextInt();
int b=s.nextInt();
A_rect=(float) (l*b);
}
}

public class Lab_10_3
{
public static void main(String args[])
{
Circle c=new Circle();
Rect r=new Rect();
c.area();
r.area();
System.out.println("Circle's Area: "+c.A_circle);
System.out.println("Rectangle's Area: "+r.A_rect);
}
}