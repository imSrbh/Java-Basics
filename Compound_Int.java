import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Compound_Int
{
public static void main(String args[])
{
C_int c=new C_int();
float temp=(float) (Math.pow((1+(c.r/c.n)),(c.n*c.t)));
c.A=(float) (c.P*temp);
float CI=(float) (c.A-c.P);
System.out.print("Compound Interest= "+CI);
}
}

class C_int
{
float P,A,n,t,r;
C_int()
{
P=1500;
n=4;
r= (float) (0.043);
t=6;
}
} 
