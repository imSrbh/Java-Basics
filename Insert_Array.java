import java.io.*;
import java.util.Scanner;
public class Insert_Array
{
public static void main(String[] args)
{
int i;
int a[]=new int[20];
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the no.of elements: ");
int n=scanner.nextInt();

System.out.println("Enter the elements: ");
for(i=0;i<n;i++)
a[i]=scanner.nextInt();

System.out.println("Enter the location to insert element: ");
int loc=scanner.nextInt();

System.out.println("Enter the element to be inserted: ");
int num=scanner.nextInt();

for(i=n;i>=loc;i--)
{
a[i]=a[i-1];
}
a[loc-1]=num;

System.out.println("Array elements: ");
for(i=0;i<=n;i++)
System.out.println(a[i]+" ");
}
}

