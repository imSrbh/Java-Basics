import java.io.*;
import java.util.Scanner;


public class Marks{
public static void main(String args [])
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the marks of five subjects");

float a,b,c,d,e;
System.out.println("Enter Sub1's marks");
 a=scanner.nextFloat();
System.out.println("Enter Sub2's marks");
b=scanner.nextFloat();
System.out.println("Enter Sub3's marks");
 c=scanner.nextFloat();
System.out.println("Enter Sub4's marks");
 d=scanner.nextFloat();
System.out.println("Enter Sub5's marks");
 e=scanner.nextFloat();

float total=a+b+c+d+e;

float avg=(a+b+c+d+e)/5;

float Percentage=(total/500)*100;

System.out.println("Total Marks:" +total);
System.out.println("Average:" +avg);
System.out.println("Percentage:" +Percentage);
}
}