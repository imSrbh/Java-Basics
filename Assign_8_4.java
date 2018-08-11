import java.io.*;
import java.util.Scanner;

class Assign_8_4
{
private static int value=8;
static class Inner
{
void display()
{
System.out.print("value = "+value);
}
}

public static void main(String args[])
{
Assign_8_4.Inner obj=new Assign_8_4.Inner();
obj.display();
}

}