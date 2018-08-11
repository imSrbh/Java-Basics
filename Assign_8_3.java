import java.io.*;
import java.util.Scanner;

class Assign_8_3
{
private int value=8;
class Inner
{
void display()
{
System.out.print("value = "+value);
}
}

public static void main(String args[])
{
Assign_8_3 a= new Assign_8_3();
Assign_8_3.Inner obj=a.new Inner();
obj.display();
}

}