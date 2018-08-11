import java.io.*;
import java.util.Scanner;
public class Duplicate_in_Array
{
public static void main(String[] args)
{
int i,j,k,c;
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
if(a[i]==a[j])
{
for(k=j;k<n;k++)
{
a[k]=a[k+1];
}
n=n-1;
}
}
}
System.out.println("Array Elements: ");
for(c=0;c<n;c++)
System.out.println(a[c]+" ");
}
}

