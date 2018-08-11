import java.io.*;
import java.util.Scanner;

class Car
{
static String brand_name;
String Model="Sportz";
String Name="I10";

static
{
brand_name = "Maruti";
System.out.println("Old Brand Name= "+brand_name);
}

static void New_Brand()
{
brand_name="Hyundai";
System.out.println("Updated Brand Name= "+brand_name);
}

public static void main(String args[])
{
Car c=new Car();
System.out.println("Brand Model= "+c.Model);
System.out.println("Brand Name= "+c.Name);
New_Brand();

}

}