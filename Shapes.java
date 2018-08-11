import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Shapes
{
public static void main(String args[])
{
Circle c=new Circle();
Rect r=new Rect();
Sqr s=new Sqr();
Tri t=new Tri();

c.input();
System.out.println("Circle's Area: "+c.A_circle);
System.out.println("Circle's Perimeter: "+c.P_circle);
System.out.println("");
r.input();
System.out.println("Rectangle's Area: "+r.A_rect);
System.out.println("Rectangle's Perimeter: "+r.P_rect);
System.out.println("");
s.input();
System.out.println("Square's Area: "+s.A_sq);
System.out.println("Square's Perimeter: "+s.P_sq);
System.out.println("");
t.input();
System.out.println("Triangle's Area: "+t.A_tri);
System.out.println("Triangle's Perimeter: "+t.P_tri);
}
}

class Circle
{
int rad;
float A_circle,P_circle;
Scanner scanner=new Scanner(System.in);
void input(){
System.out.println("Enter circle's radius");
rad=scanner.nextInt();
A_circle=(float) (3.14*rad*rad);
P_circle=(float) (2*3.14*rad);
}
}

class Rect
{
int l,b;
float A_rect,P_rect;
Scanner scanner=new Scanner(System.in);
void input(){
System.out.println("Enter rectangle's length & breadth");
l=scanner.nextInt();
b=scanner.nextInt();
A_rect=(float) (l*b);
P_rect=(float) (2*(l+b));
}
}

class Sqr
{
int side;
float A_sq,P_sq;
Scanner scanner=new Scanner(System.in);
void input(){
System.out.println("Enter square's length");
side=scanner.nextInt();
A_sq=(float) (side*side);
P_sq=(float) (4*side);
}
}

class Tri
{
int s1,s2,s3;
float A_tri,P_tri;
Scanner scanner=new Scanner(System.in);
void input(){
System.out.println("Enter triangle's side lengths");
s1=scanner.nextInt();
s2=scanner.nextInt();
s3=scanner.nextInt();

float s = (s1+s2+s3)/2;
float temp=s*(s-s1)*(s-s2)*(s-s3);
A_tri= (float) Math.sqrt(temp);
P_tri=(s1+s2+s3);
}
}