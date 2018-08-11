import java.io.*;
import java.util.Scanner;

class Copy_Constructor
{
int n;
Copy_Constructor(int y)
{
n=y;
System.out.println("Entered Value: "+n);
}

public static void main(String Args[])
{
int x;
int y;
Scanner s=new Scanner(System.in);
System.out.print("Enter a value");
y=s.nextInt();

Copy_Constructor a=new Copy_Constructor(y);
Copy_Constructor b=a;
System.out.print(b.n);

}
}
