import java.util.Scanner;
public class Determinant
{
public static void main(String[] args)
{
int i,j;
int determinant;
int a[][]=new int[3][3];

Scanner scanner=new Scanner(System.in);

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

int p=a[0][0]*((a[1][1]*a[2][2])-(a[1][2]*a[2][1]));
int q=a[0][1]*((a[1][0]*a[2][2])-(a[1][2]*a[2][0]));
int r=a[0][2]*((a[1][0]*a[2][1])-(a[1][1]*a[2][0]));

determinant=p-q+r;

System.out.print("Determinant: "+determinant);
}
}