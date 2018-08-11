import java.io.*;
import java.util.Scanner;
public class Mat_Large_Small
{
public static void main(String[] args)
{
int i,j,temp;
int a[]=new int[10];

Scanner scanner=new Scanner(System.in);

System.out.print("Enter no. of elements: ");
int n=scanner.nextInt();

System.out.println("Enter the elements: ");
for(i=0;i<n;i++)
a[i]=scanner.nextInt();

for(i=0;i<n;i++)
for(j=i+1;j<n;j++)
{
if(a[j]>a[i])
{
temp=a[j];
a[j]=a[i];
a[i]=temp;
}
}

System.out.println("Largest no.: "+a[0]);
System.out.println("Smallest no.: "+a[n-1]);
}
}