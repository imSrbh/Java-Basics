import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Area{
public static void main(String args [])
{
Scanner scanner = new Scanner(System.in);
System.out.println(":::Computing Area of TRIANGLE Using Heron's Formula:::");

float a,b,c;
System.out.println("Please Enter Only three Sides");
System.out.println("Enter Side1");
a= scanner.nextFloat();
System.out.println("Enter Side2");
b= scanner.nextFloat();
System.out.println("Enter Side3");
c= scanner.nextFloat();

float SP=(a+b+c)/2;

float area=(float) Math.sqrt(SP*(SP-a)*(SP-b)*(SP-c));
System.out.println("Area of triangle::" + area);
  }
}