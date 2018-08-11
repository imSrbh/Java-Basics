import java.io.*;
import java.util.Scanner;

abstract class Vehicle_Abstract
{
abstract void no_of_wheels();
}

class Bus extends Vehicle_Abstract
{
void no_of_wheels()
{
System.out.println("Bus: 4");
}

}

class Car extends Vehicle_Abstract
{
void no_of_wheels()
{
System.out.println("Car: 4");
}
}

class Bike extends Vehicle_Abstract
{
void no_of_wheels()
{
System.out.println("Bike: 2");
}
}

class Abstract
{
public static void main(String args[])
{
Bike b=new Bike();
b.no_of_wheels();

Car c=new Car();
c.no_of_wheels();

Bus B=new Bus();
B.no_of_wheels();
}
}



