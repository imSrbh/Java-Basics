import java.io.*;
import java.util.Scanner;
public class Mat_Mul
{
public static void main(String[] args)
{
int i,j,k,sum;
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];

Scanner scanner=new Scanner(System.in);

System.out.println("Enter the no. of rows and columns of 1st matrix: ");
int r1=scanner.nextInt();
int c1=scanner.nextInt();

System.out.println("Enter the no. of rows and columns of 2nd matrix: ");
int r2=scanner.nextInt();
int c2=scanner.nextInt();

if(c1!=r2)
System.out.print("Invalid Entry");

else
{
System.out.println("Enter 1st matrix elements: ");
for(i=0;i<r1;i++)
for(j=0;j<c1;j++)
a[i][j]=scanner.nextInt();

System.out.println("Enter 2nd matrix elements: ");
for(i=0;i<r2;i++)
for(j=0;j<c2;j++)
b[i][j]=scanner.nextInt();

System.out.println("Matrix 1:");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}

System.out.println("Matrix 2:");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println("");
}

for(i=0;i<r1;i++)
{
System.out.println("");
for(j=0;j<c2;j++)
{
sum=0;
for(k=0;k<r2;k++)
{
sum=sum+(a[i][k]*b[k][j]);
}
System.out.print(sum+" ");
}
System.out.print(" ");
}
}
}
}