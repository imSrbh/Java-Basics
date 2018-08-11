import java.util.Scanner;
public class Mat_Symmetry
{
public static void main(String args[]) 
{
int i,j,count=0;

int a[][]=new int[10][10];

Scanner scanner=new Scanner(System.in);

System.out.println("Enter same no. of rows & columns: ");
int n=scanner.nextInt();

System.out.println("Enter elements: ");
for(i=0;i<3;i++)
for(j=0;j<3;j++)
a[i][j]=scanner.nextInt();

System.out.println("Entered Matrix:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}

for(i=0;i<n;i++)
for(j=0;j<n;j++)
{
if(a[i][j]==a[j][i])
count++;
}

if (count==(n*n))
System.out.print("Symmetrical");
else
System.out.print("Not Symmetrical");
}
}
