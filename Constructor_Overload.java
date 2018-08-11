import java.io.*;
import java.util.Scanner;

class Constructor_Overload
{

Constructor_Overload(int a,int b)
{
int s=a+b;
System.out.println("Integer's Sum = "+s);
}

Constructor_Overload(float a,float b)
{
float s=a+b;
System.out.println("Float Sum = "+s);
}

Constructor_Overload(double a,double b)
{
double s=a+b;
System.out.println("Double Sum = "+s);
}

Constructor_Overload(String a,String b)
{
String s=a+b;
System.out.println("String Concatenation = "+s);
}

public static void main(String Args[])
{
System.out.println("1. Integer");
System.out.println("2. Float");
System.out.println("3. Double");
System.out.println("4. String");
System.out.print("Enter Option: ");


Scanner scanner=new Scanner(System.in);
int a=scanner.nextInt();

if(a==1)
{
System.out.print("Enter Integers: ");
int x=scanner.nextInt();
int y=scanner.nextInt();
Constructor_Overload z=new Constructor_Overload(x,y);
}

else if(a==2)
{
System.out.print("Enter Floats: ");
float m=scanner.nextFloat();
float n=scanner.nextFloat();
Constructor_Overload z=new Constructor_Overload(m,n);
}

else if(a==3)
{
System.out.print("Enter Doubles: ");
double m=scanner.nextDouble();
double n=scanner.nextDouble();
Constructor_Overload z=new Constructor_Overload(m,n);
}

else
{
System.out.print("Enter Strings: ");
String m=scanner.next();
String n=scanner.next();
Constructor_Overload z=new Constructor_Overload(m,n);
}
}
}