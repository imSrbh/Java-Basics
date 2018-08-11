import java.io.*;
import java.util.Scanner;
public class Second_Largest
{
public static void main(String[] args)
{
int i,j,temp;
int a[]=new int[20];
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the no.of elements: ");
int n=scanner.nextInt();

System.out.println("Enter the elements: ");
for(i=0;i<n;i++)
a[i]=scanner.nextInt();

for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[j]>a[i])
{
temp=a[j];
a[j]=a[i];
a[i]=temp;
}
}
}

System.out.println("2nd Largest Element: "+a[1]);
}
}

