import java.io.*;
import java.util.Scanner;
public class Pattern1
{
public static void main(String[] args)
{
int i,j;
Scanner scanner=new Scanner(System.in);
System.out.println("Pattern: ");

for(i=1;i<=7;i++)
{
System.out.println("");
for(j=1;j<=i;j++)
{
System.out.print(j+" ");
}
}

for(i=6;i>=1;i--)
{
System.out.println("");
for(j=1;j<=i;j++)
{
System.out.print(j+" ");
}
}

}
}