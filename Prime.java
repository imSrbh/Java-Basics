import java.io.*;
import java.util.Scanner;
public class Prime
{
public static void main(String[] args)
{
int i,j;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the starting of range: ");
int a=scanner.nextInt();
System.out.println("Enter the end of range: ");
int b=scanner.nextInt();

System.out.println("Prime Nos. in the given range: ");
for(i=a;i<=b;i++)
{
int count=0;
for(j=1;j<=i;j++)
{
if (i%j==0)
count++;
}
if(count==2)
System.out.print(i+" ");
}
}
}