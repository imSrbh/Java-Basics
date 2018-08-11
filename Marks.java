import java.io.*;
import java.util.Scanner;
public class Marks
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the marks of 5 subjects: ");

float a=scanner.nextFloat();
float b=scanner.nextFloat();
float c=scanner.nextFloat();
float d=scanner.nextFloat();
float e=scanner.nextFloat();

float total = a+b+c+d+e;
float avg = total/5;
float percentage = (total/500)*100;

System.out.println("Total Marks: "+total);
System.out.println("Average Marks: "+avg);
System.out.print("Percentage: "+percentage);
}
}