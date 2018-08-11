import java.io.*;
import java.util.Scanner;
public class Arr_sum
{
public static void main(String args[])
{
Arr ar=new Arr();
ar.input();
System.out.println("Array's Sum: "+ar.sum);
}
}

class Arr
{
int a[]=new int[10];
int i,sum=0,n;
Scanner scanner=new Scanner(System.in);
void input()
{
System.out.println("Enter no. of elements");
n=scanner.nextInt();

System.out.println("Enter elements");
for(i=0;i<n;i++)
a[i]=scanner.nextInt();

for(i=0;i<n;i++)
sum=sum+a[i];
}
}
