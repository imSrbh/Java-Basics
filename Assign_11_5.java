import java.util.Scanner;

public class Assign_11_5
{
public static void main(String args[])
{
try
{
int a=3/0;
}
catch(ArithmeticException a)
{
System.out.println(a);
}

try
{
String s="NULL";
System.out.println(s);
}
catch(NullPointerException n)
{
System.out.println(n);
}

try
{
int b[]=new int[5];
int i;
int a[]={12,14,16,18,2};

for(i=0;i<5;i++)
{
b[i]=a[i]/a[i+1];
}
}
catch(ArrayIndexOutOfBoundsException i)
{
System.out.println(i);
}

System.out.println("Exception Handled");
}
}