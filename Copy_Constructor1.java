import java.io.*;
import java.util.Scanner;

class Copy_Constructor1
{
int n;
Copy_Constructor1(int y)
{
n=y;
System.out.println("Entered Value: "+n);
}

Copy_Constructor1(Copy_Constructor1 s)
{
this.n =s.n;
System.out.println("Entered Value: "+n);
}

public static void main(String Args[])
{
int x;
int y;
Scanner s=new Scanner(System.in);
System.out.print("Enter a value");
y=s.nextInt();

Copy_Constructor1 a=new Copy_Constructor1(y);
Copy_Constructor1 b=new Copy_Constructor1(a);
}
}
