import java.io.*;
import java.util.Scanner;
public class Fibonacci
{
public static void main(String[] args)
{
int a[]=new int[20];
a[0]=0;
a[1]=1;
int Sum=1;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the no.of terms: ");
int n=scanner.nextInt();

System.out.println("Fibonacci Series: ");
System.out.print(a[0]+" "+a[1]);

int i;
for(i=2;i<n;i++)
{
a[i]=a[i-1]+a[i-2];
Sum=Sum+a[i];
System.out.print(" "+a[i]);
}
System.out.println("");
System.out.print("Sum= "+Sum);
}
}