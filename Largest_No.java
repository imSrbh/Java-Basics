import java.util.Scanner;
public class Largest_No
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter 3 no.s: ");

float a=scanner.nextFloat();
float b=scanner.nextFloat();
float c=scanner.nextFloat();

if(a>b)
{
if(a>c)
System.out.println(a+" "+"is the largest.");
else
System.out.println(c+" "+"is the largest.");
}

else if(b>c)
{
if(b>a)
System.out.println(b+" "+"is the largest.");
else
System.out.println(a+" "+"is the largest.");
}

else System.out.println(c+" "+"is the largest.");
}
}